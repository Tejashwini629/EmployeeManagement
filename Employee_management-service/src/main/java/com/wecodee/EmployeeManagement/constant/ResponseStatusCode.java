package com.wecodee.EmployeeManagement.constant;

public enum ResponseStatusCode {
	
	SUCCESS(1), FAILED(0);

	private int status;

	ResponseStatusCode(int status) {
		this.status = status;
	}

	public int getStatus() {
		return status;
	}


}
