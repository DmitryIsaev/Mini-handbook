import java.math.BigDecimal;

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
        System.out.println("division1 = " + division1 + "\ndivision2 = " + division2 + "\ndivision3 = " + division3);

        int division4 = 100 / 10 / 2;
        System.out.println("division4 = " + division4);

        int division5 = 100 / (10 / 2);
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

        int result3 = 10 * 10 / 2 + 5 * (20 / 4); //1.Действие в скобках; 2.Умножение и деление; 3.Сложение и вычитание
        System.out.println("result3 = " + result3);

        int result4 = 100 / 8;
        System.out.println("result4 = " + result4); //Округляется без остатка

        //Все типы данных, включенные в математическое выражение, должны быть типами с плавающей запятой
        double result5 = (double) 100 / 8; //Либо так: double result5 = 100.0 / 8.0;
        System.out.println("result5 = " + result5); //Результат 12.5

        double doubleResult = 100D / 8D; //Ещё один способ обозначать подходящий тип
        float floatResult = 100F / 8F;
        System.out.println("doubleResult = " + doubleResult + "\nfloatResult = " + floatResult);

        //Типы данных с плавающей запятой не дают точных результатов:
        double resultDbl = 0D;
        System.out.println("resultDbl = " + resultDbl);
        for (int i = 0; i < 100; i++) {
            resultDbl += 0.01D;
        }
        System.out.println("resultDbl = " + resultDbl);

        //Вариант 1
        for (int i = 0; i < 10; i++)
            System.out.println(i / 10D);

        //Вариант 2. Использовать тип BigDecimal
        BigDecimal step = new BigDecimal("0.1");
        for (BigDecimal value1 = BigDecimal.ZERO;
             value1.compareTo(BigDecimal.ONE) < 0;
             value1 = value1.add(step)) {
            System.out.println(value1);
        }

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