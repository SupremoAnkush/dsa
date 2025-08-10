public class java_project2 {
    public static void main(String[] args) {

        // Given a binary array arr[] consisting of only 0s and 1s,
        // find the length of the longest contiguous sequence of either 1s or 0s in the
        // array
        int a[] = { 0, 1, 0, 1, 1, 1, 1 };

        int count = 1;
        int i = 1;

        if (a.length == 0)
            count = 0;

        while (i < a.length) {

            // Using simple comparision
            // if (a[i - 1] == a[i])
            // count++;

            // Using XOR "^" to compare the two binaries
            if ((a[i - 1] ^ a[i]) == 0)
                count++;
            i++;
        }

        System.out.println(count);
    }
}
