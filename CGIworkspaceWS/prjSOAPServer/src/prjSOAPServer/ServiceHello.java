package prjSOAPServer;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "HelloWS")
public class ServiceHello {

	@WebMethod(operationName = "hello")
	public String hello() {
		return "hello you";
	}

	@WebMethod(operationName = "hellov2")
	public String hellov2(@WebParam(name = "x") String a) {
		return "hello " + a;
	}

}
