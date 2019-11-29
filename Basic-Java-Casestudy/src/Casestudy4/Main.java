package Casestudy4;
import java.util.Scanner;

public class Main {
	public static Scanner sc=new Scanner(System.in);
  public static void main (String[] args)
  {
	  String[] c=new String[25];  
	  int i=1;
	  String NO;
	  do {
	  System.out.println("Registration");
	  System.out.println("Enter your name");
	  c[i]=sc.next();
	  System.out.println("Enter your address ");
	  String address=sc.next();
	  System.out.println("Enter your contact number");
	  String Cn=sc.next();
	  System.out.println("E-Mail ID");
	  String mail=sc.next();
	  System.out.println("Enter proof type");
	  String Ptype=sc.next();
	  System.out.println("Enter proof ID");
	  String Pid=sc.next();
	  System.out.println("Do you want to continue registration(yes/no)");
	   NO=sc.next(); 
	   if(NO.equals("yes")==true)
	   {
		   System.out.println("Thank you for registaring, your  proof ID is "+i+"...");
	   }
	  i++;
	  }
	  while(NO.equals("yes")==true);
	  
		  System.out.println("Customer ID  Customer Name");
	  for(int k=1;k<i;k++)
	  {
		  System.out.println( k+"            "+c[k]);
	  }
				 
	
  
  }

}

