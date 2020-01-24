package projetSingleton;

public class Singleton {
	

	
	  private static Singleton _instance = new Singleton();
	  
	  private int prix = 10;

	  // Constructor is 'protected'
	  
	  public int  getPrix(){
		  return prix;
	  }

	  private Singleton()
	  {
	  }

	  public static Singleton getInstance()
	  {
	    // Uses lazy initialization.

	    // Note: this is not thread safe.

	 

	    return _instance;
	  }
	
	}

