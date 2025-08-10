public class reverse_array {
    public static void main(String[] args) {

        // Given an array arr[] and an integer k, find the array after reversing every
        // subarray of consecutive k elements in place. If the last subarray has fewer
        // than k elements, reverse it as it is. Modify the array in place, do not
        // return anything.

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int k = 3;
        int n = arr.length;
        int temp[] = new int[n];
        int b[] = new int[n];
        int j = 0;

        while (j < n) {
            int tempk = k;
            if ((tempk + j) > n) {
                for (int i = j; i < n; i++) {
                    tempk--;
                    temp[i] = arr[(j + tempk) - ((n - 1) - j)];
                    // System.out.print(temp[i]);
                    // System.out.println(arr[n - tempk]);
                }
            } else {
                for (int i = j; tempk > 0; i++) {
                    tempk--;
                    temp[i] = arr[tempk + j];

                }
            }
            j += k;
        }

        for (int i = 0; i < temp.length; i++) {
            b[i] = temp[i];
            System.out.print(b[i]);
        }
    }
}
