package model;


public class TroisD extends DeuxD {
	private int z;
	
	public TroisD(int x, int y, int z){
		super(x,y); // on met d'abord le super car il appele d'abord la mere et ensuite la fille
		this.z = z;
		
	}

	@Override
	public String toString() {
		return super.toString() + " z=" + z + "]";
	}
	
	
	

}
