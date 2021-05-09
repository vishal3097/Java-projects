
package com.storage.mywarehouse;

import com.storage.mywarehouse.Dao.CustomerDAO;
import com.storage.mywarehouse.Entity.Customer;

import java.awt.Component;
import javax.swing.JOptionPane;


public class clientForm extends javax.swing.JFrame {

    private final MyObservable observable = new MyObservable();
    private boolean update;
    private Customer customer;

    public clientForm(mainframe frame) {
        this.customer = new Customer();
        update = false;
        observable.addObserver(frame);
        Globals.ClientsFrame = true;

        setResizable(false);

        initComponents();
    }

    public clientForm(mainframe frame, Customer customer) {
        this.customer = customer;
        update = true;
        observable.addObserver(frame);
        Globals.ClientsFrame = true;

        setResizable(false);

        initComponents();

        clientName.setText(customer.getName());
        clientSurname.setText(customer.getLastName());
        email.setText(customer.getEmail());
        postal.setText(customer.getPostal());
        city.setText(customer.getCity());
        telephone.setText(customer.getTelephone());
        clientJob.setText(customer.getOccupation());
        discount.setText("" + customer.getDiscount());

        jButton1.setText("Update");
    }

   
    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        clientName = new javax.swing.JTextField();
        clientSurname = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        postal = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        telephone = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelPostal = new javax.swing.JLabel();
        jLabelCity = new javax.swing.JLabel();
        jLabelTelephone = new javax.swing.JLabel();
        clientJob = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        discount = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Customer Registration Form");

        jLabel30.setText("First Name");

        jLabel35.setText("Last name");

        jLabelEmail.setText("Email");

        jLabelPostal.setText("Postal");

        jLabelCity.setText("City");

        jLabelTelephone.setText("Telephone");

        jLabel38.setText("Occupation");

        jLabel62.setText("Discount percentage");

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Enter Customer Details");

        jLabel2.setText("%");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(55, 55, 55))
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(166, 166, 166))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelPostal, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelCity, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelTelephone, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel38, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(clientSurname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                    .addComponent(clientName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(postal, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(city, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(telephone, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(clientJob)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel62)
                                .addGap(18, 18, 18)
                                .addComponent(discount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30)
                    .addComponent(clientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPostal)
                    .addComponent(postal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCity)
                    .addComponent(city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelephone)
                    .addComponent(telephone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(clientSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clientJob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel38))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(discount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(34, 34, 34)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String cName = "";
        String cLastName = "";
        String cEmial = "";
        String cPostal = "";
        String cCity = "";
        String cTelephone = "";
        String full_job;
        double full_dc;

        if (clientSurname.getText().length() > 0) {
            cLastName += clientSurname.getText();
        }
        if (email.getText().length() > 0) {
            cEmial += email.getText();
        }
        if (postal.getText().length() > 0) {
            cPostal += postal.getText();
        }
        if (city.getText().length() > 0) {
            cCity += city.getText();
        }
        if (telephone.getText().length() > 0) {
            cTelephone += telephone.getText();
        }
        if (clientName.getText().length() > 0) {
            cName += clientName.getText();
        }
        if (clientJob.getText().length() > 0) {
            full_job = clientJob.getText();
        } else {
            full_job = "";
        }
        if (discount.getText().length() > 0) {
            full_dc = Double.parseDouble(discount.getText());
        } else {
            full_dc = 0.0;
        }

        customer.setName(cName);
        customer.setLastName(cLastName);
        customer.setOccupation(full_job);
        customer.setDiscount(full_dc);
        customer.setEmail(cEmial);
        customer.setPostal(cPostal);
        customer.setCity(cCity);
        customer.setTelephone(cTelephone);

        if (update) {
            CustomerDAO.update(customer);
        } else {
            CustomerDAO.save(customer);
        }

        observable.changeData("refresh_clients");
        if (update) {
            JOptionPane.showMessageDialog((Component) null, "Customer is up to date!");
        } else {
            JOptionPane.showMessageDialog((Component) null, "New customer saved!");
        }
        Globals.ClientsFrame = false;
        dispose();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        Globals.ClientsFrame = false;
        dispose();
    }

    
    private javax.swing.JTextField clientJob;
    private javax.swing.JTextField clientName;
    private javax.swing.JTextField clientSurname;
    private javax.swing.JTextField email;
    private javax.swing.JTextField postal;
    private javax.swing.JTextField city;
    private javax.swing.JTextField telephone;
    private javax.swing.JTextField discount;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelPostal;
    private javax.swing.JLabel jLabelCity;
    private javax.swing.JLabel jLabelTelephone;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JPanel jPanel1;
   
}
