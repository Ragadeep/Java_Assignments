package com.cg.BasicCollections;

public class School {
	private String schoolName;
	private String city;
	private String district;
	private int schoolRanking;

	public School(String schoolName, String city, String district,
			int schoolRanking) {
		super();
		this.schoolName = schoolName;
		this.city = city;
		this.district = district;
		this.schoolRanking = schoolRanking;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result
				+ ((district == null) ? 0 : district.hashCode());
		result = prime * result
				+ ((schoolName == null) ? 0 : schoolName.hashCode());
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
		School other = (School) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (district == null) {
			if (other.district != null)
				return false;
		} else if (!district.equals(other.district))
			return false;
		if (schoolName == null) {
			if (other.schoolName != null)
				return false;
		} else if (!schoolName.equals(other.schoolName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "School [schoolName=" + schoolName + ", city=" + city
				+ ", district=" + district + ", schoolRanking=" + schoolRanking
				+ "]";
	}

}
