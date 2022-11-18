package entitities;

import java.util.Comparator;

public class MeuComparator implements Comparator<Produto>{
	
	 @Override
	 public int compare(Produto p1, Produto p2) {
		// 1 se o primeiro � maior, zero se � igual
		// -1 se o segundo argumento � maior	
		
		return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
	 }

}
