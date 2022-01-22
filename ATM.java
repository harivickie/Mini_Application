import java.util.*;
import java.text.*;
public class ATM {
	static int c22,c5,c2,c1;
	static int u22,u5,u2,u1,utot;

	public static void main(String[] args) {
		display();
	}
	public static void display() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to ATM.....Please Select your ROLE...");
		System.out.println();
		System.out.println(" 1. ADMIN");
		System.out.println(" 2. USER");
		System.out.println(" 3. EXIT");
		int n = sc.nextInt();
		switch(n)
		{
		case 1:
		{
			Admin();
			break;
		}
		case 2:
		{
			User();
			break;
		}
		case 3:
		{
			Exit();
			break;
		}
		default:
		{
			System.out.println("\n\n Enter a valid Option...");
		}
		
		
		}
	}

	private static void Exit() {
		System.out.println("\n\n Thank You....");
		
	}

	private static void User() {
		Scanner sc= new Scanner(System.in);
		System.out.println("\n Welcome USER...Please SignIn to Proceed... ");
		String u_name,u_pass;
		System.out.println("\n\n Enter your USER NAME : ");
		u_name = sc.nextLine();
		System.out.println("\n\n Enter your PASSWORD : ");
		u_pass = sc.nextLine();
		if(u_pass.equals(null))
		{
			
		}else
		{
			User_Display();
		}
		
		
	}

	private static void User_Display() {
		Scanner sc = new Scanner(System.in);
		int c_2000=0,c_500=0,c_200=0,c_100=0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("\n\n Welcome to USER PANEL ");
		System.out.println("\n\n 1. Deposit Money ");
		System.out.println("\n 2. Check Balance");
		System.out.println("\n 3. Widhdraw Money ");
		System.out.println("\n 4. Mini Statement ");
		System.out.println("\n 5. Change Pin ");
		System.out.println("\n 6. Back");
		int c = sc.nextInt();
		switch(c)
		{
			case 1:
			{
				System.out.println("\n\n Enter 2000 count : ");
				c_2000 = sc.nextInt();u22 = c_2000;
				System.out.println("\n Enter 500 count : ");
				c_500 = sc.nextInt();u5 = c_500;
				System.out.println("\n Enter 200 count : ");
				c_200 = sc.nextInt();u2 = c_200;
				System.out.println("\n Enter 100 count : ");
				c_100 = sc.nextInt();u1 = c_100;
				User_Display();
			}
			case 2:
			{
				int tot = ((u22*2000)+(u5*500)+(u2*200)+(u1*100));
				utot = tot;
				System.out.println("\n\n Total Balance is = " + ((u22*2000)+(u5*500)+(u2*200)+(u1*100)));
				User_Display();
			}
			case 3:
			{
				System.out.println("\n\n Enter the amount to Withdraw : ");int w = sc.nextInt();
				list.add(w);
				if(w<utot) {
				System.out.println("\n\n Balance After Withdraw is : " + (utot-w));
				}
				else
				{
					System.out.println("Insufficient Balance...!");
				}
			}
			case 4:
			{
				System.out.println("\n\n Your Statement is...");
				for(int i=list.size()-1;i>0;i--)
				{
					System.out.println("You have withdrawn " + list.get(i) + "rs");
				}
			}
			case 5:
			{
				String old,n_pin;
				System.out.println("Enter your old PIN : ");
				old = sc.nextLine();
				System.out.println("\n Enter your new PIN : ");
				n_pin = sc.nextLine();
				System.out.println("\n\n ---Your PIN has Successfully Changed---");
			}
			case 6:
			{
				display();
			}
		}
		
	}
	private static void Admin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n Welcome ADMIN...Please SignIn to Proceed...");
		String a_name,a_pass;
		System.out.println("\n\n Enter your USER NAME : ");
		a_name = sc.nextLine();
		System.out.println("\n\n Enter your PASSWORD : ");
		a_pass = sc.nextLine();
		if(a_pass.equals(null))
		{
			
		}else
		{
			Admin_Display();
		}
		
	}
	
	public static void Admin_Display()
	{
		Scanner sc = new Scanner(System.in);
		int c_2000=0,c_500=0,c_200=0,c_100=0;
		System.out.println("\n Welcome to ADMIN PANEL");
		System.out.println("\n\n 1. Deposit Money in ATM");
		System.out.println(" 2. Check Balance in ATM");
		System.out.println(" 3. Back");
		int c = sc.nextInt();
		switch(c)
		{
		case 1:
		{
			
			System.out.println("\n\n Enter 2000 count : ");
			c_2000 = sc.nextInt();c22 = c_2000;
			System.out.println("\n Enter 500 count : ");
			c_500 = sc.nextInt();c5 = c_500;
			System.out.println("\n Enter 200 count : ");
			c_200 = sc.nextInt();c2 = c_200;
			System.out.println("\n Enter 100 count : ");
			c_100 = sc.nextInt();c1 = c_100;
			Admin_Display();
		}
		case 2:
		{
			System.out.println("\n\n Available Balance Under ");
			System.out.println("\n\n 2000rs is " + c22*2000);
			System.out.println(" 500rs is " + c5*500);
			System.out.println("200rs is " + c2*200);
			System.out.println("100rs is " + c1*100);
			System.out.println("\n\n Total Balance is = " + ((c22*2000)+(c5*500)+(c2*200)+(c1*100)));
			Admin_Display();
			
		}
		case 3:
		{
			display();
		}
		default:
			System.out.println("Enter the valid Option...");
		}
		
	}
	

}