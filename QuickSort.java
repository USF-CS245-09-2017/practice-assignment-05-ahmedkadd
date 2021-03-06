
public class QuickSort implements SortingAlgorithm {
	
	public void sort(int[] a) {
		sort(a, 0, a.length - 1);
		
	}
	
	public void sort(int[] a, int left, int right) {
		if (left < right) {
			int p = partition(a, left, right);
			
			sort(a, left, p - 1);
			sort(a, p + 1, right);
			
		}
	}
	
	public int partition(int[] a, int left, int right) {
		if (left < right) {
			int pivot = left;
			int i = left + 1; // Avoids re-sorting the pivot
			int j = right;
			
			while (i < j) {
				while (i <= right && a[i] <= a[pivot]) {
					++i;
				}
				while (j >= i && a[j] > a[pivot]) {
					--j;
				}
				
				if (i <= right && i < j) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
			int temp = a[pivot];
			a[pivot] = a[j];
			a[j] = temp;  // pivot to the middle
			
			return j;
		}
		
		return left;
	}
}
