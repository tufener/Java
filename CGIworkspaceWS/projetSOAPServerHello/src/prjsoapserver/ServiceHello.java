package prjsoapserver;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "HelloSoapWS")
public class ServiceHello {
	
	@WebMethod(operationName = "hello")
	public String hello() {
		return "Hello Hugo";
	}

	@WebMethod(operationName = "hellov2")
	public String hellov2(@WebParam(name = "x") String a) {
		return "hello " + a;
	}

}
