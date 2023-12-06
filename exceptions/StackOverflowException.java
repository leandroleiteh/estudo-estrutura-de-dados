/**
 * Exceção lançada quando ocorre um estouro de memória (stack overflow).
 * Geralmente usada em contextos relacionados a operações em uma estrutua de dados.
 */
public class StackOverflowException extends RuntimeException {

    /**
     * Cria uma nova instância da exceção com uma mensagem específica.
     *
     * @param message A mensagem descritiva da exceção.
     */
    public StackOverflowException(String message) {
        super(message);
    }
}
