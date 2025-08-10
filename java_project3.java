public class java_project3 {

    public static void main(String[] args) {

        // Given an array of integers arr[], move all the zeros to the end of the array
        // while maintaining the relative order of all non-zero elements

        int arr[] = { 1, 2, 0, 4, 3, 0, 5, 0 };
        int n = arr.length;
        // int temp[] = new int[n];

        // to keep track of the index in temp[]
        // int j = 0;

        // Copy non-zero elements to temp[]
        // for (int i = 0; i < n; i++) {
        // if (arr[i] != 0)
        // temp[j++] = arr[i];
        // }

        // Fill remaining positions in temp[] with zeros
        // while (j < n)
        // temp[j++] = 0;

        // Copy all the elements from temp[] to arr[]
        // for (int i = 0; i < n; i++)
        // arr[i] = temp[i];
        // Printing the new array
        // for (int num : arr)
        // System.out.print(num + " ");

        // ================================================
        // 2nd Approach (Better approach)

        int c = 0;
        // If the element is non-zero, replace the element at
        // index 'c' with this element and increment c
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0)
                arr[c++] = arr[i];
        }

        // Now all non-zero elements have been shifted to
        // the front. Make all elements 0 from count to end.
        while (c < n) {
            arr[c++] = 0;
        }

        for (int num : arr)
            System.out.print(num + " ");

    }

}
