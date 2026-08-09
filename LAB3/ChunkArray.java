import java.util.Scanner;

public class ChunkArray {

    public static void chunkArray(int arr[], int size) {

        int rows = (arr.length + size - 1) / size;
        int[][] res = new int[rows][size];
        int flag = 0;
        for (int i = 0; i < arr.length; i += size) {
            for (int j = 0; j < size; j++) {
                if (i + j < arr.length) {
                    res[flag][j] = arr[i + j];
                }
            }
            flag++;
        }
        for (int[] x : res) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }

    public static void main(String... args) {

        int[] arr = {2, 4, 3, 5, 7, 8, 2};
        int size = 2;

        chunkArray(arr, size);
    }
}