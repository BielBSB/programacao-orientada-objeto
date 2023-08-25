package livraria;

public class Livro {
    int id;
    String titulo;
    String anoDePublicacao;
    String editora;
    int qtdPaginas;

    Livro(int id, String titulo, String ano, String editora, int qtdPag){
        this.id = id;
        this.titulo = titulo;
        this.anoDePublicacao = ano;
        this.editora = editora;
        this.qtdPaginas = qtdPag;
    }
    
    
    String detalhar(){
        String detalhe = "";

        detalhe += "\nID: " + this.id;
        detalhe += "\nTítulo: " + this.titulo;
        detalhe += "\nAno de Publicação: " + this.anoDePublicacao;
        detalhe += "\nEditora: " + this.editora;
        detalhe += "\nQTD. Páginas: " + this.qtdPaginas;

        return detalhe;

    }

}
