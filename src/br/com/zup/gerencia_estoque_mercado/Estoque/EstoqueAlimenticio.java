package br.com.zup.gerencia_estoque_mercado.Estoque;

import java.util.Map;

import br.com.zup.gerencia_estoque_mercado.Produto.Produto;
import br.com.zup.gerencia_estoque_mercado.Produto.ProdutoAlimenticio;

public class EstoqueAlimenticio extends Estoque{

	private ProdutoAlimenticio produtosAlimenticio;
	
	@Override
	public boolean cadastraProduto(Produto produto) {
		return super.cadastraProduto(produtosAlimenticio);
	}

	@Override
	public boolean gravaListaProdutos(Map<Integer, Produto> produtos) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
