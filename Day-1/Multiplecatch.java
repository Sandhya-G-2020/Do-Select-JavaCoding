import java.util.Scanner;

public class Multiplecatch {
public String checkException(double n1,double n2,char op)
{
	try
	{
		
		if((n1==0)||(n2==0)||((op!='+')&&(op!='-')&&(op!='*')&&(op!='/')))
		{
			if((n1==0)||(n2==0))
			{
				if(op=='*')
				{
					throw new MultiplicationbyZero("Multiplication with zero results in zero");
				}
				else
				{
					if(op=='/')
					{
						throw new ArithmeticException("Division by zero results in infinity");
					}
				}
			}
			else
			{
				String mess=op+"invalid operator";
				throw new Otherexception(mess);
			}
		}
	}catch(MultiplicationbyZero me)
	{
		return "Multiplication with zero results in zero";
	}
	catch(ArithmeticException ae)
	{
		return "Division by zero results in infinity";
	}
	catch(Otherexception e)
	{
		String mess=op+"invalid operator";
		return mess;
	}
	return "No exception found";
}
public double calculate(double n1,double n2,char op)
{
	double ans=0.0;
	char o=op;
	switch(o)
	{
	case '+':
	{
		ans=n1+n2;
		return ans;
		
	}
	case '-':
	{
		ans=n1-n2;
		return ans;
		
	}
	case '*':
	{
		ans=n1*n2;
		return ans;
		
	}
	case '/':
	{
		ans=n1/n2;
		return ans;
		
	}
	
	}
	return ans;
}
public static void main(String[] args)throws MultiplicationbyZero,ArithmeticException,Exception
{
	Scanner sc= new Scanner(System.in); 
	double num1=sc.nextDouble();
	double num2=sc.nextDouble();
	char op=sc.next().charAt(0);
	Multiplecatch mc=new Multiplecatch();
	String msg=mc.checkException(num1,num2,op);
	System.out.println(msg);
	if(msg=="No exception found")
	{
		double result=mc.calculate(num1,num2,op);
		System.out.println(result);
	}
	
}
}
class MultiplicationbyZero extends Exception
{
	private static final long serialVersionUID=1L;
	public MultiplicationbyZero(String str)
	{
		super(str);
	}
}
class Otherexception extends Exception
{
	private static final long serialVersionUID=1L;
	public Otherexception(String str)
	{
		super(str);
	}
}
