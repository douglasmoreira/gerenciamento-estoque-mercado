package br.com.zup.gerenciaestoquemercado.programaprincipal;

import java.util.Scanner;

import br.com.zup.gerenciaestoquemercado.Produto.ProdutoAlimenticio;
import br.com.zup.gerenciaestoquemercado.Produto.ProdutoLimpeza;
import br.com.zup.gerenciaestoquemercado.estoque.EstoqueAlimenticio;
import br.com.zup.gerenciaestoquemercado.estoque.EstoqueLimpeza;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		EstoqueLimpeza estoqueLimpeza = new EstoqueLimpeza();
		EstoqueAlimenticio estoqueAlimenticio = new EstoqueAlimenticio();
			
		int opcao = 0;
		
		do {
			opcao = menu(input, estoqueLimpeza, estoqueAlimenticio);		
		}while(opcao != 0);
	}

	public static int menu(Scanner input, EstoqueLimpeza estoqueLimpeza, EstoqueAlimenticio estoqueAlimenticio) {
		
		System.out.printf("%-65s %s\n","Para manipular o menu Produtos Alimenticios","digite 1:");
		System.out.printf("%-65s %s\n","Para manipular o menu Produtos de Limpeza","digite 2:");
		System.out.printf("%-65s %s\n","Para encerar o Programa","digite 0:");
		int opcao = input.nextInt();
		
		switch (opcao) {
		case 1:
			subMenuprodutoAlimenticio(input, estoqueAlimenticio);
			break;

		case 2:
			subMenuprodutoLimpeza(input, estoqueLimpeza);
			break;
		}
		
		return opcao;
	}
	
	public static int subMenuprodutoLimpeza(Scanner input, EstoqueLimpeza estoqueLimpeza) {
		
		int opcao = 0;
		
		do {
			
			System.out.printf("%-65s %s\n","para cadastrar produto de limpeza", "digite 1");
			System.out.printf("%-65s %s\n","Para remover produto de limpeza", "digite 2");
			System.out.printf("%-65s %s\n","Para exibir a lista de produtos", "digite 3");
			System.out.printf("%-65s %s\n","Para alterar o preço de todos os produtos", "digite 4");
			System.out.printf("%-65s %s\n","Para alterar o preço de um produto", "digite 5");
			System.out.printf("%-65s %s\n","Para consultar um produto", "digite 6");
			System.out.printf("%-65s %s\n","Para gravar a lista de produtos em um arquivo ProdutoLimpeza.txt", "digite 7");
			System.out.printf("%-65s %s\n","Para saber a quantidade de todos os produtos na lista", "digite 8");
			System.out.printf("%-65s %s\n","Para voltar ao menu anterior","digite 0");
			opcao= input.nextInt();
			
			switch (opcao) {
			case 1:
				cadastraProdutoLimpeza(input, estoqueLimpeza);
				
				break;
				
			case 2:
				break;
				
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 0:
				break;
			}
		} while (opcao != 0);
		
		
		return opcao;
	}
	
	public static int subMenuprodutoAlimenticio(Scanner input, EstoqueAlimenticio estoqueAlimenticio) {
	
	int opcao = 0;
	
	do {
		
		System.out.printf("%-65s %s\n","Para cadastrar produto de alimenticios", "digite 1");
		System.out.printf("%-60s %s\n","Para remover produto de alimenticios", "digite 2");
		System.out.printf("%-60s %s\n","Para exibir a lista de produtos", "digite 3");
		System.out.printf("%-60s %s\n","Para alterar o preço de todos os produtos", "digite 4");
		System.out.printf("%-60s %s\n","Para alterar o preço de um produto", "digite 5");
		System.out.printf("%-60s %s\n","Para consultar um produto", "digite 6");
		System.out.printf("%-60s %s\n","Para gravar a lista de produtos em um arquivo ProdutoAlimenticios.txt", "digite 7");
		System.out.printf("%-60s %s\n","Para saber a quantidade de todos os produtos na lista", "digite 8");
		System.out.printf("%-60s %s\n","Para voltar ao menu anterior","digite 0");
		opcao= input.nextInt();
		
		switch (opcao) {
		case 1:
			cadastraProdutoAlimenticio(input, estoqueAlimenticio);
			break;
			
		case 2:
			break;
			
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 8:
			break;
		case 0:
			break;
		}
	} while (opcao != 0);
		
		return opcao;
	}

	public static boolean cadastraProdutoLimpeza(Scanner input, EstoqueLimpeza estoqueLimpeza) {
		
		try {
			System.out.println("digite o nome do produto:");
			String nomeProduto = input.next();
			System.out.println("Digite o número do código de barras do produto:");
			int codigoBarras = input.nextInt();
			System.out.println("Digite o Preço de custo:");
			float precoCusto = input.nextFloat();
			System.out.println("Digite o preço de venda:");
			float precoVenda = input.nextFloat();
			System.out.println("Digite a data de validade:");
			String dataValidade = input.next();
			System.out.println("Digite o aroma:");
			String aromaProduto = input.next();
			System.out.println("Digite a parte da casa:");
			String parteDaCasa = input.next();
			
			ProdutoLimpeza produtoLimpeza = new ProdutoLimpeza(nomeProduto, precoVenda, precoCusto, codigoBarras, 
					dataValidade, aromaProduto, parteDaCasa);
			estoqueLimpeza.cadastraProduto(produtoLimpeza);
			
			return true;
		} catch (Exception e) {
			System.out.println("erro ao cadastrar produto, verifique se inseriu todos os valores e se estes são do formato correto");
		}
		return false;
	}
	
	public static boolean cadastraProdutoAlimenticio(Scanner input, EstoqueAlimenticio estoqueAlimenticio) {
		
		try {
			System.out.println("Digite o nome do produto:");
			String nomeProduto = input.next();
			System.out.println("Digite o número do código de barras do produto:");
			int codigoBarras = input.nextInt();
			System.out.println("Digite o preço de custo:");
			float precoCusto = input.nextFloat();
			System.out.println("Digite o preço de venda:");
			float precoVenda = input.nextFloat();
			System.out.println("Digite a data de validade:");
			String dataValidade = input.next();
			System.out.println("Digite a origem:");
			String origem = input.next();
			
			ProdutoAlimenticio produtoAlimenticio = new ProdutoAlimenticio(nomeProduto, precoVenda, precoCusto, codigoBarras, 
					dataValidade, origem );
			estoqueAlimenticio.cadastraProduto(produtoAlimenticio);
			
			return true;
		} catch (Exception e) {
			System.out.println("Erro ao cadastrar produto, verifique se inseriu todos os valores e se estes são do formato correto");
		}
		return false;
	}
}
