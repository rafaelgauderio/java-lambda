package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entitities.MeuComparator;
import entitities.Produto;

public class Program {

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
		
		System.out.println("\nProdutos ordenados por preco");
		for(Produto nicknamePorPreco : list) {
			System.out.println(nicknamePorPreco);
		}	
		 
	 }

}
