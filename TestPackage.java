
package TestPackage;
                  
public class TestPackage {
	            
		static String message = "Hello World!";
		static String name = "Mark Sakaberg";
		static String eat = "Brteakfast";
		String company = "Facebook coperation";
	        
public TestPackage() {
	System.out.println(company);
}		
public static void main(String[]args) {
		Welcome(message);
		Name(name);
		Eat(eat);
		TestPackage objt = new TestPackage();
	
	}             
	public static void Welcome(String m) {
		String text ="HI";
		System.out.println("Hello World!/n");
	}            
	          
	public static void Name(String n) {
		int age =32;
		System.out.println("You and Me just Friend");
	}      
	     
	public static void Eat(String e) {
		
		
		System.out.println("Food is : + e");
		
	}
}
