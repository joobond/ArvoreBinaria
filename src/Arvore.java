public class Arvore {

    private int conteudo;
    private Arvore esquerda;
    private Arvore direita;

    //Constructor
    public Arvore(int conteudo) {
        this.conteudo = conteudo;
        esquerda = direita = null;
    }

    public void inserir(int valor){

        //Criando uma nova árvore
        Arvore novaArvore = new Arvore(valor);

        //Inserir na esquerda
        if(valor < conteudo){
            if(esquerda == null){
                esquerda = new Arvore(valor);
                System.out.println(valor+" a esqueda de "+conteudo);
            }else{
                esquerda.inserir(valor);
            }
        }else if(valor > conteudo){ //Inserir na direita
            if(direita == null){
                direita = new Arvore(valor);
                System.out.println(valor+" a direita de "+conteudo);
            }else{
                direita.inserir(valor);
            }
        }
    }

    public void preOrdem(){

        //Visitar Raíz
        System.out.print(conteudo + " ");

        //Percorrer a esquerda
        if(esquerda != null){
            esquerda.preOrdem();
        }

        //Percorrer a direita
        if(direita != null){
            direita.preOrdem();
        }
    }

    public void inOrdem(){

        if(esquerda != null){
            esquerda.inOrdem();
        }

        System.out.print(conteudo + " ");

        if(direita != null){
            direita.inOrdem();
        }
    }

    public void posOrdem(){

        if(esquerda != null){
            esquerda.posOrdem();
        }

        if(direita != null){
            direita.posOrdem();
        }

        System.out.print(conteudo + " ");
    }

    public void inOrdemInvertida(){

        if(direita != null){
            direita.inOrdemInvertida();
        }

        System.out.print(conteudo + " ");

        if(esquerda != null){
            esquerda.inOrdemInvertida();
        }
    }











    //Getters e Setters
    public int getConteudo() {
        return conteudo;
    }

    public void setConteudo(int conteudo) {
        this.conteudo = conteudo;
    }

    public Arvore getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(Arvore esquerda) {
        this.esquerda = esquerda;
    }

    public Arvore getDireita() {
        return direita;
    }

    public void setDireita(Arvore direita) {
        this.direita = direita;
    }
}
