package projetClientBookService;



public class Test {

	public static void main(String[] args) {
		
		Hello c = new HelloService().getHelloPort(); 
		System.out.println(c.hello("ahdh"));

	}

}
