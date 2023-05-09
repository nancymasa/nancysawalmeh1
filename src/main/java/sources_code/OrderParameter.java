package sources_code;

public class OrderParameter {
	public int iD;
	public String category;
	public int id;
	public String name;
	public String picture;
	public String description;
	public double price;
	public String material;
	public String cleaninig;
	public int quantity;

	public OrderParameter(int iD, String category, int id2, String name, String picture, String description,
			double price, String material, String cleaninig, int quantity) {
		this.iD = iD;
		this.category = category;
		id = id2;
		this.name = name;
		this.picture = picture;
		this.description = description;
		this.price = price;
		this.material = material;
		this.cleaninig = cleaninig;
		this.quantity = quantity;
	}
}