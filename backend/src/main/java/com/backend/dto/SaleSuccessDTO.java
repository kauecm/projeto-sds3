package com.backend.dto;

import java.io.Serializable;

import com.backend.entites.Seller;

public class SaleSuccessDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String sellerName;

	private Long visited;

	private long deals;

	public SaleSuccessDTO() {
	}

	public SaleSuccessDTO(Seller sellerName, Long visited, long deals) {
		this.sellerName = sellerName.getName();
		this.visited = visited;
		this.deals = deals;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public long getDeals() {
		return deals;
	}

	public void setDeals(long deals) {
		this.deals = deals;
	}

}
