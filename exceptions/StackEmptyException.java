/**
 * Exceção lançada quando uma operação é realizada em uma estrutura vazia.
 * Geralmente usada em contextos relacionados a operações em uma estrutura de dados.
 */
public class StackEmptyException extends RuntimeException {

    /**
     * Cria uma nova instância da exceção com uma mensagem específica.
     *
     * @param message A mensagem descritiva da exceção.
     */
    public StackEmptyException(String message) {
        super(message);
    }
}
