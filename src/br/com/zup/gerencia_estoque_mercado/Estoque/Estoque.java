package br.com.zup.gerencia_estoque_mercado.Estoque;

import java.util.HashMap;
import java.util.Map;

import br.com.zup.gerencia_estoque_mercado.Produto.Produto;

public abstract class Estoque {
	
	Map<Integer, Produto> produtos = new HashMap<Integer, Produto>();

	public void alteraPrecoProdutos(float porcentagem, boolean aumenta) {
		if(aumenta) {
			for (Produto produto: produtos.values()) {
				produto.setPrecoCusto((produto.getPrecoCusto() * 1.1f));
			}
		}else {
			for (Produto produto: produtos.values()) {
				produto.setPrecoCusto((produto.getPrecoCusto() * 0.9f));
			}
		}
	}
	
	public boolean cadastraProduto(Produto produto) {
		
		try {
			produtos.put(produto.getCodigoDeBarras(), produto);	
			return true;
		} catch (Exception e) {
			System.out.println("veja se inseriu os valores do produto corretamente.");
		}
		return false;
	}
	
	public boolean removeProduto (Integer codigoDeBarras) {
		
		try {
			return produtos.remove(codigoDeBarras, produtos.get(codigoDeBarras));
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
	public Map<Integer,Produto> listaProdutos() {
		
		for (Produto produto: produtos.values()) {
			System.out.printf("%d %s %s %f %f",produto.getCodigoDeBarras(), produto.getNome(),produto.getDataValidade(),
					produto.getPrecoCusto(),produto.getPrecoVenda());
		}
		return produtos;
	}
	
	public boolean alteraPrecoProduto(float porcentagem, boolean aumenta, int codigoDeBarras) {
		if(aumenta) {
			produtos.get(codigoDeBarras).setPrecoCusto((produtos.get(codigoDeBarras).getPrecoVenda() * 1.1f));
		} else {
			produtos.get(codigoDeBarras).setPrecoCusto((produtos.get(codigoDeBarras).getPrecoVenda() * 0.9f));
		}
		return true;
	}
	
	public Produto consultaProduto(Integer codigoDeBarras) {
		return produtos.get(codigoDeBarras);
	}
	
	public abstract boolean gravaListaProdutos(Map<Integer, Produto> produtos);
	
	public int quantidadeProdutosEmEstoque() {
		return produtos.size();
	}
}
