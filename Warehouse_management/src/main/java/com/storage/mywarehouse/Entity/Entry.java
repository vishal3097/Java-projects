package com.storage.mywarehouse.Entity;

public class Entry  implements java.io.Serializable {


     private int entryId;
     private int warehouseId;
     private int productId;
     private int quantity;

    public Entry() {
    }

    public Entry(int entryId, int warehouseId, int productId, int quantity) {
       this.entryId = entryId;
       this.warehouseId = warehouseId;
       this.productId = productId;
       this.quantity = quantity;
    }

    public Entry(int warehouseId, int productId, int quantity) {
        this.warehouseId = warehouseId;
        this.productId = productId;
        this.quantity = quantity;
    }
   
    public int getEntryId() {
        return this.entryId;
    }
    
    public void setEntryId(int entryId) {
        this.entryId = entryId;
    }
    public int getWarehouseId() {
        return this.warehouseId;
    }
    
    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }
    public int getProductId() {
        return this.productId;
    }
    
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public int getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }




}


