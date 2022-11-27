package org.niit.BEJ_C12_S5_MC.controller;

import org.niit.BEJ_C12_S5_MC.domain.Product;
import org.niit.BEJ_C12_S5_MC.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v2")
public class ProductController {

    private IProductService ProductService;

    @Autowired
    public ProductController(IProductService ProductService) {
        this.ProductService = ProductService;
    }

    @PostMapping("/saveproduct")
    public ResponseEntity<?> saveProduct(@RequestBody Product p){
        return new ResponseEntity<>(ProductService.saveProduct(p), HttpStatus.CREATED);
    }

    @GetMapping("/products")
    public ResponseEntity<?> getAllProduct(@RequestBody Product p){
        return new ResponseEntity<>(ProductService.getAllProduct(),HttpStatus.OK);
    }
}
