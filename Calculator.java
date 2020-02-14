import operations.*;
import java.util.*;
//import java.lang.*;
public class Calculator {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int choice;
		int c;
		//do {
		System.out.println("1.Addition 2.Substraction 3.Multiplication 4.Division");
		System.out.println("enter your choice");
		choice=sc.nextInt();
		Calci ob=new Calci();
		switch(choice)
		{
		case 1:System.out.println("Result is "+ob.add());
		break;
		case 2:System.out.println("Result is "+ob.sub());
		break;
		case 3:System.out.println("Result is "+ob.mul());
		break;
		case 4:
			double res=ob.div();
			System.out.println("Result is "+res);
			break;
		default:System.out.println("Enter a valid choice");
		
		
		}
		//System.out.println("Do you want to continue 1/0");
		// c=sc.nextInt();
		//}while(c==1);
		System.out.println("Thankyou for using calculator");
		sc.close();
	}
}
