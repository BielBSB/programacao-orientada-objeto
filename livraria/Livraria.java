package livraria;

import java.util.ArrayList;

public class Livraria {
    ArrayList<Livro> livros;

    Livraria(){
        this.livros = new ArrayList<Livro>();
    }

    public void adicionarLivro(Livro l){
        this.livros.add(l);
    }

    public String listarLivros(){
        String txt = "";
        for (Livro livro : this.livros) {
            txt += "\n" + livro.id + " - " + livro.titulo;
        }
        return txt;
    }


}
