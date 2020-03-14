package br.com.zup.gerencia_estoque_mercado.manipula_arquivo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import br.com.zup.gerencia_estoque_mercado.Produto.Produto;

public class ArmazenaEmArquivo {

	public void salvaEmArquivo(Map<Integer,Produto> produtos) {
		
		FileWriter writer;
		try {
			writer = new FileWriter("produtosLimpeza.txt");
			for(Produto produto : produtos.values()) {
				String stringProduto = String.format("%-20s %-10d %-10s %-5f %-5f", produto.getNome(), produto.getCodigoDeBarras(),
						produto.getDataValidade(), produto.getPrecoCusto(), produto.getPrecoVenda());
			writer.append(stringProduto);
			}
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
