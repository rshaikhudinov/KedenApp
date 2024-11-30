
package KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Числовое значение с заданной точностью, представляющее количество денежных единиц, дополненное буквенным кодом валюты, указанием на классификатор валют и показателем степени масштабного множителя
 * 
 * <p>Java class for UnifiedAccountingAmountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnifiedAccountingAmountType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;restriction base="&lt;urn:EEC:M:SimpleDataObjects:v0.4.14&gt;UnifiedAmountWithCurrencyType"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnifiedAccountingAmountType")
public class UnifiedAccountingAmountType
    extends UnifiedAmountWithCurrencyType
{


}
