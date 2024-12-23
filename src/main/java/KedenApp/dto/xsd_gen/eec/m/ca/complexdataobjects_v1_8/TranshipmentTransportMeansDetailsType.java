
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о транспортном средстве при перегрузке товара
 * 
 * <p>Java class for TranshipmentTransportMeansDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TranshipmentTransportMeansDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}TransportMeansItemDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}ReferenceObjectOrdinal" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TranshipmentTransportMeansDetailsType", propOrder = {
    "referenceObjectOrdinal"
})
public class TranshipmentTransportMeansDetailsType
    extends TransportMeansItemDetailsType
{

    @XmlElement(name = "ReferenceObjectOrdinal", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlSchemaType(name = "positiveInteger")
    protected List<BigInteger> referenceObjectOrdinal;

    /**
     * порядковый номер транспортного средства, с использованием которого осуществляется перевозка (транспортировка) товаров до совершения грузовой операции с товарами и (или) замены транспортного средства Gets the value of the referenceObjectOrdinal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the referenceObjectOrdinal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceObjectOrdinal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getReferenceObjectOrdinal() {
        if (referenceObjectOrdinal == null) {
            referenceObjectOrdinal = new ArrayList<BigInteger>();
        }
        return this.referenceObjectOrdinal;
    }

}
