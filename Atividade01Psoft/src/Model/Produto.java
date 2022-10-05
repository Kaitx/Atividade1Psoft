package Model;

public class Produto {
    private String nome;
    private int preco;
    private String fabricante;
    private String id;

    public Produto(String nome, int preco, String fabricante,String id){
        this.nome = nome;
        this.preco = preco;
        this.fabricante = fabricante;
        this.id = id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    @Override
    public String toString(){
        return this.id + " - "+ this.nome+" - "+ this.fabricante+ " - "+this.preco;
    }
}
