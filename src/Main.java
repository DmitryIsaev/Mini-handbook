public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println("Квадрат суммы: (a+b)^2 = " + (a * a + 2 * a * b + b * b));
        System.out.println("Квадрат разности: (a-b)^2 = " + (a * a - 2 * a * b + b * b));
        System.out.println("Разность квадратов: a^2-b^2 = " + ((a + b) * (a - b)));
        System.out.println("Разность кубов: a^3-b^3 = " + ((a - b) * (a * a + a * b + b * b)));
        System.out.println("Сумма кубов: a^3+b^3 = " + ((a + b) * (a * a - a * b + b * b)));
        System.out.println("Куб суммы: (a+b)^3 = " + (a * a * a + 3 * a * a * b + 3 * a * b * b + b * b * b));
        System.out.println("Куб разности: (a-b)^3 = " + (a * a * a - 3 * a * a * b + 3 * a * b * b - b * b * b));
    }
}