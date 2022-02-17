package com.bank.service;

import com.bank.entity.Account;
import com.bank.model.Authorities;
import com.bank.model.Customer;
import com.bank.model.Product;
import com.bank.model.Signatories;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IAccountService {
	
	Mono<Account> findByIdClient(String idclient);
	
	Flux<Account> findByAll();
	
	Mono<Account> findById(String idclient);
	
	Mono<Void> deleteById(String id);
	
	
	
	
	Mono<Account> create(String idcustomer, String idproduct,Authorities authorities);
	
	
	
	//Metodos para obtener registros de otras entidades
	
	Mono<Product> findByUrlIdProduct(String idproduct);	
	Mono<Customer> findByUrlIdCustomer(String identerprise);
}
