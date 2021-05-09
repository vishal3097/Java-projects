package com.storage.mywarehouse.Entity;

public class Column  implements java.io.Serializable {


     private int columnId;
     private String name;

    public Column() {
    }

    public Column(int columnId, String name) {
       this.columnId = columnId;
       this.name = name;
    }
   
    public int getColumnId() {
        return this.columnId;
    }
    
    public void setColumnId(int columnId) {
        this.columnId = columnId;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }




}


