import java.util.Arrays;

public class BubbleSort {
        public static void main(String[] args) {


            int[] array = {6, 3, 4, 8, 1, 0, 2}; // массив с 7 элементами

            for (int i = array.length - 1; i > 0; i--) { // внешний цикл
                for (int j = 0; j < i; j++) { // внутренний цикл
                    if (array[j] > array[j + 1]) { // если первый элемент больше второго...
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;  // меняем местами
                    }
                }
            }
            System.out.println(Arrays.toString(array) + " Сортировка пузырьком"); // выводим отстортированный массив
        }
    }

