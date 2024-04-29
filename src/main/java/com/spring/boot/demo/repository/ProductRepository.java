package com.spring.boot.demo.repository;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.boot.demo.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	public Product findByName();
	
	Optional<Product> findById(long id);
	
	List<Product> findByNameOrDescription(String name , String description);
	
	List<Product> findByNameAndDescription(String name , String description);
	
	Product findDistinctByName(String name);
	
	List<Product> findByPriceGreaterThan(BigDecimal price);
	
	List<Product> findByPriceLessThan(BigDecimal price);
	
	List<Product> findByNameContaining(String name);
	
	List<Product> findByNameLike(String name);
	
	List<Product> findByPriceBetween(BigDecimal startPrice, BigDecimal endPrice);
	
	List<Product> findByDateCreatedBetween( Date startDate, Date endDate);
	
}
