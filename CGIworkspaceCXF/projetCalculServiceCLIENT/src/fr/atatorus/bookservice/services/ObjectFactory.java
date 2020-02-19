
package fr.atatorus.bookservice.services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the fr.atatorus.bookservice.services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Add_QNAME = new QName("http://services.bookservice.atatorus.fr/", "add");
    private final static QName _AddResponse_QNAME = new QName("http://services.bookservice.atatorus.fr/", "addResponse");
    private final static QName _Div_QNAME = new QName("http://services.bookservice.atatorus.fr/", "div");
    private final static QName _DivResponse_QNAME = new QName("http://services.bookservice.atatorus.fr/", "divResponse");
    private final static QName _Mult_QNAME = new QName("http://services.bookservice.atatorus.fr/", "mult");
    private final static QName _MultResponse_QNAME = new QName("http://services.bookservice.atatorus.fr/", "multResponse");
    private final static QName _Sous_QNAME = new QName("http://services.bookservice.atatorus.fr/", "sous");
    private final static QName _SousResponse_QNAME = new QName("http://services.bookservice.atatorus.fr/", "sousResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: fr.atatorus.bookservice.services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link Div }
     * 
     */
    public Div createDiv() {
        return new Div();
    }

    /**
     * Create an instance of {@link DivResponse }
     * 
     */
    public DivResponse createDivResponse() {
        return new DivResponse();
    }

    /**
     * Create an instance of {@link Mult }
     * 
     */
    public Mult createMult() {
        return new Mult();
    }

    /**
     * Create an instance of {@link MultResponse }
     * 
     */
    public MultResponse createMultResponse() {
        return new MultResponse();
    }

    /**
     * Create an instance of {@link Sous }
     * 
     */
    public Sous createSous() {
        return new Sous();
    }

    /**
     * Create an instance of {@link SousResponse }
     * 
     */
    public SousResponse createSousResponse() {
        return new SousResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bookservice.atatorus.fr/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bookservice.atatorus.fr/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Div }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bookservice.atatorus.fr/", name = "div")
    public JAXBElement<Div> createDiv(Div value) {
        return new JAXBElement<Div>(_Div_QNAME, Div.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bookservice.atatorus.fr/", name = "divResponse")
    public JAXBElement<DivResponse> createDivResponse(DivResponse value) {
        return new JAXBElement<DivResponse>(_DivResponse_QNAME, DivResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bookservice.atatorus.fr/", name = "mult")
    public JAXBElement<Mult> createMult(Mult value) {
        return new JAXBElement<Mult>(_Mult_QNAME, Mult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MultResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bookservice.atatorus.fr/", name = "multResponse")
    public JAXBElement<MultResponse> createMultResponse(MultResponse value) {
        return new JAXBElement<MultResponse>(_MultResponse_QNAME, MultResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sous }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bookservice.atatorus.fr/", name = "sous")
    public JAXBElement<Sous> createSous(Sous value) {
        return new JAXBElement<Sous>(_Sous_QNAME, Sous.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SousResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.bookservice.atatorus.fr/", name = "sousResponse")
    public JAXBElement<SousResponse> createSousResponse(SousResponse value) {
        return new JAXBElement<SousResponse>(_SousResponse_QNAME, SousResponse.class, null, value);
    }

}
