package bookdatabase;

public class Books {
	String sku;
	String title;
	String auth; //author
	String descr; // description
	double price;
	 
	
	public void setSKU (String sku) {
		this.sku = sku;		
	}
	
	public String getSKU() {
		return sku;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setAuth(String auth) {
		this.auth = auth;
	}
	
	public String getAuth() {
		return auth;
	}
	
	public void setDescr(String descr) {
		this.descr = descr;
	}
	
	public String getDescr() {
		return descr;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Double getPrice() {
		return price;
	}
	
	

}
