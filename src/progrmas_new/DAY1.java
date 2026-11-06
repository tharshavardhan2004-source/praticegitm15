package progrmas_new;

public class DAY1 {
	//Toggle.......
	
//	public static void main(String[] args)
//	{
//		String s="JaVa";
//		String tog="";
//		for(int i=0;i<s.length();i++)
//		{
//			char ch=s.charAt(i);
//			if(ch>='A' && ch<='Z')
//			{
//				tog=tog+(char)(ch+32);
//			}
//			else if(ch>='a' && ch<='z')
//			{
//				tog=tog+(char)(ch-32);
//			}
//		}
//		System.out.println(tog);
//		
//	}
	
	
	
	//vowels and consonants
	
//	public static void main(String[] args) 
//	{
//		String s="Qspiders";
//		String vow="";
//		String conso="";
//		for(int i=0;i<s.length();i++)
//		{
//			char ch=s.charAt(i);
//			if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' ||
//					ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
//			{
//				vow=vow+ch;
//			}
//			else
//			{
//				conso=conso+ch;
//			}
//		}
//		System.out.println(vow);
//		System.out.println(conso);
//		
//	}
	
	

	//Count of words
//	public static void main(String[] args) 
//	{
//		String s="  Hi i am   Harsha";
//		int count=0;
//		String s1=s.trim();
//		char [] arr=s1.toCharArray();
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]==' ')
//			{
//				count++;
//			}
//		}
//		System.out.println(count-1);
//	}
	
	
	//Count of words
//	public static void main(String[] args) {
//		String s="Hi i am Harsha";
//		int count=0;
//		for(int i=0;i<s.length();i++)
//		{
//			char ch=s.charAt(i);
//			if(ch==' ')
//			{
//				count++;
//			}
//		}
//		System.out.println(count+1);
//	}
	
//	Armstrong
	
//	public static void main(String[] args) {
//		int n=153;
//		int copy=n;
//		int sum=0;
//		while(n!=0)
//		{
//			int rem=n%10;
//			sum=rem*rem*rem+sum;
//			n=n/10;
//			
//		}
//		if(copy==sum)
//		{
//			System.out.println("armstrong");
//		}
//		else
//		{
//			System.out.println("Not armsstrong");
//		}
//	}
	
	
	//Strong number
//	public static void main(String[] args) {
//		int n=145;
//		int copy=n;
//		int sum=0;
//		while(n!=0)
//		{
//			int rem=n%10;
//			int fact=1;
//			for(int i=1;i<=rem;i++)
//			{
//				fact=fact*i;
//			}
//			sum=sum+fact;
//			n=n/10;
//		}
//		if(sum==copy)
//		{
//			System.out.println("Strong Number");
//		}
//		else
//		{
//			System.out.println("Not Strong number");
//		}
//	}
	
	
	//Reverse the array
//	public static void main(String[] args) 
//	{
//		int arr[]= {1,2,3,4};
//		for(int i=arr.length-1;i>=0;i--)
//		{
//			System.out.println(arr[i]);
//		}
//	}
	
	
	
//	public static void main(String[] args) {
//		int arr[]= {9,5,2,6,3,6};
//		for(int i=0;i<arr.length;i++)
//		{
//		
//			if(arr[i]%2==0)
//			{
//				System.out.println(arr[i]);
//			}
//		}
//	}
	
	
	
	//Linear search
//	static int search(int arr[],int key)
//	{
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]==key)
//			{
//				return i;
//			}
//		}
//		return -1;
//	}
//	
//	
//	public static void main(String[] args) 
//	{
//		int arr[]= {4,2,68,31,5};
//		int key=30;
//		int x=search(arr,key);
//		System.out.println(x);
//	}
	
	
//	public static void main(String[] args) {
//		int arr[]= {1,7,3,8,5,3,77};
//		int max=arr[0];
//		for(int i=0;i<arr.length;i++)
//		{
//			if(max<arr[i])
//			{
//				max=arr[i];
//			}
//		}
//		System.out.println(max);
//		
//	}
	
	
	
	
//	static void search(int arr[])
//	{
//		for(int i=0;i<arr.length-1;i++)
//		{
//			for(int j=0;j<arr.length-1;j++)
//			{
//				if(arr[j]<arr[j+1])
//				{
//					int temp=arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				}
//			}
//		}
//		for(int k=0;k<arr.length;k++)
//		{
//			System.out.println(arr[k]);
//		}
//	}
//	
//	public static void main(String[] args) {
//		int arr[]= {3,7,2,8,9};
//		search(arr);
//		
//	}
	
	
	
//	public static void main(String[] args) {
//		String s="Harsha";
//		for(int i=0;i<s.length();i++)
//		{
//			char ch=s.charAt(i);
//			System.out.println(ch);
//		}
//	}
	
	
	
//	public static void main(String[] args) {
//		String s="1234";
//		String str="";
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			char ch=s.charAt(i);
//			str=str+ch;
//		}
//		System.out.println(str);
//		
//	}
	
	
	
	public static void main(String[] args) {
		String s="mom";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		if(s.equals(rev))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("No");
		}
	}
}
