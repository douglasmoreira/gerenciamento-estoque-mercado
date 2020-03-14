package br.com.zup.gerencia_estoque_mercado.Produto;

public class ProdutoAlimenticio extends Produto {

	private String origem;

	 public ProdutoAlimenticio(String nome, float precoVenda, float precoCusto, int codigoDeBarras,
			String dataValidade, String origem) {
		super(nome, precoVenda, precoCusto, codigoDeBarras, dataValidade);
		this.origem = origem;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	 
}
