package br.com.zup.gerencia_estoque_mercado.Estoque;

import java.util.Map;

import br.com.zup.gerencia_estoque_mercado.Produto.Produto;
import br.com.zup.gerencia_estoque_mercado.Produto.ProdutoLimpeza;

public class EstoqueLimpeza extends Estoque{

	private ProdutoLimpeza produtosLimpeza;
	
	@Override
	public boolean cadastraProduto(Produto produto) {
		return super.cadastraProduto(produtosLimpeza);
	}
	
	
}
