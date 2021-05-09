
package com.storage.mywarehouse;

import com.storage.mywarehouse.Dao.CustomerDAO;
import com.storage.mywarehouse.Entity.Customer;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public final class ClientFrame extends javax.swing.JFrame {

    private final mainframe frame;

    private DefaultTableModel tbmodel;

    private final MyObservable observable = new MyObservable();
    private List customers;

    public ClientFrame(mainframe frame, final List customers) {

        observable.addObserver(frame);

        setResizable(false);

        this.customers = customers;
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                Globals.ClientsFrame = false;
            }
        });

        this.frame = frame;
        initComponents();

        tbmodel = new DefaultTableModel(new Object[]{"Last Name", "First Name", "Occupation", "Discount"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        jTable1.setModel(tbmodel);

        refreshClients(customers);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

    public void refreshClients(List customers) {
        this.customers = customers;
        int rows = tbmodel.getRowCount();

        Collections.sort(customers, new ComparatorImpl());

        for (int i = 0; i < rows; i++) {
            tbmodel.removeRow(0);
        }
        for (Iterator it = customers.iterator(); it.hasNext();) {
            Customer customer = (Customer) it.next();
            String fname = customer.getName();
            tbmodel.addRow(new Object[]{customer.getLastName(), customer.getName(), customer.getOccupation(), customer.getDiscount()});
        }

    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        newClient = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMaximumSize(new java.awt.Dimension(508, 353));
        jPanel1.setMinimumSize(new java.awt.Dimension(508, 353));

        newClient.setText("New Customer");
        newClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newClientActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Last Name", "First Name", "Occupation", "Discount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Delete Customer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Edit Customer");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(newClient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(newClient)
                    .addComponent(jButton2))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void newClientActionPerformed(java.awt.event.ActionEvent evt) {
        clientForm clf = new clientForm(frame);
        clf.setVisible(true);
        clf.setAlwaysOnTop(true);
        clf.requestFocusInWindow();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        int row = jTable1.getSelectedRow();
        if (row != -1) {
            int sel = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this customer?", "Confirm", JOptionPane.OK_CANCEL_OPTION);
            if (sel == 0) {
                tbmodel.removeRow(row);
            }

            Customer c = (Customer) customers.get(row);
            customers.remove(c);
            CustomerDAO.delete(c);
            observable.changeData("refresh_clients");
        } else {
            JOptionPane.showMessageDialog(this, "First click on the row you want to delete.");
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        int row = jTable1.getSelectedRow();
        if (row != -1) {

            Customer c = (Customer) customers.get(row);

            clientForm clf = new clientForm(frame, c);
            clf.setVisible(true);
            clf.setAlwaysOnTop(true);
            clf.requestFocusInWindow();
        } else {
            JOptionPane.showMessageDialog(this, "First click on the row you want to update.");
        }
    }
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton newClient;

    private static class ComparatorImpl implements Comparator<Customer> {

        public ComparatorImpl() {
        }

        @Override
        public int compare(Customer o1, Customer o2) {

            return (o1.getLastName() + " " + o1.getLastName()).compareTo(o2.getLastName() + " " + o2.getLastName());
        }
    }
}
