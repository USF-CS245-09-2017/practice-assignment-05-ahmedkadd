public class InsertionSort implements SortingAlgorithm {
	
	public void sort(int [] a) {
		for (int i = 1; i < a.length; i++) {
			int num = a[i];
			
			int j = i - 1;
			
			/** While loop shifts array to the right so num can be placed at the correct index **/
			while (j >= 0 && num < a[j]) {
				a[j + 1] = a[j];
				j--;
			}	
			
			a[j + 1] = num;
		}
	}
}
