package repository;

import Model.Produto;

import java.util.HashMap;
import java.util.Map;

public class ProdutoRepository {
    private Map<String, Produto> produtos;

    public ProdutoRepository(){
        this.produtos = new HashMap<String, Produto>();
    }

    public Map<String, Produto> getProdutos() {
        return produtos;
    }

    public void addProduto(Produto produto) {
        this.produtos.put(produto.getId(),produto);
    }
}
