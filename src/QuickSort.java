
public class QuickSort {
    public static void main(String[] args) {
        int[] array = {9, 1, 3, 2, 10, 5, 4, 9, 7};
        qSort(array,0,array.length-1)  ;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); }
    }


    public static void qSort(int[] array, int l, int r) {
        int i = l;
        int j = r;
        int x = array[l-(l-r)/2];
        while (i <= j) {
            while (array[i] < x) {
                i++;
            }
            while (array[j] > x) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (l<j){
            qSort(array, l, j);
        }
        if(i<r){
            qSort(array, i, r);
        }
    }
}
