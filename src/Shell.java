
public class Shell {
    public static void main(String args[]) {

        int k = 0;
        int[] array = {9, 1, 3, 2, 10, 5, 4, 9, 7, 13};
        int s = array.length;

        for (int i = 0; i < s; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < s; i++) {
            if (Math.pow(2, i) + 1 <= s) k = i;
        }

        while (Math.pow(2, k) + 1 >= 2) {
            for (int i = 0; i < (s - k); i++) {
                int j = i;
                while ((j >= 0) && (array[j] > array[j + k])) {
                    int t = array[j];
                    array[j] = array[j + k];
                    array[j + k] = t;
                    j--;
                }
            }
            k--;
        }


    }
}