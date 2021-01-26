package de.demmer.dennis;

public abstract class Item {
	
	
	private long id;
	
	private float price;
	
	private int storageQuantity;
	

	public Item(float price, int storageQuantity) {
		super();
		this.id = (long) (Math.random() * 31);
		this.price = price;
		this.storageQuantity = storageQuantity;		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getStorageQuantity() {
		return storageQuantity;
	}

	public void setStorageQuantity(int storageQuantity) {
		this.storageQuantity = storageQuantity;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", price=" + price + ", storageQuantity=" + storageQuantity + "]";
	}

	@Override
	public int hashCode() {
		int result = (int) price * 31;
		result = storageQuantity * result;
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
		Item other = (Item) obj;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		if (storageQuantity != other.storageQuantity)
			return false;
		return true;
	}
	
	
	
	

	
	

}
