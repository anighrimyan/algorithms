/**
 * The Main class contains the main method to demonstrate the usage of the MergeSort class.
 */
public class Main {
    public static void main(String[] args) {
        int[] libraryNum = {0, -1, -5, 5, 8, 8, 3};
        System.out.println("Initial array");
        MergeSort mergeSortObj = new MergeSort();
        mergeSortObj.showArray(libraryNum);
        mergeSortObj.mergeSort(libraryNum, 0, libraryNum.length - 1);
        System.out.println("Sorted array");
        mergeSortObj.showArray(libraryNum);
    }
}