package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entitities.MeuComparator;
import entitities.Produto;

public class Program {
	
	
public static int compararProdutosPorPreco(Produto p1, Produto p2) {
	
	return p1.getPreco().compareTo(p2.getPreco());
}

 public static void main(String [] args) {
		 
		 List<Produto> list = new ArrayList<Produto>();
		 
		 list.add(new Produto("Celular", 950.00));
		 list.add(new Produto("Tablet", 1500.50));
		 list.add(new Produto("Capinha de Celular", 40.0));
		 list.add(new Produto("Televisao", 800.0));
		 
		list.sort(new MeuComparator());
		
		System.out.println("Produtos ordenados por nome");
		for(Produto nickname : list) {
			System.out.println(nickname);
		}	
		
		// declarando comparator utilizando uma classe anônima
		Comparator <Produto> comp = new Comparator<Produto>() {

			@Override
			public int compare(Produto p1, Produto p2) {
				//comparando os produtos pelo preço
				return p1.getPreco().compareTo(p2.getPreco());
			}
			
		};
		
		list.sort(comp);
		
		System.out.println("\nProdutos ordenados por preço");
		for(Produto nicknamePorPreco : list) {
			System.out.println(nicknamePorPreco);
		}	
		
		
		// usando exepressão lambida. Função anônima
		// função lambda também são chamadas de arrow function
		// compilador faz inferências de tipo nas funções lambda
		Comparator <Produto> compLambda = (p1,p2) -> {
			return p1.getPreco().compareTo(p2.getPreco());
		};
		
		list.sort(compLambda);
		
		System.out.println("\nProdutos ordenados por preço usando expressão Lambda");
		for(Produto nicknamePorPreco : list) {
			System.out.println(nicknamePorPreco);
		}	
		
		
		// expressão lambda ainda mais  compacta
		
		//Comparator <Produto> compLambdaCompacta = (p1,p2) -> p1.getNome().toLowerCase().compareTo(p2.getNome().toLowerCase());
		//list.sort(compLambdaCompacta);
		
		list.sort((p1,p2) -> p1.getNome().toLowerCase().compareTo(p2.getNome().toLowerCase()));
		
		System.out.println("\nProdutos ordenados por Nome usando expressão Lambda compacta");
		for(Produto nicknamePorNome : list) {
			System.out.println(nicknamePorNome);
		}
		
		System.out.println("\nUsando uma função como agumento de outra função");
		list.sort(Program::compararProdutosPorPreco);
		list.forEach(System.out::println);
		 
	 }

}
