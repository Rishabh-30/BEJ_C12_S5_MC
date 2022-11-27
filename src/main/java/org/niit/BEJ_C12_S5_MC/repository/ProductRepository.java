package org.niit.BEJ_C12_S5_MC.repository;


import org.niit.BEJ_C12_S5_MC.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer> {
}
