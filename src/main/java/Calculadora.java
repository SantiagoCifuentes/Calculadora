import java.util.function.BiFunction;

public class Calculadora
{
    public static void main(String[] args)
    {
        int num1 = 8, num2 = 2;

        System.out.println("Suma: " + sumar.apply(num1, num2));
        System.out.println("Resta: " + restar.apply(num1, num2));

    }

    public static BiFunction<Integer, Integer, Integer> sumar = (num1, num2) -> num1 + num2;

    public static BiFunction<Integer, Integer, Integer> restar = (num1, num2) -> num1 - num2;


}
