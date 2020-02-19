
package fr.atatorus.bookservice.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour mult complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="mult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nb1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="nb2" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mult", propOrder = {
    "nb1",
    "nb2"
})
public class Mult {

    protected int nb1;
    protected int nb2;

    /**
     * Obtient la valeur de la propriété nb1.
     * 
     */
    public int getNb1() {
        return nb1;
    }

    /**
     * Définit la valeur de la propriété nb1.
     * 
     */
    public void setNb1(int value) {
        this.nb1 = value;
    }

    /**
     * Obtient la valeur de la propriété nb2.
     * 
     */
    public int getNb2() {
        return nb2;
    }

    /**
     * Définit la valeur de la propriété nb2.
     * 
     */
    public void setNb2(int value) {
        this.nb2 = value;
    }

}
