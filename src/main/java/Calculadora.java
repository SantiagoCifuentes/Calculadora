import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class Calculadora
{
    public static void main(String[] args)
    {
        int num1 = 8, num2 = 2;

        System.out.println("Suma: " + sumar.apply(num1, num2));
        System.out.println("Resta: " + restar.apply(num1, num2));
        System.out.println("Multiplicación: " + multir.apply(num1, num2));

    }

    public static BiFunction<Integer, Integer, Integer> sumar = (num1, num2) -> num1 + num2;

    public static BiFunction<Integer, Integer, Integer> restar = (num1, num2) -> num1 - num2;

    public static BiFunction<Integer, Integer, Integer> multir = (num1, num2) ->
    {
        return IntStream.range(0, num2+1)
                .reduce((acumulador, numero) -> sumar.apply(acumulador, num1))
                .getAsInt();
    };


    //TODO terminar bien el algoritmo ya que no funciona correctamente
    public static BiFunction<Integer, Integer, Integer> div = (numerador, denominador) ->
    {
        return IntStream.range(0, denominador > numerador ? denominador+1: numerador+1)
                .reduce((acumulador,numero)->
                        multir.apply(numero,denominador) < numerador ? acumulador+1 : acumulador

                ).getAsInt();
    };


}
