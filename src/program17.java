
/*17.  Input a int array. Square the elements in even position and cube the elements in odd position 
and add them as result.
input: {1,2,3,4}

done
*/

public class program17 {

	public static void main(String[] args) {

		int[] n = { 1, 2, 3, 4, };
		int EvenSqure = 0;
		int Oddcube = 0;
		for (int i = 0; i < n.length; i++) {

			if (i % 2 == 0) {
				EvenSqure += n[i] * n[i];

			}

			if (i % 2 != 0) {
				Oddcube += n[i] * n[i] * n[i];

			}

		}

		int sum = EvenSqure + Oddcube;
		System.out.println("Sum is " + sum);

	}

}
