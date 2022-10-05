package Services;

import Model.Produto;
import repository.ProdutoRepository;

public class ProdutoService {
    ProdutoRepository produtoRepository;

    public String criarProduto(String nome, int preco, String fabricante,String id){
        Produto produto = new Produto(nome,preco,fabricante,id);
        produtoRepository.addProduto(produto);
        return produto.toString();
    }
}
