package mini_restaurent;

import java.util.Scanner;

public class calc extends menu {
	
	public static void main(String[] args) {
		
		calc c=new calc();
		Scanner sc=new Scanner(System.in);
		
		c.menu_details();
		System.out.println("which food do you want");
	       order = sc.nextInt();
	       
		System.out.println("how many quantitiesdo you want");
	      quantities =sc.nextInt();
	     
	    System.out.println("do you want another food");
	    
	     next = sc.nextLine();
	     
				System.out.println("which food do you want");
			      order1 = sc.nextInt();
			      
			    System.out.println("how many quantitiesdo you want");
			      quantities1 =sc.nextInt();
			      
			     c.calc();
			     c.calc1();
			   c.total();
			  
	 
	   
	}

	   
}
