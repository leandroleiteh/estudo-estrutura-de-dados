public class PilhaExecute {

  public static void main(String[] args) {
    Pilha pilha = new Pilha(5);

    pilha.push(5);
    pilha.push(4);
    pilha.push(3);
    pilha.push(2);
    pilha.push(1);

    while (!pilha.isEmpty()) {
        int e = pilha.pop();
        System.out.println("O Numero Desempilhado foi: " + e);
    }

    //exemplo para forçar uma exceção caso a pilha esteja vazia e eu tente usar mais um pop();
    pilha.pop();

  }
}
