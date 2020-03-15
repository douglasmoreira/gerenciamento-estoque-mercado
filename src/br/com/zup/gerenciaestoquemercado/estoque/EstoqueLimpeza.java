package br.com.zup.gerenciaestoquemercado.estoque;

import java.util.Map;

import br.com.zup.gerencia_estoque_mercado.manipula_arquivo.ArmazenaEmArquivo;
import br.com.zup.gerenciaestoquemercado.Produto.Produto;

public class EstoqueLimpeza extends Estoque{
	
	@Override
	public boolean cadastraProduto(Produto produto) {
		return super.cadastraProduto(produto);
	}

	@Override
	public boolean gravaListaProdutos(Map<Integer, Produto> produtos) {
		ArmazenaEmArquivo.salvaProdutoLimpezasEmArquivo(produtos);
		
		return false;
	}
	
	
}
