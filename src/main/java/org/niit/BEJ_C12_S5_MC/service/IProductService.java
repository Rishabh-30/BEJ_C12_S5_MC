package org.niit.BEJ_C12_S5_MC.service;

import org.niit.BEJ_C12_S5_MC.domain.Product;

import java.util.List;

public interface IProductService {
    public Product saveProduct(Product p);

    public List<Product> getAllProduct();
}
