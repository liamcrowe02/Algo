public class heapSort {

    void  heapSort(int selectionSortArray[]) {
        int n = selectionSortArray.length;

        for (int i = n/2-1; i >= 0; i--) {
            heapify(selectionSortArray, n, i);
        }

        for (int i = n-1; i > 0; i--) {
            int temp = selectionSortArray[0];
            selectionSortArray[0] = selectionSortArray[i];
            selectionSortArray[i] = temp;

            heapify(selectionSortArray, i, 0);
        }
    }

    void heapify(int selectionSortArray[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && selectionSortArray[l] > selectionSortArray[largest]) {
            largest = l;
        }

        if (r < n && selectionSortArray[r] > selectionSortArray[largest]) {
            largest = r;
        }

        if (largest != i) {
            int swap = selectionSortArray[i];
            selectionSortArray[i] = selectionSortArray[largest];
            selectionSortArray[largest] = swap;

            heapify(selectionSortArray, n, largest);
        }
    }
}
