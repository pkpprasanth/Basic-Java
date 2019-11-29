package casestudy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static int booked[]=new int[25];

	public static void main(String[] args) {
		int a;
		do
		{
		System.out.println("1.Book");
		System.out.println("2.Check Status");
		System.out.println("3.exit");
		System.out.println("Enter your choice");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		sc.nextLine();	
		switch(a)
		{
		case 1:
			book();
			break;
		case 2:
			status();
			
			break;
		case 3:
			System.exit(0);
			
			
		}
		}
		while(a!=3);
		



	}

	private static void status() {
		// TODO Auto-generated method stub
		int g;
		Scanner sc= new Scanner(System.in);
		System.out.println("check status:");
		System.out.println("enter room number");
	    g=sc.nextInt();
		if(booked[g]==1)
		{
			System.out.println("Room number "+g+" is booked");
		}
		else
		{
			System.out.println("Room number "+g+" is not booked");
		}
		
	}

	private static void book() {
		String ac;
		String cot;
		String cable;
		String wifi;
		String laundry;
		Scanner sc= new Scanner(System.in);
		int total,b=0,c,d,e,f,i=1;
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
			booked[i]=1;
			
			System.out.println("Thank you your room number is"+i);
			i++;
			
		}	
	}
}