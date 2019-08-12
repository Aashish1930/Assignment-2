
/*WAP a integer array is given as input find diffrance between 
 * each element return the index of the largest element  
 * 
 * 
 * 
 * 
 * public class pragram3 {

	public static void main(String[] args) {

	    num=num[i];
		int maxdif= num[1]-num[0];
		int minele=num[0];
		for(int i=1;i<num.length;i++)
		{
			if(maxdif<num[i]-minele)
			{
				maxdif=num[i]-minele;
			}
			if(minele>num[i])
			{
				minele=num[i];
			}
		}
     System.out.println(""+maxdif);
	}

}
*/
public class pragram3 {

	public static void main(String[] args) {
		

	int[]a={2,3,4,4,3};
	int maxdif= a[1]-a[0];
	int minele=a[0];
	for(int i=1;i<a.length;i++)
	{
		if(maxdif<a[i]-minele)
		{
	
			maxdif=a[i]-minele;
		}
		if(minele>a[i])
		{
			minele=a[i];
		}
	}
 //System.out.println("minumum diiffrance is"+minele);
	System.out.println("Maximum diffrance is "+maxdif);
}	
	
	
	
}

	