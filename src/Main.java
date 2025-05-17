/* 11. Локатор ориентирован на одну из сторон света (1 – север, 2 – запад, 3 – юг,
4 – восток) и может принимать три цифровые команды поворота: 1 – поворот налево,
-1 – поворот направо, 2 – поворот на 180°. Дан символ C – исходная ориентация
локатора и целые числа N1 и N2 – две посланные команды. Вывести ориентацию
локатора после выполнения этих команд. */

import java.util.Random;
import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите исходную ориентацию (1 – север, 2 – запад, 3 – юг, 4 – восток): ");
//        int C = scanner.nextInt();
//        System.out.print("Введите первую команду (1 – налево, -1 – направо, 2 – 180°): ");
//        int N1 = scanner.nextInt();
//
//        // Применяем команды последовательно
//        C = turn(C, N1);
//
//        System.out.print("Введите вторую команду (1 – налево, -1 – направо, 2 – 180°): ");
//        int N2 = scanner.nextInt();
//        C = turn(C, N2);
//
//        // Выводим результат
//        System.out.println("Ориентация после команд: " + C);
//    }
//
//    // Функция поворота
//    public static int turn(int orientation, int command) {
//        switch (orientation) {
//            case 1: // север
//                if (command == 1) return 2;    // налево -> запад
//                if (command == -1) return 4;   // направо -> восток
//                if (command == 2) return 3;    // 180° -> юг
//                break;
//            case 2: // запад
//                if (command == 1) return 3;    // налево -> юг
//                if (command == -1) return 1;   // направо -> север
//                if (command == 2) return 4;    // 180° -> восток
//                break;
//            case 3: // юг
//                if (command == 1) return 4;    // налево -> восток
//                if (command == -1) return 2;   // направо -> запад
//                if (command == 2) return 1;    // 180° -> север
//                break;
//            case 4: // восток
//                if (command == 1) return 1;    // налево -> север
//                if (command == -1) return 3;   // направо -> юг
//                if (command == 2) return 2;    // 180° -> запад
//                break;
//            default:
//                System.out.println("Неверная ориентация: " + orientation);
//                break;
//        }
//        System.out.println("Неверная команда: " + command);
//        return orientation; // Возвращаем без изменений, если команда неверна
//        scanner.close();
//    }
//}

//Найти минимальный и максимальный из данных десяти элементов.
/*public class Main {
    public static void main(String[] args) {
        //double[] numbers = {2, 6, 8, 3, 5, 8, 4, 7, 0, 1};
        double [] numbers = new double[10];
        System.out.println("Введите элементы массива: ");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextDouble();
        }
        for(double element : numbers){
            System.out.print(element + "\t");
        }
        double max = numbers[0];
        double min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println();
        System.out.println("Максимальный элемент равен: " + max);

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Минимальный элемент равен: " + min);
        scanner.close();
    }
}
*/
//Даны числа a, b (0 < a < b) и набор из десяти элементов. Найти минимальный из элементов,
// содержащихся в интервале (a, b). Если требуемые элементы отсутствуют, то вывести –1.
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double a, b;
//
//        while (true) {
//            System.out.print("Введите число a, большее нуля: ");
//            a = scanner.nextDouble();
//            System.out.print("Введите число b, большее a: ");
//            b = scanner.nextDouble();
//
//            if (a > 0 && b > a) {
//                break;
//            } else {
//                System.out.println("Ошибка! Убедитесь, что 0 < a < b.");
//            }
//        }
//
//        double [] numbers = new double[10];
//        System.out.println("Введите элементы массива: ");
//        for (int i = 0; i < numbers.length; i++){
//            numbers[i] = scanner.nextDouble();
//        }
//
//        for(double element : numbers){
//            System.out.print(element + "\t");
//        }
//
//        double[] new_numbers = new double[numbers.length];
//        int count = 0;
//
//        for (double element : numbers) {
//            if (element > a && element < b) {
//                new_numbers[count] = element;
//                count++;
//            }
//        }
//
//        if (count == 0) {
//            System.out.println("\n-1");
//        } else {
//            double min = new_numbers[0];
//            for (int i = 1; i < count; i++) {
//                if (new_numbers[i] < min) {
//                    min = new_numbers[i];
//                }
//            }
//            System.out.println("\nМинимальный элемент в интервале (" + a + ", " + b + "): " + min);
//        }
//
//        scanner.close();
//    }
//}

//Дана вещественная матрица А, размерностью n*m.
//Найти произведение квадратов отрицательных элементов.
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите количество строк (n): ");
//        int n = scanner.nextInt();
//        System.out.print("Введите количество столбцов (m): ");
//        int m = scanner.nextInt();
//        double P = 1;
//        boolean foundNegative = false;
//
//        double[][] A = new double[n][m];
//
//        System.out.println("Введите элементы матрицы A (" + n + "x" + m + "):");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print("A[" + i + "][" + j + "] = ");
//                A[i][j] = scanner.nextDouble();
//            }
//        }
//
//        System.out.println("Введённая матрица A:");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.printf("%8.2f"  ,A[i][j]);
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (A[i][j] < 0) {
//                    P *= Math.pow(A[i][j], 2);
//                    foundNegative = true;
//                }
//            }
//        }
//
//        if (foundNegative){
//            System.out.println("Произведение квадратов отрицательных элементов матрицы равно: " + P);
//        }else{
//            System.out.println("Отрицательные элементы отсутствуют");
//        }
//        scanner.close();
//    }
//}

//Дана матрица размера 5 x 9. Найти суммы элементов всех ее четных строк.
public class Main {
    public static void main(String[] args) {
        double[][] A = new double[5][9];
        Random r = new Random();

        // Заполняем матрицу случайными числами от 0 до 15 и выводим её
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                A[i][j] = r.nextDouble() * 15;//случайные числа от 0 до 15
                System.out.printf("%8.2f",A[i][j]);
            }
            System.out.println();
        }

        // Суммы элементов четных строк (нумерация с 0)
        System.out.println("\nСуммы элементов четных (по индексу) строк:");
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) { // если четная строка: 0, 2, 4  или  можно if ((i + 1) % 2 == 0), если четная по счету
                double sum = 0;
                for (int j = 0; j < 9; j++) {
                    sum += A[i][j];
                }
                System.out.printf("Сумма элементов %d-й строки: %.2f\n", i, sum);
            }
        }
    }
}
