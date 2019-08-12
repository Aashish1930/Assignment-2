/*wrire a program in java a given as input find the odd digit in the number
 add them 
and find if the sum is odd or not */



/*import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {

	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	int sum=0;
	
	while(n>0)
	{
		int rem=0;
		 rem = rem % 10;
		if(rem%2!=0)
		{
			sum=sum+rem;
			//System.out.println("sum"+sum);
		}
		n=n/10;
	}
	if(sum%2==0)
	{
		System.out.println("sum of odd digit is even ");
	}
	else
	{
		System.out.println("sum of odd digit is odd");
	}
	
	
	
	}
}	*/

    import java.util.Scanner;
    public class program1 {
      
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int summ=0;
        while(n>0){
          int remm= n%10;
          if(remm%2!=0){ 
            summ = summ+remm;   // only add odd digit 
          }
          n = n/10;
        }
        
        if(summ%2==0){
          System.out.println("Sum of odd digits is even"+ summ);
        }else{
          System.out.println("Sum of odd digits is odd"+ summ);
        }
        
      }
    }