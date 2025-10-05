package com.nt.runner;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Product;
import com.nt.repository.IProductRepository;

@Component
public class ProdRunner implements CommandLineRunner {

    @Autowired
    private IProductRepository repo;

    @Override
    public void run(String... args) throws Exception {
       /* try {
            List<Product> products = repo.showEmployeelist();
            products.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }*/
    	
    /*	try {

        	List<Product> showProductByName = repo.showProductByName("shanya");
        	showProductByName.forEach(System.out::println);
		} 
    	catch (Exception e) 
    	{
			e.printStackTrace();
		}*/
    	
    /*	try 
    	{
		List<Product> showProductsByprice = repo.showProductsByprice(7000.0, 90000.0);	
		showProductsByprice.forEach(System.out::println);
		} 
    	catch (Exception e) 
    	{
			e.printStackTrace();
		}*/
    	/*try {
    		List<Product> showlistbyQuantity = repo.showlistbyQuantity(2, 100);
    		showlistbyQuantity.forEach(System.out::println);
    		long count = showlistbyQuantity.stream().count();
    		System.out.println(count);
    	}
    	catch (Exception e) {
			e.printStackTrace();
		}*/
    	
    /*	try {
			List<Product> showProductBycategory = repo.showProductBycategory("furniture");
			showProductBycategory.forEach(System.out::println);
			long count = showProductBycategory.stream().count();
			System.out.println(count);
		} 
    	catch (Exception e) 
    	{
    		e.printStackTrace();// TODO: handle exception
		}*/
    	
    /*	try
    	{
    		Double price=repo.showSingleProductByCategory("plastic");
        	System.out.println(price);
			
		} catch (Exception e)
    	{
			e.printStackTrace();
		}*/
    	
    	
    /*	try {
    		List<Object[]> showListOFpriceAndCategory = repo.showListOFpriceAndCategory("shanya");
    		showListOFpriceAndCategory.forEach(row->System.out.println(Arrays.toString(row)));
    	}
    	catch (Exception e) {
			e.printStackTrace();
			
			System.out.println("========================================================");
		}
    	try {
    		List<String> showNamesByprice = repo.showNamesByprice(7000.0, 90000.0);
    		long count = showNamesByprice.stream().count();
    		showNamesByprice.forEach(System.out::println);
    		System.out.println(count);
    	}
    	catch (Exception e) {
			e.printStackTrace();
		}*/
    	
    /*	try {
    		List<Object[]> showNamesAndPrice = repo.showNamesAndPrice("furniture");
    		showNamesAndPrice.forEach(obj->System.out.println(Arrays.toString(obj)));
    	}
    	catch (Exception e) 
    		{
				e.printStackTrace();
				System.out.println("======================================================");
			}
    	
    	try {
    		List<Double> showPriceByCategory = repo.showPriceByCategory("furniture");
    		showPriceByCategory.forEach(System.out::println);
    	}
    	catch (Exception e)
    	{
			e.printStackTrace();
		}*/
    	
    /*	try {
    		long fetchProductCount = repo.fetchProductCount();
    		System.out.println(fetchProductCount);
    	}
    	catch (Exception e) {
			e.printStackTrace();
		}*/
    	
    	
   /* 	try {
    		Double showAveragePrice = repo.showAveragePrice();
    		System.out.println(showAveragePrice);
    	}
    	catch (Exception e) 
    	{
			e.printStackTrace();
		}
    	}*/
    	try {
    		Integer updatePriceByCategory = repo.updatePriceByCategory("furniture", 0.5);
    		System.out.println(updatePriceByCategory);
    	}
    	catch (Exception e) {
			e.printStackTrace();
		}
    	
    }
}

