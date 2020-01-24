package model;

public class Utils {
	public static String firstUpper(String s){
		return s.substring(0, 1).toUpperCase()+s.substring(1).toLowerCase();
	}
	public static void affTab(int[] tab) {
		String res = "";
		for(int i:tab)res+=i+"\t";
		System.out.println(res);
	}
	public static void affTab(String[] tab) {
		String res = "";
		for(String s:tab)res += s + "\t";
		System.out.println(res);
	}
	public static int[] reverse(int[] t) {
		int[] tr = new int[t.length];
		for(int i =0; i<t.length; i++)
			tr[t.length-i-1]=t[i];
		return tr;
	}
	public static String[] reverse(String[] t) {
		String[] tr = new String[t.length];
		for(int i =0; i<t.length; i++)
			tr[t.length-i-1]=t[i];
		return tr;
	}

	public static void sortBub(int[] t) {
		Boolean inv = true;
		int turn = 0;
		while(inv) {
			inv = false;
			for (int i = 0 ; i < t.length - 1 - turn ; i++) {
				if(t[i] > t[i+1]) {
					int tmp = t[i];
					t[i] = t[i+1];
					t[i+1] = tmp;
					inv = true;
				}
			}
			turn++;
		}
	}
}
