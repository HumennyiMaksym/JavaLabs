import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("=== ІНФОРМАЦІЯ ПРО ПРИМІТИВНІ ТИПИ ДАНИХ ==_\n");
        printTypeInfo("Byte", Byte.SIZE, Byte.BYTES, Byte.MIN_VALUE, Byte.MAX_VALUE);
        printTypeInfo("Short", Short.SIZE, Short.BYTES, Short.MIN_VALUE, Short.MAX_VALUE);
        printTypeInfo("Integer", Integer.SIZE, Integer.BYTES, Integer.MIN_VALUE, Integer.MAX_VALUE);
        printTypeInfo("Long", Long.SIZE, Long.BYTES, Long.MIN_VALUE, Long.MAX_VALUE);
        printTypeInfo("Float", Float.SIZE, Float.BYTES, Float.MIN_VALUE, Float.MAX_VALUE);
        printTypeInfo("Double", Double.SIZE, Double.BYTES, Double.MIN_VALUE, Double.MAX_VALUE);
        printTypeInfo("Character", Character.SIZE, Character.BYTES, (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
        System.out.println("Type: Boolean");
        System.out.println("  Values: " + Boolean.FALSE + " / " + Boolean.TRUE);
        System.out.println("--------------------------------------------------");
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== ВВЕДЕННЯ ДАНИХ З ТЕРМІНАЛУ ===");
        System.out.print("Введіть значення для типу byte: ");
        String inputByte = scanner.nextLine();
        byte parsedByte = Byte.parseByte(inputByte);
        System.out.println("Успішно перетворено у byte: " + parsedByte);
        System.out.print("\nВведіть значення для типу short: ");
        String inputShort = scanner.nextLine();
        short parsedShort = Short.parseShort(inputShort);
        System.out.println("Успішно перетворено у short: " + parsedShort);
        System.out.print("\nВведіть значення для типу int: ");
        String inputInt = scanner.nextLine();
        int parsedInt = Integer.parseInt(inputInt);
        System.out.println("Успішно перетворено у int: " + parsedInt);
        System.out.print("\nВведіть значення для типу long: ");
        String inputLong = scanner.nextLine();
        long parsedLong = Long.parseLong(inputLong);
        System.out.println("Успішно перетворено у long: " + parsedLong);
        System.out.print("\nВведіть значення для типу float: ");
        String inputFloat = scanner.nextLine();
        float parsedFloat = Float.parseFloat(inputFloat);
        System.out.println("Успішно перетворено у float: " + parsedFloat);
        System.out.print("\nВведіть значення для типу double: ");
        String inputDouble = scanner.nextLine();
        double parsedDouble = Double.parseDouble(inputDouble);
        System.out.println("Успішно перетворено у double: " + parsedDouble);
        System.out.print("\nВведіть значення для типу boolean (true/false): ");
        String inputBoolean = scanner.nextLine();
        boolean parsedBoolean = Boolean.parseBoolean(inputBoolean);
        System.out.println("Успішно перетворено у boolean: " + parsedBoolean);
        System.out.print("\nВведіть символ для типу char: ");
        String inputChar = scanner.nextLine();
        if (!inputChar.isEmpty()) {
            char parsedChar = inputChar.charAt(0);
            System.out.println("Успішно перетворено у char: " + parsedChar);
        } else {
            System.out.println("Рядок порожній, символ не зчитано.");
        }

        scanner.close();
        System.out.println("\nПрограму завершено успішно!");
    }
    private static void printTypeInfo(String name, int sizeBits, int sizeBytes, Object min, Object max) {
        System.out.println("Type: " + name);
        System.out.println("  Розмір: " + sizeBits + " біт (" + sizeBytes + " байт)");
        System.out.println("  Мінімум: " + min);
        System.out.println("  Максимум: " + max);
        System.out.println("--------------------------------------------------");
    }
}

