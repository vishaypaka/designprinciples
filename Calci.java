package operations;
import java.util.*;
public class Calci implements arithop 
{
	int a,b;
	public void readinput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first operand");
		this.a=sc.nextInt();
		System.out.println("enter second operand");
		this.b=sc.nextInt();
		sc.close();
	}
	public int add()
	{
		readinput();
		return (this.a+this.b);
	}
	public int sub()
	{
		readinput();
		return (this.a-this.b);
	}
	public int mul()
	{
		readinput();
		return (this.a*this.b);
	}
	public double div()
	{
			readinput();
			if(b==0) 
                                                   {
				System.out.println("can't divide by zero");
				//return "null";
			}
			double res=(double)a/b;
			return res;
		
	}
}
