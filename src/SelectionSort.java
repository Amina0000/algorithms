public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {6, 3, 4, 8, 1, 0, 2};
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_i = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int temp = array[i];
                array[i] = array[min_i];
                array[min_i] = temp;
            }
        }
        for (int a = 0; a < array.length; a++) {
            System.out.print(array[a] + " ");
        }
        System.out.print("Сортировка выбором");
    }
}
