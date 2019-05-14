
public class SimpleRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countdown(5);
		fact(1);
	}
	
	public static void countdown(int num)
	{
		System.out.println(num);
		if(num <= 0)//halting condition
			return;
		else
			countdown(num-1);//recursive step
	}
	
	public static int fact(int num)
	{
		if(num <= 0)
			return 1;
		else
			return num*fact(num-1);
	}
	
	public static int gcd(int a, int b)
	{
		if(b == 0)
			return a;
		else
			return gcd(b,a%b);
	}
	
	public static int fibo(int num)
	{
		if(num == 1 || num == 2)
			return 1;
		else
			return fibo(num-1) + fibo(num-2);
	}
	

}
