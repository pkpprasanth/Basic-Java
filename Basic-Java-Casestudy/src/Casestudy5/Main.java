package Casestudy5;

import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;  
public class Main {
	public static int x=1,y=1;
	 public static String date1,date2;  
	     public static String[] c=new String[25];  
		public static int booked[]=new int[25];
		public static int dates[]=new int[25];
		
		public static void main(String[] args) throws ParseException {
			
			 
			  int i=1;
			  String NO;
			  Scanner sc=new Scanner(System.in);
			  //reg.
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
			  System.out.println("Thank you for registaring, your  proof ID is "+i+"...");
			  System.out.println("Do you want to book a room(yes/no)");
			  NO=sc.next();
			  if(NO.equals("yes")==true)
			  {
				  switch(NO)
					{
					case "yes":
						book();
					    break;
					case "exit":
						System.exit(0);
						break;
					}
			  }
			  
			  i++;
			  }
			  
			  while(NO.equals("yes")==true);
		System.out.println("Veiw all bookings");
		status();
		}

		private static void status() throws ParseException 
		{
			// TODO Auto-generated method stub
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the Start date");
			int  start= sc.nextInt();
			System.out.println("Enter the end date");
			 int end =sc.nextInt();
			// System.out.println(x);
			 for(int w=1;w<=x;w++)
			 {
				 for(int l=1;l<=x;l++)
				 {
					 if(dates[l]==start)
					 {
						 
						 System.out.println(l);
						 System.out.println(c[l]);	

					 }
										 
				 }
				 start=start+1;
				 System.out.println(start);

			 }
		}

		private static void book() throws ParseException
		{
			String ac;
			String cot;
			String cable;
			String wifi;
			String laundry;
			Scanner sc= new Scanner(System.in);
			int total,b=0,c,d,e,f;
			// TODO Auto-generated method stub
			System.out.println("Booking");
			System.out.println("Please choose the service required.");
			System.out.println("AC/non-AC(AC/nAC)");
			
			ac=sc.next();
			if (ac.equals("AC")==true)
			{
				b=1500;
			}
			else 		
			{
				b=700;
			}
			
			System.out.println("Cot(Single/Double)");
			cot=sc.next();
			if (cot.equals("Single")==true)
			{
				c=50;
			}
			else 
			{
				c=100;
			}
			
			System.out.println("With cable connection/without cable connection(C/nC)");
			cable=sc.next();
			if (cable.equals("C")==true)
			{
				d=50;
			}
			else
			{
				d=0;
			}
			
			System.out.println("wifi needed or not(W/nW)");
			wifi=sc.next();
			if (wifi.equals("W")==true)
			{
				e=150;
			}
			else
			{
				e=0;
			}
			System.out.println("laundry service needed or not(L/nL)");
			laundry=sc.next();
			if (laundry.equals("L")==true)
			{
				f=300;
			}
			else 
			{
				f=0;
			}
			System.out.println("Enter you date of booking");
			dates[y]=sc.nextInt();
			y=y+1;
			total=b+c+d+e+f;
			System.out.println("The total charge is Rs."+total);
			System.out.println("The services chosen are ");
			if(b==1500)
			{
			System.out.println("AC");
			}
			else 
			{
				System.out.println("non-AC");
			}
			
			if(c==50)
			{
				System.out.println("Single cot");
			}
			else {
				System.out.println("double cot");
			}
			if(d!=0)
			{
				System.out.println("Cable connection enabled");
			}
			else
			{
					System.out.println("Cable connection not enabled");
			}
			if(e!=0)
			{
				System.out.println("Wifi enabled");
			}
			else
			{
					System.out.println("Wifi not enabled");	
			}
			if(f!=0)
			{
				System.out.println("with laundry services");
			}
			else
			{
				System.out.println("without laundry services");
			}
			System.out.println("Do you want to proceed");
			String proceed=sc.next();
			if(proceed.equals("yes")==true)
			{
				booked[x]=1;
				System.out.println("Thank you your room number is"+x);
				x=x+1;
			}
			System.out.println("Do you want to continue registration?(yes/no)");
			String mn=sc.next();
			if(mn.equals("no")==true)
			{
				status();
			}
			
		}

	}