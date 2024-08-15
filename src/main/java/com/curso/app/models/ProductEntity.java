package com.curso.app.models;

public class ProductEntity {
    private Integer id;
    private String name;
    private String description;
    private String imagen;
    private double price;
    private int quantity;

    public ProductEntity() {
    }

    public ProductEntity(Integer id, String name, String description, String imagen, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.imagen = imagen;
        this.price = price;
        this.quantity = quantity;
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

    @Override
    public String toString() {
        return "ProductEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", imagen='" + imagen + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
