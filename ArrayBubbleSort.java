
public class ArrayBubbleSort {
	public static void main(String[] args) {
		int[] array = {4,6,31,5,9,347,2,8};
		
		array = bubbleSort(array);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	public static boolean notSorted(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if(array[i] > array[i + 1]) {
				return true;
			}
		}
		return false; 
	}
	
	public static int[] bubbleSort(int[] array) {
		
		while (notSorted(array)) {
			
			for (int i = 0; i < array.length - 1; i++) {
				
				if(array[i] > array[i + 1]) {
					array = swap(array, i, i+1);
				}
			}
		}
		return array;
	}
	
	public static int[] swap(int[] array, int first, int last) {
		int temp = array[last];
		array[last] = array[first];
		array[first] = temp;
		return array;
	}
}
