package formationSpring.beans;

import java.util.List;
import java.util.Map;

public class javaCollection {
	private List<Integer> adresseList;
	private Map adresseMap;

	public javaCollection(List<Integer> adresseList) {

		this.adresseList = adresseList;
	}

	public javaCollection() {

	}

	public List<Integer> getAdresseList() {
		return adresseList;
	}

	public void setAdresseList(List<Integer> adresseList) {
		this.adresseList = adresseList;
	}

	public Map getAdresseMap() {
		return adresseMap;
	}

	public void setAdresseMap(Map adresseMap) {
		this.adresseMap = adresseMap;
	}

	@Override
	public String toString() {
		return "javaList " + adresseList;
	}

}
