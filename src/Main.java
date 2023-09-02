public class Main {
    public static void main(String[] args) {
        int sum1 = 10 + 20;
        int sum2 = sum1 + 33;
        int sum3 = sum2 + sum2;
        System.out.println("sum1 = " + sum1 + "\nsum2 = " + sum2 + "\nsum3 = " + sum3);

        int result = 10;
        result += 20;            //result = result + 20
        System.out.println("result = " + result);

        int diff1 = 200 - 10;
        int diff2 = diff1 - 5;
        int diff3 = diff1 - diff2;
        System.out.println("diff1 = " + diff1 + "\ndiff2 = " + diff2 + "\ndiff3 = " + diff3);

        diff3 = diff1 - (-20);  //Минус на минус даёт плюс
        System.out.println("diff3 = " + diff3);

        result -= 15;           //result = result - 15
        System.out.println("result = " + result);

        int prod1 = 10 * 20;
        int prod2 = prod1 * 5;
        int prod3 = prod1 * prod2;
        System.out.println("prod1 = " + prod1 + "\nprod2 = " + prod2 + "\nprod3 = " + prod3);

        result *= 20;           //result = result * 20
        System.out.println("result = " + result);

        int division1 = 100 / 10;
        int division2 = division1 / 2;
        int division3 = division1 / division2;
        System.out.println("division1 = "+ division1 + "\ndivision2 = "+ division2 + "\ndivision3 = " + division3);

        int division4 = 100 / 10 / 2;
        System.out.println("division4 = " + division4);

        int division5 = 100 /(10 / 2);
        System.out.println("division5 = " + division5);

        int result1 = 100;
        result1 /= 5;           //result = result / 20
        System.out.println("result1 = " + result1);

        int value = 100;
        int remainder = value % 9; //Остаток от деления 100 на 9
        System.out.println("remainder = " + remainder);

        int result2 = 100;
        result2 %= 9;           //remainder = value % 9
        System.out.println("result2 = " + result2);

        int a = 2;
        int b = 3;
        //Формулы сокращенного умножения
        System.out.println("Квадрат суммы: (a+b)^2 = " + (a * a + 2 * a * b + b * b));
        System.out.println("Квадрат разности: (a-b)^2 = " + (a * a - 2 * a * b + b * b));
        System.out.println("Разность квадратов: a^2-b^2 = " + ((a + b) * (a - b)));
        System.out.println("Разность кубов: a^3-b^3 = " + ((a - b) * (a * a + a * b + b * b)));
        System.out.println("Сумма кубов: a^3+b^3 = " + ((a + b) * (a * a - a * b + b * b)));
        System.out.println("Куб суммы: (a+b)^3 = " + (a * a * a + 3 * a * a * b + 3 * a * b * b + b * b * b));
        System.out.println("Куб разности: (a-b)^3 = " + (a * a * a - 3 * a * a * b + 3 * a * b * b - b * b * b));
    }
}