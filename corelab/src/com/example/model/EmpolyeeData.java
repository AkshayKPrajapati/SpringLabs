package com.example.model;

public class EmpolyeeData {
	
	int empId;
	String empName;
	CompanyData companyData;
	
	//Constructor

	public EmpolyeeData(int empId, String empName, CompanyData companyData) {
		this.empId = empId;
		this.empName = empName;
		this.companyData = companyData;
	}
	
	
	
	public EmpolyeeData() {
	}



	//Getter and Setter
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public CompanyData getCompanyData() {
		return companyData;
	}
	public void setCompanyData(CompanyData companyData) {
		this.companyData = companyData;
	}


	// Print Value 
	@Override
	public String toString() {
		return "EmpolyeeData [empId=" + empId + ", empName=" + empName + ", companyData=" + companyData + "]";
	}
	
	
	
	
	
	 
	
}
