package model;

public class Status {

	private int expe;
	private boolean isCadre;

	public final int expePivot = 3;

	public Status(int expe) {
		this.setExpe(expe);

	}

	public void setExpe(int expe) {
		this.expe = expe;
		isCadre = (expe >= expePivot) ? true : false;
		// if(expe>expePivot)
		// isCadre=true;
		// else
		// isCadre=false;
	}

	@Override
	public String toString() {
		String result = expe + " ann�es d'exp�rience";
		result += (isCadre == true) ? " vous �tes cadre" : " vous n'�tes pas cadre";
		return result;
	}

}
