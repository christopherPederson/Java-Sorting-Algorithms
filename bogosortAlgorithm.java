/* this is a bogosort algorithm. designed by Christopher Pederson 2023-03-02. 
 * to change the value of the size of the array change the numbers on line 10, 12, and 13. currently it is set to an array size of 10
 * the number on line 13 must be one higher than your array size. ENJOY!
*/ 
import java.util.Random;
public class bogosortAlgorithm {

	public static void main(String[] args) {
		Random random = new Random(); 
		int[] array = new int[13];
		
		for (int i = 0; i < 13; i++) {
			array[i] = random.nextInt(14);
		}
		
		System.out.println(bogosort(array));
	}
	
	public static boolean isSorted(int[] array) {
		
		for(int i = 0; i < array.length -1 ; i++) {
			if (array[i] > array[i + 1]) {
				return false; 
				}
			}
		return true; 
		}
	public static int bogosort(int[] array) {
		int i;
		for(i = 0; !(isSorted(array)); i++) {
			shuffle(array);
		}
		return i; 

	}
	
	
	public static void shuffle(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int index = (int)(Math.random() * array.length);
			int temp = array[i];
			array[i] = array[index];
			array[index] = temp;
		}
	}

}
