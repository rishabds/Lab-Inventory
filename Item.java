/**
 * 
 */

/**
 * @author Rishab Dussoye
 *
 */
public class Item {
	
	private String item_ID;
	private String name;
	private String description;
	private String category;
	private String supplier_Name;
	private int supplier_Contact;
	private double price;
	private int available_Quantity;
	static int totalItems = 0;
	
	// Constructor
	
	/**
	 * Default Constructor
	 */
	public Item() {
		
	}
	
	/**
	 * 8 Overloaded Consstructor 
	 * @param item_ID of the Item
	 * @param name of the Item
	 * @param description of the Item
	 * @param category of the Item
	 * @param supplier_Name of the Item
	 * @param supplier_Contact of the Item
	 * @param price of the Item
	 * @param available_Quantitiy of the Item
	 */
	public Item(String item_ID,String name,String description,String category,String supplier_Name,
			int supplier_Contact,double price,int available_Quantity) {
		
		this.item_ID = item_ID;
		this.name = name;
		this.description = description;
		this.category = category;
		this.supplier_Name = supplier_Name;
		this.supplier_Contact = supplier_Contact;
		this.price = price;
		this.available_Quantity = available_Quantity;
		totalItems++;
			
	}
	
	// Getters

	/**
	 * @return the item_ID
	 */
	public String getItem_ID() {
		return item_ID;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @return the supplier_Name
	 */
	public String getSupplier_Name() {
		return supplier_Name;
	}

	/**
	 * @return the supplier_Contact
	 */
	public int getSupplier_Contact() {
		return supplier_Contact;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @return the available_Quantity
	 */
	public int getAvailable_Quantity() {
		return available_Quantity;
	}

	// Setters
	
	/**
	 * @param item_ID the item_ID to set
	 */
	public void setItem_ID(String item_ID) {
		this.item_ID = item_ID;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @param supplier_Name the supplier_Name to set
	 */
	public void setSupplier_Name(String supplier_Name) {
		this.supplier_Name = supplier_Name;
	}

	/**
	 * @param supplier_Contact the supplier_Contact to set
	 */
	public void setSupplier_Contact(int supplier_Contact) {
		this.supplier_Contact = supplier_Contact;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @param available_Quantity the available_Quantity to set
	 */
	public void setAvailable_Quantity(int available_Quantity) {
		this.available_Quantity = available_Quantity;
	}
	
	// Equals Method
		public boolean equals(Item i) {
			if (this.item_ID.equalsIgnoreCase(i.item_ID))return true;
			else return false;		
		}
	
	//toString Method

	@Override
	public String toString() {
		return "Item [item_ID=" + item_ID + ", name=" + name + ", description=" + description + ", category=" + category
				+ ", supplier_Name=" + supplier_Name + ", supplier_Contact=" + supplier_Contact + ", price=" + price
				+ ", available_Quantity=" + available_Quantity + "]";
	}
	
	public String findItemByCat() {
		return(this.item_ID + "  " + this.name+ "  " + this.description + "  " + this.supplier_Name + "  "+ this.supplier_Contact+ "  " + this.price+ "  " + this.available_Quantity);
	}
	public static void totalitem() {
		System.out.println(totalItems);
		}
		public static int totalitems() {
			return totalItems;
		}
	
	

}
