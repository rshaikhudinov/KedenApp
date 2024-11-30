
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Компоненты, представляющие сведения о декларанте таможенной процедуры таможенного транзита
 * 
 * <p>Java class for PITransitDeclarantDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PITransitDeclarantDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}DeclarantDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}EqualIndicator"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PITransitDeclarantDetailsType", propOrder = {
    "equalIndicator"
})
public class PITransitDeclarantDetailsType
    extends DeclarantDetailsType
{

    @XmlElement(name = "EqualIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected boolean equalIndicator;

    /**
     * признак совпадения декларанта таможенной процедуры таможенного транзита с перевозчиком, осуществляющим перевозку товаров в соответствии с таможенной процедурой таможенного транзита
     * 
     */
    public boolean isEqualIndicator() {
        return equalIndicator;
    }

    /**
     * Sets the value of the equalIndicator property.
     * 
     */
    public void setEqualIndicator(boolean value) {
        this.equalIndicator = value;
    }

}
