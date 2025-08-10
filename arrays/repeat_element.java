class repeat_element {
    public static void main(String[] args) {
        int arr[] = { 10, 5, 3, 4, 3, 5, 6 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean repeat = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    repeat = true;
                }
            }
            if (repeat == true) {
                System.out.println(arr[i]);
                break;
            }
        }
    }

}