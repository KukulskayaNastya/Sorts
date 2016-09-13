public class FonNeyman {
    public static void main(String args[]) {
        int[] mas = {9, 0, 3, 2, 10, 5, 4};
        int s = mas.length;

        for (int i = 1; i <= s; i = i * 2) {
            for (int j = 0; j <= s - i; j = j + (i * 2)) {
                if ((j + (2 * i)) < s) {
                    merge(mas, j, j + i, j + (2 * i));
                } else {
                    merge(mas, j, j + i, s);
                }
            }
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }

    public static void merge(int[] a, int left, int mid, int right) {
        int it1 = 0;
        int it2 = 0;
        int[] result = new int[right - left];

        while ((left + it1 < mid) && (mid + it2 < right)) {
            if (a[left + it1] < a[mid + it2]) {
                result[it1 + it2] = a[left + it1];
                it1 = it1 + 1;
            } else {
                result[it1 + it2] = a[mid + it2];
                it2 = it2 + 1;
            }
        }
        while (left + it1 < mid) {
            result[it1 + it2] = a[left + it1];
            it1 = it1 + 1;
        }
        while (mid + it2 < right) {
            result[it1 + it2] = a[mid + it2];
            it2 = it2 + 1;
        }
        for (int i = 0; i < it1 + it2; i++) {
            a[left + i] = result[i];
        }
    }
}




