package prjRESTClient;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CalcInfo {
	private int a;
	private int b;
	
	
	
	public CalcInfo(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}


	public CalcInfo() {
		super();
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
		return "CalcInfo [a=" + a + ", b=" + b + "]";
	}
	
	
}
