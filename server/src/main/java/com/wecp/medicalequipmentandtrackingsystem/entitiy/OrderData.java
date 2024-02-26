package com.wecp.medicalequipmentandtrackingsystem.entitiy;


import javax.persistence.*;

import java.sql.Date;



public class OrderData {

    
    private Long id;

    private Date orderDate;     
    private String status;
    private int quantity;

  
    private Equipment equipment;
    

    public OrderData() {
    }
    
   

    public OrderData(Equipment equipment) {
        this.equipment = equipment;
    }



    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Date getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    public Equipment getEquipment() {
        return equipment;
    }



    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    
    
}
