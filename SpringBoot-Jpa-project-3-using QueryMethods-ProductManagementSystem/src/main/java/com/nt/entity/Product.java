package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Entity
@Table(name="product_detail")
@Data
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
public class Product 
{
	@Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prod_seq")
    @SequenceGenerator(
        name = "prod_seq",
        sequenceName = "product_sequence",  // custom DB sequence name
        initialValue = 1000,                // start from 1000
        allocationSize = 1   
)// increment by 1
private Long id;
//	@NonNull
private String name;
//	@NonNull
private String category;
//	@NonNull
private Double price;
//	@NonNull
private Integer quantity;
}
