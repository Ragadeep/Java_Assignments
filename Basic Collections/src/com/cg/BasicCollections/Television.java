package com.cg.BasicCollections;
	/**
	 * 
	 * @author ragadeep
	 * printing objects by using collections without duplicate values
	 */	
public class Television {
	private String company;							
	private String type;
	private boolean enable3D;
	private double price;

	public Television(String company, String type, boolean enable3D,
			double price) {
		super();
		this.company = company;
		this.type = type;
		this.enable3D = enable3D;
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Television other = (Television) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (Double.doubleToLongBits(price) != Double
				.doubleToLongBits(other.price))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Television [company=" + company + ", type=" + type
				+ ", Enable3D=" + enable3D + ", price=" + price + "]";
	}

}
