package projetTriable;

import java.util.Comparator;

public class ComparePrix implements Comparator<Article> {
	
	public int compare(Article o1, Article o2) {
		// TODO Auto-generated method stub
		return ((Integer)o1.getPrix()).compareTo(o2.getPrix());
	}

}