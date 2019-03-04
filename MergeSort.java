
public class MergeSort implements SortingAlgorithm {
	
	public void sort(int[] a) {
		int n = a.length;
		
		if (n < 2) {
			return; 
		} else {
			int middle = n / 2;
			
			int[] left = new int[middle];
			int [] right = new int [n - middle];
			
			for (int i = 0; i < middle; i++) {
				left[i] = a[i];
			}
			
			for (int i = 0; i < n - middle; i++) {
				right[i] = a[middle + i];
			}
			
			sort(left);
			sort(right);
			
			merge(a, left, right, middle, n - middle);
		}
		
	}
	
	public void merge(int[] a, int[] left, int[] right, int leftLength, int rightLength) {
		int l = 0, r = 0, i = 0;
		
		while (l < leftLength && r < rightLength) {
			if (left[l] <= right[r]) {
				a[i++] = left[l++];
			} else {
				a[i++] = right[r++];
			}
		}
		
		while(l < leftLength) {
			a[i++] = left[l++];
		}
		
		while(r < rightLength) {
			a[i++] = right[r++];
		}
	}
}
