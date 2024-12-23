
package KedenApp.dto.xsd_gen.eec.r_043_expresscargodeclaration_v2_1;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eec.r._043.expresscargodeclaration.v2_1 package. 
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

    private final static QName _ExpressCargoDeclaration_QNAME = new QName("urn:EEC:R:043:ExpressCargoDeclaration:v2.1.0", "ExpressCargoDeclaration");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eec.r._043.expresscargodeclaration.v2_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExpressCargoDeclarationType }
     * 
     */
    public ExpressCargoDeclarationType createExpressCargoDeclarationType() {
        return new ExpressCargoDeclarationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExpressCargoDeclarationType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExpressCargoDeclarationType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:EEC:R:043:ExpressCargoDeclaration:v2.1.0", name = "ExpressCargoDeclaration")
    public JAXBElement<ExpressCargoDeclarationType> createExpressCargoDeclaration(ExpressCargoDeclarationType value) {
        return new JAXBElement<ExpressCargoDeclarationType>(_ExpressCargoDeclaration_QNAME, ExpressCargoDeclarationType.class, null, value);
    }

}
