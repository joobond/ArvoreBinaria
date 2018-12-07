public class Teste {
    public static void main(String[] args) {

        Arvore arvore = new Arvore(4);
        arvore.inserir(2);
        arvore.inserir(1);
        arvore.inserir(3);
        arvore.inserir(6);
        arvore.inserir(7);
        arvore.inserir(5);

        System.out.println("Pre-Ordem: ");
        arvore.preOrdem();
        System.out.println("\nIn-Ordem: ");
        arvore.inOrdem();
        System.out.println("\nPos-Ordem: ");
        arvore.posOrdem();
        System.out.println("\nIn-Ordem Invertida: ");
        arvore.inOrdemInvertida();
    }
}
