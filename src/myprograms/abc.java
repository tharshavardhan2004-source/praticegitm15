package myprograms;

public class abc extends ab
{
	public static void main(String[] args) 
	{
		System.out.println("Hello");
		ab a=new ab();
		a.call2();
		a.call();
		
	}
	

}
class abcd
{
	void call()
	{
		System.out.println("Hi");
	}
}

class ab extends abcd
{
	void call2()
	{
		System.out.println("welcome");
	}
}