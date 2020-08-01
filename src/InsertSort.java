import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = {6, 3, 4, 8, 1, 0, 2};
        int key;
        for (int i = 1; i < array.length; i++) {
            key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        System.out.println(Arrays.toString(array) + " Сортировка вставками");
    }
}
