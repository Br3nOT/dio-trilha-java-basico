public class ParametrosInvalidosException extends Exception{
    ParametrosInvalidosException(int p1, int p2 ){
        super("Você digitou " + p1 + " no primeiro parâmetro, e é maior que " +p2 + ", o segundo parâmetro.");

    }
}
