package prjRESTClient;

public class Info {
	private int a;
	private int b;
	public Info() {
	}
	
	public Info(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "Info [a=" + a + ", b=" + b + "]";
	}
	
}
