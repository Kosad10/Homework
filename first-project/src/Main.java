public class Main {

    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int lenght = 7;
        int width = 15;
        System.out.println("Периметр прямоугольника равен:" + (lenght + width) * 2);
        System.out.println("Площаль прямоугольника равна:" + lenght * width);

        // Задание 2
        System.out.println("Задание 2");
        int s = 8;
        int v = s % 2;
        if (v == 1) {
            System.out.println("Число s является нечетным");
        } else {
            System.out.println("Число s является четным");
        }

        // Задание З
        System.out.println("Задание 3");
        int[] numbers = {6, 7, 8, 9, 10};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum / numbers.length);

        // Задание 4
        System.out.println("Задание 4");
        int[] array = {4, 5, 3, 2, 7, 8, 9, 65, 45, 76};
        int min = array[0];
        int max = array[0];
        {for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
            System.out.println("Минимальное значение массива: " + min);
            System.out.println("Максимальное значение массива: " + max);
        }
    }
}


