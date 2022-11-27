package org.niit.BEJ_C12_S5_MC.service;

import org.niit.BEJ_C12_S5_MC.domain.Product;
import org.niit.BEJ_C12_S5_MC.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product p){
        return productRepository.save(p);
    }

    public List <Product> getAllProduct(){
        return (List<Product>) productRepository.findAll();
    }

}
