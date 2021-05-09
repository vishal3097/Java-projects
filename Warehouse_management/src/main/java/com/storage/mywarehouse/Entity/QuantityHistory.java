package com.storage.mywarehouse.Entity;

import java.util.Date;





public class QuantityHistory  implements java.io.Serializable {


     private Integer id;
     private Integer wareHouseEntryId;
     private Integer quantity;
     private Date date;

    public QuantityHistory() {
    }

	
    public QuantityHistory(Integer id) {
        this.id = id;
    }
    public QuantityHistory(Integer id, Integer wareHouseEntryId, Integer quantity, Date date) {
       this.id = id;
       this.wareHouseEntryId = wareHouseEntryId;
       this.quantity = quantity;
       this.date = date;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getWareHouseEntryId() {
        return this.wareHouseEntryId;
    }
    
    public void setWareHouseEntryId(Integer wareHouseEntryId) {
        this.wareHouseEntryId = wareHouseEntryId;
    }
    public Integer getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }




}


