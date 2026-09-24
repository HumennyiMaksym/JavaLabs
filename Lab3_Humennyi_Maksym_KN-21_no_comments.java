import java.util.Scanner;
import java.util.Formatter;

public class Lab3_Humennyi_Maksym_KN_21 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ціле число: ");
        int number = scanner.nextInt();

        System.out.print("Введіть число з плаваючою точкою: ");
        double decimal = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Введіть строку: ");
        String text = scanner.nextLine();

        System.out.print("Введіть логічне значення (true/false): ");
        boolean bool = scanner.nextBoolean();

        System.out.println("\n--- Результати форматування ---");

        System.out.printf("1. Десятковий формат: %d%n", number);
        System.out.printf("2. Шістнадцятковий формат: %x%n", number);
        System.out.printf("3. Вісімковий формат: %o%n", number);
        System.out.printf("4. Число з плаваючою точкою: %.2f%n", decimal);

        System.out.println(String.format("5. Рядок: %s", text));
        System.out.println(String.format("6. Рядок у полі 20 символів: %20s", text));
        System.out.println(String.format("7. Перші 5 символів рядка: %.5s", text));

        Formatter formatter = new Formatter();
        formatter.format("8. Логічне значення: %b%n", bool);
        formatter.format("9. Дробове число, ширина 10: %10.2f%n", decimal);
        formatter.format("10. Рядок у полі 15 символів: %-15s%n", text);

        System.out.print(formatter);

        formatter.close();
        scanner.close();
    }
}
