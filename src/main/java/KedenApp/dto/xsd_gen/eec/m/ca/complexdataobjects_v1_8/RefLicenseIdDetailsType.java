
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.complexdataobjects_v0_4.DocDetailsV4Type;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Ссылочный номер разрешительного документа
 * 
 * <p>Java class for RefLicenseIdDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefLicenseIdDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:ComplexDataObjects:v0.4.14}DocDetailsV4Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}LicensedGoodsDetails"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefLicenseIdDetailsType", propOrder = {
    "licensedGoodsDetails"
})
public class RefLicenseIdDetailsType
    extends DocDetailsV4Type
{

    @XmlElement(name = "LicensedGoodsDetails", required = true)
    protected LicensedGoodsDetailsType licensedGoodsDetails;

    /**
     * Gets the value of the licensedGoodsDetails property.
     * 
     * @return
     *     possible object is
     *     {@link LicensedGoodsDetailsType }
     *     
     */
    public LicensedGoodsDetailsType getLicensedGoodsDetails() {
        return licensedGoodsDetails;
    }

    /**
     * Sets the value of the licensedGoodsDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicensedGoodsDetailsType }
     *     
     */
    public void setLicensedGoodsDetails(LicensedGoodsDetailsType value) {
        this.licensedGoodsDetails = value;
    }

}
