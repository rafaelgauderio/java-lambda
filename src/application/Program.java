package application;

import java.util.ArrayList;
import java.util.List;

import entitities.MeuComparator;
import entitities.Produto;

public class Program {

 public static void main(String [] args) {
		 
		 List<Produto> list = new ArrayList<Produto>();
		 
		 list.add(new Produto("Celular", 950.00));
		 list.add(new Produto("Tablet", 1500.50));
		 list.add(new Produto("Capinha de Celular", 40.0));
		 
		list.sort(new MeuComparator());
		
		System.out.println("Produtos ordenados por nome\n");
		for(Produto nickname : list) {
			System.out.println(nickname);
		}	
		 
	 }

}
