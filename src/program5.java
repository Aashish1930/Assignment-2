
/*
5. Sum of fibonaaci series upto given input.
sum of first 3 
logic:1+1+2
output:4*/



import java.util.Scanner;

public class program5 {

	public static void main(String[] args) {
	int a=0,b=1,c=0,d;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter num ");
	int n=sc.nextInt();
	
	for(int i=0;i<=n;i++)
	{
	    
		d=a+b+c;  
		System.out.println(" "+d);
		a=b;
		b=c;
	    c=d;    
		
	}
	

	}

}
