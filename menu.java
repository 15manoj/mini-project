package mini_restaurent;

public class menu {
	static int dosa=15;
	static int puri=30;
	static int idly=10;
	static int order;
	static int order1;
	static int quantities;
	static int quantities1;
	static int c;
	static int c1;
	static String next;
	public void menu_details() {
		System.out.println("welcome to our restaurent");
		System.out.println("here is the menu");
		System.out.println("no\t\t\titem\t\t\tprice");
		System.out.println("1\t\t\tidly\t\t\t10");
		System.out.println("2\t\t\tpuri\t\t\t30");
		System.out.println("3\t\t\tdosa\t\t\t15");
	
	}
	
	public void calc() {  if(order==1) {
		 c=idly * quantities;
			System.out.println("the total idly price"+c);
			}
			else if(order==2) {
			c=puri *quantities;
				System.out.println("the total puri price"+c);
			}
			else if(order==3) {
			c=	dosa * quantities;
				System.out.println("the total dosa price"+c);
			}
	         else {
	            System.out.println("thank you");
           }
	}
	
	
	
		  public void calc1() {
				
			  if(order1==1) {
					 c1=idly * quantities1;
						System.out.println("the total idly price"+c1);
						}
						else if(order1==2) {
						c1=puri *quantities1;
							System.out.println("the total puri price"+c1);
						}
						else if(order1==3) {
						c1=	dosa * quantities1;
							System.out.println("the total dosa price"+c1);
						}
				         else {
				            System.out.println("thank you");
			              }
	}
		 public void total() {
			 int t=c+c1;
			  System.out.println("the total bill is:"+t);
		  }
	
	
		 
	

	
}
