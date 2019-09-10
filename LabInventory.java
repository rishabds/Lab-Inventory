/**
 * 
 */

import java.util.Scanner;
/**
 * @author Rishab Dussoye
 *
 */
public class LabInventory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("****************************************************");
		System.out.println("*                WELCOME TO INVENTORY              *");
		System.out.println("****************************************************");
		
		//Initializing Scanner
		Scanner myKey = new Scanner(System.in);
		
		//Constant for Password
		String password = "DitProg123";  
		
		//Declaring Variables
	    String item_ID ;
		String name ;
		String description ;
		String category;
		String supplier_Name;
		int supplier_Contact ;
		double price ;
		int available_Quantity ;
		boolean ignoreConstant1 = true;
		boolean ignoreConstant2 = true;
		
		//Stock Capacity
		System.out.println("What Is The Capacity Of Your Stock: ");
		int stockCapacity = myKey.nextInt();

		//Declaring The Array
		Item [] itemDatabase = new Item[stockCapacity];
	
		//loop
		while (ignoreConstant1 == true) {
			
				//Menu
			    System.out.println(" ");
				System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			    System.out.println("+        1.Enter A New Item To The Inventory - Requires Password      +");
			    System.out.println("+        2.Change Details Of An Existing Item - Requires Password     +");
			    System.out.println("+        3.Display All The Item With The Specific Category            +");
			    System.out.println("+        4.Display All Item To Be Re-Ordered                          +");
			    System.out.println("+        5.Number Of Item Currently In Store                          +");
			    System.out.println("+        6.Quit                                                       +");
			    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

				System.out.print("Please Enter Your Choice: ");
				int choiceNo = myKey.nextInt();
				System.out.println(" ");
				if (choiceNo == 1) {
										
				    for (int passwordcount = 0 ;passwordcount <= 3 ;passwordcount += 1) {
						System.out.print("Enter Password: ");
						String pass = myKey.next();					
						
						if (pass.equalsIgnoreCase(password)) {
							System.out.println("Please Enter The Number of Item To Add: ");
							int noOfItem = myKey.nextInt();
							Item [] itemDatabase1 = new Item[noOfItem];
							System.out.println("Enter The Attributes Of The Items: "); 
							
							for (int i=0 ; i < noOfItem ; i ++)
							{ 	
								System.out.println(" Item ID: ");
								item_ID = myKey.next();
								 
								System.out.println("Name: ");
								name = myKey.next();
								
								System.out.println("Description: ");
								description = myKey.next();
								
								System.out.println("Category");
								category = myKey.next();
								
								System.out.println("Supplier's Name: ");
								supplier_Name = myKey.next();
								
								System.out.println("Supplier's Contact: ");
								supplier_Contact = myKey.nextInt();
								
								System.out.println("Price: ");
								price  = myKey.nextDouble();
								
								System.out.println("Available Quantity: ");
								available_Quantity = myKey.nextInt();
								
								itemDatabase1[i]= new Item(item_ID, name, description, category, supplier_Name, supplier_Contact, price, available_Quantity );
								itemDatabase1[i].setItem_ID(item_ID);
								itemDatabase1[i].setName(name);
								itemDatabase1[i].setDescription(description);
								itemDatabase1[i].setCategory(category);
								itemDatabase1[i].setSupplier_Name(supplier_Name);
								itemDatabase1[i].setSupplier_Contact(supplier_Contact);
								itemDatabase1[i].setPrice(price);
								itemDatabase1[i].setAvailable_Quantity(available_Quantity);
								
								int b = Item.totalitems();
	                            itemDatabase[(b-1)]=itemDatabase1[i];
							}
							System.out.println(" ");
							
							int b = Item.totalitems();
							for (int i=0; i<b ; i++ ) {
							 System.out.println("Item ID: " + itemDatabase[i].getItem_ID());
							 System.out.println("Name: " + itemDatabase[i].getName());
							 System.out.println("Description: " + itemDatabase[i].getDescription());
							 System.out.println("Category: " + itemDatabase[i].getCategory());
							 System.out.println("Supplier's Name: " + itemDatabase[i].getSupplier_Name());
							 System.out.println("Supplier's Contact: " + itemDatabase[i].getSupplier_Contact());
							 System.out.println("Price: " + itemDatabase[i].getPrice());
							 System.out.println("Available Quantity: " + itemDatabase[i].getAvailable_Quantity());
							 
							}
							
							break;
										
						}
						else if (!password.equalsIgnoreCase(password)) {
							
							System.out.println("Incorrect password");
							System.out.println((3 - (passwordcount)) + "Attempts Left- "); 
							if (passwordcount == 2) {
					    	continue;
					       }
							else if (passwordcount == 3) {
								System.out.println("Program Detected Suspicious Activity And Terminating!");
								ignoreConstant1 = false;
								break;					
						    }
						  }
					    }   
					   
				   
				}
				
				if (choiceNo == 2) {
					
					ignoreConstant2 = true;	
				    	while (ignoreConstant2 == true) {
				    		
							System.out.print(" Password : ");
							String pass = myKey.next();
							 int i = 0 ;
						     if (!pass.equalsIgnoreCase(password) && i!=2) {
								
						    	 System.out.println("Incorrect password");
								 System.out.println((3 - (i)) + "Attempts Left- "); 
							     i++; 
							     }
						    
							  else if ((i == 2) && !pass.equalsIgnoreCase(password)) {
						    	   ignoreConstant2 = false;
						    		}			
						
				    	
							  else if (pass.equalsIgnoreCase(password)) {
									System.out.print("Enter The Item ID to Update Attributes: ");
									String updateInput = myKey.next();
									
									int b = Item.totalitems();
									for (int i1=0 ; i1 <b; i1++ ) {
											String q = itemDatabase[i1].getItem_ID();
									    if(updateInput.equalsIgnoreCase(q)) {
		
								     	     System.out.println("The Items Are: ");
									         System.out.println(itemDatabase[i1]);
									         
									// Display All User Input According Attributes
										System.out.println("Item ID : " + itemDatabase[i1].getItem_ID());
										System.out.println("Name : " + itemDatabase[i1].getName());
										System.out.println("Description : " + itemDatabase[i1].getDescription());
										System.out.println("Category : " + itemDatabase[i1].getCategory());
										System.out.println("Supplier Name : " + itemDatabase[i1].getSupplier_Name());
										System.out.println("Contact : " + itemDatabase[i1].getSupplier_Contact());
										System.out.println("Price : " + itemDatabase[i1].getPrice());
										System.out.println("Quantity : " + itemDatabase[i1].getAvailable_Quantity());
										
										System.out.println(" ");
										
									while(true) {
											System.out.println("Which Attribute You Want To Change: ");
											
											System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
											System.out.println("+       A - Change Name                   +");
											System.out.println("+       B - Change Description            +");
											System.out.println("+       C - Change Category               +");
											System.out.println("+       D - Change Supplier's Name        +");
											System.out.println("+       E - Change Supplier's Contact     +");
											System.out.println("+       F - Change Price                  +");
											System.out.println("+       G - Change Available Quantity     +");
											System.out.println("+       H - Quit                          +");
											System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
											
											
											String attributeChoice = myKey.next().toUpperCase();
											if (attributeChoice == "A" ) {
												System.out.print("Name : ");
												name= myKey.next();
												
												itemDatabase[i1].setName(name);
												System.out.println(itemDatabase[i1]);
											
											}
											else if (attributeChoice == "B" ) {
												System.out.print("Description : ");
												description = myKey.next();
												
												itemDatabase[i1].setDescription(description);
												System.out.println(itemDatabase[i1]);
												
											}
											else if (attributeChoice == "C") {
												System.out.print("Category : ");
												category = myKey.next();
												
												itemDatabase[i1].setCategory(category);
												System.out.println(itemDatabase[i1]);
												
											}
											else if (attributeChoice == "D") {
												System.out.print("Supplier Name : ");
												supplier_Name = myKey.next();
												
												itemDatabase[i1].setSupplier_Name(supplier_Name);
												System.out.println(itemDatabase[i1]);
											}
											else if(attributeChoice == "E") {
												System.out.print("Supplier Contact : ");
												supplier_Contact = myKey.nextInt();
												
												itemDatabase[i1].setSupplier_Contact(supplier_Contact);
												System.out.println(itemDatabase[i1]);
												
											}
											else if(attributeChoice == "F"){
												System.out.print("Price : ");
												price = myKey.nextDouble();
												
												itemDatabase[i1].setPrice(price);
												System.out.println(itemDatabase[i1]);										
											}
											else if(attributeChoice == "G") {
												System.out.print("Available quantity : ");
												available_Quantity = myKey.nextInt();
												
												itemDatabase[i1].setAvailable_Quantity(available_Quantity);
												System.out.println(itemDatabase[i1]);
											}
	
											else if(attributeChoice == "H"){
												ignoreConstant2 = false;
												break;
										}
										else {
											System.out.println("ONLY A-H IS ACCEPTED");
										}
									}
										 }
									}
							}
	
				    }}
			
				if (choiceNo == 3) {
					System.out.print("Enter The Category Of Item: " );
					String categoryInput = myKey.next();
					int b = Item.totalitems();
					for (int i=0; i <b; i++) {
						String ignoreVariable3 = itemDatabase[i].getCategory();
					 if(categoryInput.equalsIgnoreCase(ignoreVariable3)) {
						 System.out.println(itemDatabase[i].findItemByCat());						
					 	}
		
					}
				}
				
				if (choiceNo == 4) {
					int b = Item.totalitems();
						System.out.println("");
						System.out.println("What is the Max No of Item To Be Exposed: ");
						int maxItemExposed = myKey.nextInt();
						System.out.println("Reoredred Inventory - ");
					for (int i=0 ; i <b; i++) {
	
						if(itemDatabase[i].getAvailable_Quantity() < maxItemExposed) {		

						}
						else {
							System.out.println(itemDatabase[i]);
						}
					}
					for (int i=0 ; i <b; i++) {
						
						if(itemDatabase[i].getAvailable_Quantity() < maxItemExposed) {		
							System.out.println("");
					System.out.println("The item with the Id : "+ itemDatabase[i].getItem_ID() +" is out of Stock");
					}
					}
					
				}
				if (choiceNo == 5) {
					System.out.print("The Number of Total Item Is: ");
					Item.totalitem();
				} 
				if(choiceNo == 6) {
					System.out.println("+++++++++++++++++++++++++++++");
					System.out.println("+         THANK YOU         +");
					System.out.println("+       TERMINATING.....    +");
					System.out.println("+++++++++++++++++++++++++++++");
					ignoreConstant1 = false;
					break;
				}

}

	}
	
}
