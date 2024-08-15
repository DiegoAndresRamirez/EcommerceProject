package com.curso.app.models;

import jakarta.persistence.*;

@Entity
@Table(name = "ProductEntity")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private String imagen;
    private double price;
    private int quantity;

    @ManyToOne
    private UserEntity user;


    public ProductEntity() {
    }

    public ProductEntity(Integer id, String name, String description, String imagen, double price, int quantity, UserEntity user) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imagen = imagen;
        this.price = price;
        this.quantity = quantity;
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "ProductEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", imagen='" + imagen + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", user=" + user +
                '}';
    }
}
