
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * компоненты, представляющие сведения о плательщике ТПО
 * 
 * <p>Java class for CRPayerDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRPayerDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CRSubjectDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CRFactPayerDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRPayerDetailsType", propOrder = {
    "crFactPayerDetails"
})
public class CRPayerDetailsType
    extends CRSubjectDetailsType
{

    @XmlElement(name = "CRFactPayerDetails")
    protected CRSubjectDetailsType crFactPayerDetails;

    /**
     * Gets the value of the crFactPayerDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CRSubjectDetailsType }
     *     
     */
    public CRSubjectDetailsType getCRFactPayerDetails() {
        return crFactPayerDetails;
    }

    /**
     * Sets the value of the crFactPayerDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRSubjectDetailsType }
     *     
     */
    public void setCRFactPayerDetails(CRSubjectDetailsType value) {
        this.crFactPayerDetails = value;
    }

}
