import java.util.*;

public class Sliyanie {
    public static void main(String args[]) {
        int[] mas = {9, 1, 3, 2, 10, 5, 4, 9, 7};
        int[] mas2 = sort(mas);
        for (int i = 0; i < mas2.length; i++) {
            System.out.print(mas2[i] + " ");
        }
    }

    public static int[] sort(int[] mas) {
        if (mas.length < 2) return mas;
        int m = mas.length / 2;
        int[] arr1 = Arrays.copyOfRange(mas, 0, m);
        int[] arr2 = Arrays.copyOfRange(mas, m, mas.length);
        return merge(sort(arr1), sort(arr2));
    }

    public static int[] merge(int[] arr1, int arr2[]) {
        int n = arr1.length + arr2.length;
        int[] mas = new int[n];
        int i1 = 0;
        int i2 = 0;
        for (int i = 0; i < n; i++) {
            if (i1 == arr1.length) {
                mas[i] = arr2[i2++];
            } else if (i2 == arr2.length) {
                mas[i] = arr1[i1++];
            } else {
                if (arr1[i1] < arr2[i2]) {
                    mas[i] = arr1[i1++];
                } else {
                    mas[i] = arr2[i2++];
                }
            }
        }
        return mas;
    }
}
