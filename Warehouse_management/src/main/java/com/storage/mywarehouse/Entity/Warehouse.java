package com.storage.mywarehouse.Entity;

public class Warehouse  implements java.io.Serializable {


     private int warehouseId;
     private String name;

    public Warehouse() {
    }

    public Warehouse(int warehouseId, String name) {
       this.warehouseId = warehouseId;
       this.name = name;
    }

    public Warehouse(String name) {
        this.name = name;
    }

    public int getWarehouseId() {
        return this.warehouseId;
    }
    
    public void setWarehouseId(int warehouseId) {
        this.warehouseId = warehouseId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }




}


