package com.curso.app.services;

import com.curso.app.models.ProductEntity;

import java.util.Optional;

public interface ProductService {
    public ProductEntity save(ProductEntity product);
    public Optional<ProductEntity> getById(Integer id);
    public void update(ProductEntity product);
    public void delete(Integer id);
}
