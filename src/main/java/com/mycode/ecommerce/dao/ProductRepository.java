package com.mycode.ecommerce.dao;

import com.mycode.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;



//add this annotation to intigrate angular and springboot
@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {

    Page<Product> findByCategoryId(@RequestParam("id") Long id, Pageable pageable);

    //    behind the scene this will work as "SELECT * FROM Product p WHERE p.name LIKE CONCAT('%' , :name , '%')
    Page<Product> findByNameContaining(@RequestParam("name") String name, Pageable pageable);

}
