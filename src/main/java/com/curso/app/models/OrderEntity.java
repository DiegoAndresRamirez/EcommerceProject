package com.curso.app.models;

import jakarta.persistence.*;

import java.sql.Date;


@Entity
@Table(name = "OrderEntity")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String number;
    private Date creationDate;
    private Date receiveDate;
    private double total;

    @ManyToOne
    private UserEntity user;

    @OneToOne(mappedBy = "order")
    private OrderDetailEntity orderDetail;

    public OrderEntity() {
    }

    public OrderEntity(Integer id, String number, Date creationDate, Date receiveDate, double total) {
        this.id = id;
        this.number = number;
        this.creationDate = creationDate;
        this.receiveDate = receiveDate;
        this.total = total;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(Date receiveDate) {
        this.receiveDate = receiveDate;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public OrderDetailEntity getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(OrderDetailEntity orderDetail) {
        this.orderDetail = orderDetail;
    }

    @Override
    public String toString() {
        return "OrderEntity{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", creationDate=" + creationDate +
                ", receiveDate=" + receiveDate +
                ", total=" + total +
                '}';
    }
}
