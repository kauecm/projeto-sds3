package com.backend.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.dto.SellerDTO;
import com.backend.entites.Seller;
import com.backend.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll() {
		
		List<Seller> listSeller = repository.findAll();
		return listSeller.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
	
	
	public Seller findById(Long id) {
		Seller seller = repository.getById(id);
		return seller;
	}
}
