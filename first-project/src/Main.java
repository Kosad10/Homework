public class Main {

    // задание 1
    // посчитать перимерт
    public static int calculatePerimeter(int length, int width) {
        int perimeter = (length + width) * 2;
        System.out.println("Периметр прямоугольника равен: " + perimeter);
        return perimeter;
    }
    // Задание 2
    public static boolean isIdentyfying(int number) {
        int even = 0;
        if (number % 2 != even) {
        System.out.println("Число ялвяется нечетным: ");
        }
        else {
            System.out.println("Число ялвяется четным: ");
        }
        return true;
    }
    // Задание 3 не сделано
    public static double calculateArithmeticmean(int[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            }
        double mean = sum / numbers.length;
        System.out.println(mean);
        return mean;
    }
    // Задание 4
    public static int [] identifyMaxMin(int [] numbers) {
        int max = numbers [0];
        int min = numbers [0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        int[] maxandmin = {min,max};
        System.out.println("Минимальное значение: " + maxandmin[0]);
        System.out.println("Максимальное значение: " + maxandmin[1]);
        return maxandmin;
    }

    public static void main(String[] args) {
        calculatePerimeter(45, 7);
        calculatePerimeter(4, 8);

        // Задание 2
        System.out.println("Задание 2");
        isIdentyfying(6);
        isIdentyfying(9);

        // Задание З
        System.out.println("Задание 3");
        int[] massive = {7,8,9,10,12};
        calculateArithmeticmean(massive);

        // Задание 4
        // вынести в метод который возвращает массив int[], int[0] - min, int[1] - max
        System.out.println("Задание 4");
        int[] numbers = {1,45,3,2,87,9,65,34,90,12};
        identifyMaxMin(numbers);
        }
    }


