import java.math.BigDecimal;

import static java.lang.Math.*;

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

        double result6 = Math.floorDiv(17,9); //Округление
        System.out.println("result3: " + result6);
        double result7 = 17D / 9D;
        System.out.println("result4: " + result7);

        double roundedDown = round(23.445);
        double roundedUp   = round(23.545);
        System.out.println("Округление 23.445: " + roundedDown + "\nОкругление 23.545: " + roundedUp);

        double random = Math.random();
        System.out.println("Рандомное число: " + random);

        double random1 = Math.random() * 100;
        System.out.println("Рандомное число от 0 до 100: " + random1);

        //round(), floor() или ceil(). Один из трёх способов округлить
        double random2 = round(random1);
        System.out.println("Обычное округление " + (int) random2); //Обычное округление
        random2 = floor(random1);
        System.out.println("Округление к наименьшему числу " + (int) random2); //Округление к наименьшему числу
        random2 = ceil(random1);
        System.out.println("Округление к наибольшему числу " + (int) random2); //Округление к наибольшему числу

        int min = Math.min(10, 20); //Нахождение минимального числа
        System.out.println("min = " + min);

        int max = Math.max(10, 20); //Нахождение максимального числа
        System.out.println("max = " + max);

        //Возведение числа Эйлера в степень. е ~ 2,7182818284
        double exp1 = Math.exp(1);
        System.out.println("exp1 = " + exp1);
        double exp2 = Math.exp(2);
        System.out.println("exp2 = " + exp2);

        //Логарифм числа Эйлера
        double log1  = Math.log(1);
        System.out.println("log1 = " + log1);
        double log10 = Math.log(10);
        System.out.println("log10 = " + log10);

        //Логарифм числа 10
        double log10_1   = Math.log10(1);
        System.out.println("log10_1 = " + log10_1);
        double log10_100 = Math.log10(100);
        System.out.println("log10_100 = " + log10_100);

        //Число в степени
        double pow2 = Math.pow(2,2); //2^2=4
        System.out.println("pow2 = " + pow2);
        double pow8 = Math.pow(2,8); //2^8=256
        System.out.println("pow8 = " + pow8);

        //Корень квадратный числа
        double sqrt4 = Math.sqrt(4);
        System.out.println("sqrt4 = " + sqrt4);
        double sqrt9 = Math.sqrt(9);
        System.out.println("sqrt9 = " + sqrt9);

        System.out.println(Math.PI);
        //System.out.println(PI); //Или так

        //Значение синуса в радианах
        double sin = Math.sin(PI);
        System.out.println("sin = " + sin);

        //Значение косинуса в радианах
        double cos = Math.cos(Math.PI);
        System.out.println("cos = " + cos);

        //Значение тангенса в радианах
        double tan = Math.tan(Math.PI);
        System.out.println("tan = " + tan);

        //Значение синусоиды от 1 до -1
        double asin = Math.asin(1.0);
        System.out.println("asin = " + asin);

        //Значение арккосинуса от 1 до -1:
        double acos = Math.acos(1.0);
        System.out.println("acos = " + acos);

        //Значение арктангенса для значения от 1 до -1
        double atan = Math.atan(1.0);
        System.out.println("atan = " + atan);

        //Метод Math.sinh() вычисляет значение гиперболического синуса значения между 1 и -1
        double sinh = Math.sinh(1.0);
        System.out.println("sinh = " + sinh);

        //Метод Math.cosh() вычисляет значение гиперболического косинуса от 1 до -1
        double cosh = Math.cosh(1.0);
        System.out.println("cosh = " + cosh);

        //Метод Math.tanh() вычисляет значение гиперболического тангенса значения от 1 до -1
        double tanh = Math.tanh(1.0);
        System.out.println("tanh = " + tanh);

        //Метод Math.toDegrees() преобразует угол в радианах в градусы
        double degrees = Math.toDegrees(Math.PI);
        System.out.println("degrees = " + degrees);

        //Метод Math.toRadians() преобразует угол в градусах в радианы
        double radians = Math.toRadians(270);
        System.out.println("radians = " + radians);
        radians /= PI;
        System.out.println("radians = " + radians + " PI");

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