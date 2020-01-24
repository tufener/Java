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
		String result = expe + " années d'expérience";
		result += (isCadre == true) ? " vous êtes cadre" : " vous n'êtes pas cadre";
		return result;
	}

}
