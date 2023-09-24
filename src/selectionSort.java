public class selectionSort {
    public void selectedSort(int selectionSortArray[]) {

        int n = selectionSortArray.length;

        for(int i = 0; i < n - 1; i++) {
            int min_elem = i;

            for(int j = i + 1; j < n; j++) {
                if (selectionSortArray[j] < selectionSortArray[min_elem])
                    min_elem = j;
            }

            // Swap the found minimum element with the first element
            int temp = selectionSortArray[min_elem];
            selectionSortArray[min_elem] = selectionSortArray[i];
            selectionSortArray[i] = temp;
        }
    }
}


