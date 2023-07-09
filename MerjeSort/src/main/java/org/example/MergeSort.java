/**
 * The MergeSort class implements the merge sort algorithm for sorting an array of integers.
 * Time complexity is O(nlogn).
 */
public class MergeSort {
    /**
     * Sorts the given array using the merge sort algorithm.
     * @param arr the array to be sorted
     * @param left the starting index of the range to be sorted
     * @param right the ending index of the range to be sorted
     */
    public void mergeSort(int[] arr, int left, int right)
    {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    /**
     * Merges two subarrays of the given array into a single sorted subarray.
     * @param items the array in which the subarrays are stored
     * @param left the starting index of the first subarray
     * @param mean the ending index of the first subarray
     * @param right the ending index of the second subarray
     */

    private void merge(int[] items, int left, int mean, int right)
    {
        int leftSize = mean - left + 1;
        int rightSize = right - mean;
        int[] leftArr = new int[leftSize];
        int[] rightArr = new int[rightSize];
        for (int i = 0; i < leftSize; i++)
            leftArr[i] = items[left + i];
        for (int j = 0; j < rightSize; j++)
            rightArr[j] = items[mean + 1 + j];
        int i = 0;
        int j = 0;
        int k = left;
        while(i < leftSize && j < rightSize)
        {
            if (leftArr[i] <= rightArr[j]) {
                items[k] = leftArr[i];
                i++;
            } else {
                items[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while (i < leftSize) {
            items[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < rightSize) {
            items[k] = rightArr[j];
            j++;
            k++;
        }
    }

    /**
     * Prints the elements of the array.
     * @param arr the array to be displayed
     */
    public void showArray(int[] arr)
    {
        for (int value : arr)
            System.out.print(value + " ");
        System.out.println();
    }
}
