package de.demmer.dennis;

public class Jacke extends Item{
	
	private String description;
	private String name;
	

	public Jacke(float price, int storageQuantity, String description, String name) {
		super(price, storageQuantity);
		this.description = description;
		this.name = name;
	}
	

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public int hashCode() {
		int result = super.hashCode();
		
		int hashCodeDesc = 0;
		for (char c : description.toCharArray()) {
			hashCodeDesc = hashCodeDesc + c;
		}
		
		result =  hashCodeDesc * result;
		
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		
//		if (!super.equals(obj))
//			return false;
		
		
		if (getClass() != obj.getClass())
			return false;
	
		Jacke other = (Jacke) obj;

		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		
		
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		

		return true;
	}


	@Override
	public String toString() {
		return "Jacke [description=" + description + ", name=" + name + ", getId()=" + getId() + ", getPrice()="
				+ getPrice() + ", getStorageQuantity()=" + getStorageQuantity() + "]";
	}
	
	
	
	

}
