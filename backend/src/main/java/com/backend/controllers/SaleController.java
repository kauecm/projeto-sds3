package com.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.dto.SaleDTO;
import com.backend.dto.SaleSuccessDTO;
import com.backend.dto.SaleSumDTO;
import com.backend.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService sellerService;

	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
		Page<SaleDTO> list = sellerService.findAll(pageable);
		return ResponseEntity.ok(list);

	}

	@GetMapping(value = "sumBySeller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller() {
		List<SaleSumDTO> list = sellerService.amountGroupedBySeller();
		return ResponseEntity.ok(list);

	}
	
	@GetMapping(value = "successBySeller")
	public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller() {
		List<SaleSuccessDTO> list = sellerService.successGroupedBySeller();
		return ResponseEntity.ok(list);

	}

}
