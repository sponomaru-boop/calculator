import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение:");
        String input = scanner.nextLine();
        System.out.println(calc(input)); //
    }
    public static String calc(String input) throws Exception {
            input = input.trim();
            String[] parts = input.split(" ");
            if (parts.length != 3) {
                throw new Exception("Неверный формат ввода: должно быть два числа и один оператор");
            }
            String leftStr = parts[0];
            String operator = parts[1];
            String rightStr = parts[2];
            int a, b;
            try {
                a = Integer.parseInt(leftStr);
                b = Integer.parseInt(rightStr);
            } catch (NumberFormatException e) {
                throw new Exception("Операнды должны быть целыми числами");
            }

            if (a < 1 || a > 10 || b < 1 || b > 10) {
                throw new Exception("Числа должны быть от 1 до 10 включительно");
            }
            int result;
            switch (operator) {
                case "+" -> result = a + b;
                case "-" -> result = a - b;
                case "*" -> result = a * b;
                case "/" -> result = a / b;
                default -> throw new Exception("Неверный оператор: допустимы +,-,*,/");
            }
            return String.valueOf(result);
        }
}