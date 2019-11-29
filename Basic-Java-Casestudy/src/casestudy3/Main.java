package casestudy3;

import java.util.Scanner;

public class Main {
	public static int room[] = new int[26];
	    public static void main(String args[])
	    {
		 Scanner sc=new Scanner(System.in);
		  
		 for(int j=1;j<25;j++)
		 {room[j]=0;}
		 int a,s,c,w,l,total=0,i=0;
		 String ac,cot,cable,wifi,laundry,ans;
	      int k;
	      do
	      {System.out.println("MENU\n1. Book\n2. Check Status\n3. Exit\nEnter your choice");
	 	    int n =sc.nextInt() ;
	 	   sc.nextLine();
	          switch (n) 
	          { 
	          case 1: 
	        	  System.out.println("Booking:");
	        	  room[i]=1;
	        	  i++;
	        	  System.out.println("Please choose the services required.\nAC/non-AC(AC/nAC)");
	        	  ac=sc.nextLine();
	        	  if(ac.compareTo("ac")==0);
	        	  total=total+500;
	        	  System.out.println ("Cot(Single/Double)");
	        	  cot=sc.nextLine();
	        	  if(cot.equalsIgnoreCase("single"))
	        		  total=total+350;
	        	  else
	        		  total=total+500;
	        	  System.out.println(" With cable connection/without cable connection(C/nC)");
	        	  cable=sc.nextLine();
	        	  if(cable.equalsIgnoreCase("c"))
	        		  total=total+100;
	        	  System.out.println("Wi-Fi needed or not(W/nW)");
	        	  wifi=sc.nextLine();
	        	  if(wifi.equalsIgnoreCase("w"))
	        		  total=total+100;
	        	  System.out.println("Laundry service needed or not(L/nL)");
	        	  laundry=sc.nextLine();
	        	  System.out.println("Your total charge is : "+total);
	        	  System.out.println("The services chosen are");
	        	  if(laundry.equalsIgnoreCase("l"))
	        		  total=total+500;
	        	  
	              System.out.println(cot+" cot "+ac+" room");
	              if(cable.compareTo("c")==0)
	            	  System.out.println("Cable connection enabled");
	              else
	            	  System.out.println("Cable connection disabled");
	              if(wifi.compareTo("w")==0)
	            	  System.out.println("Wi-Fi enabled");
	              else
	            	  System.out.println("Wi-Fi disabled");
	              if(laundry.compareTo("l")==0)
	            	  System.out.println("with laundry service");
	              else
	            	  System.out.println("with out laundry service");
	              total=0;
	              System.out.println("Thank you for booking. Your room number is "+i+".");
	              break; 
	          case 2: 
	        	  System.out.println( "Check Status:"); 
	        	  System.out.println("Enter room number");
	        	  a=sc.nextInt();
	        	      CheckStatus(a);
	        	      sc.nextLine();
	        	  break; 
	          case 3: 
	        	  System.exit(0);
	     
	          default: 
	        	  System.out.println("Invalid day"); 
	        	  break; 
	     } 
	     System.out.println("Do you want to continue? (yes/no)");
	     ans=sc.nextLine();
	     
	     
	      } 
		  while(ans.equalsIgnoreCase("yes"));
	    }
	    
	
	public static void CheckStatus(int a)
	{
		if(room[a]==1)
			System.out.println("Room number "+a+" is booked.");
		else
			System.out.println("Room number "+a+" is  available.");
		
			
	}
}

