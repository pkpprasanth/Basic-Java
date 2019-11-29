import java.util.Scanner;

public class Car {
	public static void main(String [] arg) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number 1");
		int n1=s.nextInt();
		System.out.println("Enter Number 2");
		int n2=s.nextInt();
		System.out.printf("1)add\n2)sub\n3)mul\n");
		int n=s.nextInt();
		Operation c = new Operation(n1,n2);
		switch(n)
		{
		case 1:
			c.add(n1,n2);
			break;
		case 2:
			Operation.sub(n1,n2);
			break;
		}
	}

}

class Operation{
int n1,n2;
	public Operation(int n1, int n2) {
		n1=n1;
		n2=n2;
	}

	public static void add(int n1, int n2) {
		System.out.printf("Add-> %d",n1+n2);	
	}

	public static void sub(int n1, int n2) {
		System.out.printf("Sub-> %d",n1-n2);
		
	}
     
}