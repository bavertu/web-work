public static boolean hasDuplicates(int[] arr) {
    // Sort the array
    Arrays.sort(arr);

    // Check adjacent elements for duplicates
    for (int i = 1; i < arr.length; i++) {
        if (arr[i] == arr[i - 1]) {
            return true;
        }
    }
    return false;
}

public static void main(String[] args) {
    int[] arr = {3, 2, 1, 5, 4, 6, 7, 9, 8, 10, 4};
    if (hasDuplicates(arr)) {
        System.out.println("The array has duplicates.");
    } else {
        System.out.println("The array does not have duplicates.");
    }
}
