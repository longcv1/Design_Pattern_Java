package balazs;

public class SortingManager {
	BubbleSort bubbleSort;
	MergeSort mergeSort;
	QuickSort quickSort;
	public SortingManager() {
		bubbleSort = new BubbleSort();
		mergeSort = new MergeSort();
		quickSort = new QuickSort();
	}
	
	public void bubbleSort() {
		bubbleSort.sort();
	}
	
	public void mergeSort() {
		mergeSort.sort();
	}
	public void quickSort() {
		quickSort.sort();
	}
}
