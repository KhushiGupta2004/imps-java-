import java.util.Arrays;

public class MergeArrays {
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] merged = new int[n1 + n2];

        // Copy first array
        System.arraycopy(arr1, 0, merged, 0, n1);
        // Copy second array
        System.arraycopy(arr2, 0, merged, n1, n2);

        return merged;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 6};

        int[] result = mergeArrays(array1, array2);

        System.out.println("Merged Array: " + Arrays.toString(result));
    }
}
