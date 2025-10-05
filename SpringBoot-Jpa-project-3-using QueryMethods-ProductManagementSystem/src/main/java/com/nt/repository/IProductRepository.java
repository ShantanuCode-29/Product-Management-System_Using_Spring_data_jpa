package com.nt.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nt.entity.Product;

import jakarta.transaction.Transactional;

public interface IProductRepository extends JpaRepository<Product, Long>
{
	@Query("from Product")
	public List<Product>showEmployeelist();
	
	@Query("from Product where name=?1")
	public List<Product>showProductByName(String name);
	
	@Query("from Product where price >= ?1 and price <= ?2")
	List<Product> showProductsByprice(double start, double end);
	
	@Query("from Product where quantity>=:min and quantity<=:max")
	List<Product>showlistbyQuantity(@Param("min")Integer start,@Param("max")Integer end);
	
	@Query("from Product where lower(category)=lower(:choice)")
	public List<Product> showProductBycategory(String choice);
	
	@Query("select price from Product where category=:cat")
	public Double showSingleProductByCategory(String cat);
     
	@Query("select price,category from Product where name=:name")
	public List<Object[]>showListOFpriceAndCategory(String name);
	
	@Query("select name from Product where price between :start and :end")
	public List<String> showNamesByprice(Double start,Double end);
	
	@Query("select name,price from Product where category=:cat")
	public List<Object[]>showNamesAndPrice(String cat);
	
	@Query("select price from Product where category=:category")
	public List<Double>showPriceByCategory(String category);
    
	@Query("select count(distinct name)from Product")
	public long fetchProductCount();
	
	@Query("select avg(price)from Product")
	public Double showAveragePrice();
	
	@Transactional
	@Modifying
	@Query("update Product set price=price+(price*:per/100)  where category=:category")
	public Integer updatePriceByCategory(String category,Double per);
	
}
