public class missing_number {
    public static void main(String[] args) {
        // Given an array arr[] of size n-1 with distinct integers in the range of [1,
        // n]. This array represents a permutation of the integers from 1 to n with one
        // element missing. Find the missing element in the array.

        int arr[] = { 8, 2, 4, 5, 3, 7, 1 };
        int n = arr.length + 1;
        int miss = 0;

        // BASIC APPROACH ---- Big O = O(n2)
        // int i = 1;
        // while (i <= n) {
        // boolean present = false;
        // for (int j = 0; j < n - 1; j++) {
        // if (arr[j] == i) {
        // present = true;
        // break;
        // }
        // }
        // if (present == false) {
        // miss = i;
        // System.out.println("missed number = " + miss);
        // }
        // i++;
        // }

        // =====================================================================
        // Using Sum if n integer (n*(n+1)/2) ---- Big O = O(n)
        int sum = n * (n + 1) / 2;
        int arr_sum = 0;
        for (int i = 0; i < n - 1; i++)
            arr_sum += arr[i];
        miss = sum - arr_sum;
        System.out.println("missed number = " + miss);
    }
}
