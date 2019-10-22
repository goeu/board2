package org.zerock.dto;

public class PagingDTO { //data transfer 계층과 계층사이에 데이터 던질 때 사용(param 던짐)
	
	private int page;
	private int amount;
	
	public PagingDTO() {
		this.page = 1;
		this.amount = 10;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		//0일 때 아무것도 안하게
		if(page  <= 0) {
			return;
		}
		this.page = page;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "PagingDTO [page=" + page + "]";
	}
	
	
	
	
}
