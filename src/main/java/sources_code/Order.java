package sources_code;

import java.util.ArrayList;
import java.util.List;

public class Order {
	static OrderParameter ordp=new OrderParameter();

	Customersteps C=new Customersteps();
	private String Categoryn;
	private int id;
	private String name;
	private String picture;
	private String description;
	private double price;
	private String material;
	private String cleaninig;
	private int quantity;
	private int ID;
	public Order(){}
	public Order(int IDn,String Categoryn,int id,String name, double price, String material,int quantity) {
    	this.setID(ID);
		this.setCategory(Categoryn);
    	this.setId(id);
    	this.setName(name);
    	this.setPrice(price) ;
    	this.setMaterial(material);
    	this.setQuantity((quantity));
    	
	}
		public List<Order> order=new ArrayList<Order>();
		public String getCategory() {
			return Categoryn;
		}
		public void setCategory(String category) {
			Categoryn = category;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPicture() {
			return picture;
		}
		public void setPicture(String picture) {
			this.picture = picture;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public int getID() {
			return ID;
		}
		public void setID(int iD) {
			ID = iD;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public String getCleaninig() {
			return cleaninig;
		}
		public void setCleaninig(String cleaninig) {
			this.cleaninig = cleaninig;
		}
		public String getMaterial() {
			return material;
		}
		public void setMaterial(String material) {
			this.material = material;
		}
		public void printorder() {
			 System.out.printf("ID: "  );
			 System.out.print( ID );
			 System.out.printf(" || Category product: %s || " , Categoryn );
			 System.out.printf("Id  product: %s || ",getId());
			 System.out.printf("Name product: %s || ",name); 
			 System.out.print("The price :  ");
			 System.out.print(price);
			 System.out.printf(" || The Material: %s  || ",material);
			 System.out.printf("|| he Quantity : ");
			 System.out.print(quantity);
			 System.out.print("\n" );

		}
}
