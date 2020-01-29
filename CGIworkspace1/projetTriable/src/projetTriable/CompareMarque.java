package projetTriable;

import java.util.Comparator;

public class CompareMarque implements Comparator<Article> {

	
	public int compare(Article o1, Article o2) {
		// TODO Auto-generated method stub
		return o1.getMarque().compareTo(o2.getMarque());
	}
	

}
