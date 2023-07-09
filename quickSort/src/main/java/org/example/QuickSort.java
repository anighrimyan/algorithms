/**
 * The QuickSort class implements the QuickSort algorithm to sort an array of integers in ascending order.
 */
public class QuickSort {
    /**
     * Sorts the given array using the QuickSort algorithm.
     * @param arr the array to be sorted
     * @param left the starting index of the subarray to be sorted
     * @param right the ending index of the subarray to be sorted
     */
    public void quickSort(int[] arr, int left, int right)
    {
        if (left < right) {
            int keyIndex = partition(arr, left, right);
            quickSort(arr, left, keyIndex - 1);
            quickSort(arr, keyIndex + 1, right);
        }
    }

    /**
     * Partitions the subarray around a pivot element.
     * @param items the array to be partitioned
     * @param left the starting index of the subarray to be partitioned
     * @param right the ending index of the subarray to be partitioned
     * @return the index of the pivot element after partitioning
     */
    private int partition(int[] items, int left, int right)
    {
        int key = items[right];
        int i = left - 1;
        for (int j = left; j < right; ++j) {
            if (items[j] <= key) {
                int temp = items[++i];
                items[i] = items[j];
                items[j] = temp;
            }
        }
        int temp = items[i + 1];
        items[i + 1] = items[right];
        items[right] = temp;
        return (i + 1);
    }

    /**
     * Prints the elements of the array.
     * @param arr the array to be displayed
     */
    public void showArray(int[] arr)
    {
        for (int value : arr) System.out.print(value + " ");
        System.out.println();
    }
}
