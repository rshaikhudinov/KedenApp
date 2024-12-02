
package KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4;

import java.math.BigDecimal;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.PaymentAmountWithCurrencyType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.XmlValue;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import lombok.Data;
import lombok.experimental.Accessors;


/**
 * Числовое значение, представляющее количество денежных единиц, дополненное буквенным кодом валюты и указанием на классификатор валют
 * 
 * <p>Java class for AmountWithCurrencyV3Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AmountWithCurrencyV3Type"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:EEC:M:BaseDataTypes:v0.4.14&gt;AmountType"&gt;
 *       &lt;attribute name="currencyCode" use="required" type="{urn:EEC:M:SimpleDataObjects:v0.4.14}CurrencyCodeV3Type" /&gt;
 *       &lt;attribute name="currencyCodeListId" use="required" type="{urn:EEC:M:SimpleDataObjects:v0.4.14}ReferenceDataIdType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountWithCurrencyV3Type", propOrder = {
    "value"
})
@XmlSeeAlso({
    PaymentAmountWithCurrencyType.class,
    AccountingAmountV3Type.class
})
@Data
@Accessors(chain = true)
public class AmountWithCurrencyV3Type {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "currencyCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String currencyCode;
    @XmlAttribute(name = "currencyCodeListId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String currencyCodeListId;
}
