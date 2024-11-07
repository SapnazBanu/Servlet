package com.xworkz.companyDTO;

public class CompanyDTO {
	private String companyName;
	private String productName;
	private String productType;
	private int productQuantity;
	private double ProductCost;
	
	public CompanyDTO(String companyName2, String productName2, String productType2)
	{
		
	}

	public CompanyDTO(String companyName, String productName, String productType, int productQuantity,
			double productCost) {
		super();
		this.companyName = companyName;
		this.productName = productName;
		this.productType = productType;
		this.productQuantity = productQuantity;
		this.ProductCost = productCost;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	public double getProductCost() {
		return ProductCost;
	}

	public void setProductCost(double productCost) {
		ProductCost = productCost;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(ProductCost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + productQuantity;
		result = prime * result + ((productType == null) ? 0 : productType.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompanyDTO other = (CompanyDTO) obj;
		if (Double.doubleToLongBits(ProductCost) != Double.doubleToLongBits(other.ProductCost))
			return false;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (productQuantity != other.productQuantity)
			return false;
		if (productType == null) {
			if (other.productType != null)
				return false;
		} else if (!productType.equals(other.productType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CompanyDTO [companyName=" + companyName + ", productName=" + productName + ", productType="
				+ productType + ", productQuantity=" + productQuantity + ", ProductCost=" + ProductCost + "]";
	}
	
	
}
