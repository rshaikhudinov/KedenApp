
package KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CommunicationChannelCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CommunicationChannelCodeType"&gt;
 *   &lt;restriction base="{urn:EEC:M:BaseDataTypes:v0.4.14}CodeType"&gt;
 *     &lt;enumeration value="AO"/&gt;
 *     &lt;enumeration value="EM"/&gt;
 *     &lt;enumeration value="FX"/&gt;
 *     &lt;enumeration value="TE"/&gt;
 *     &lt;enumeration value="TG"/&gt;
 *     &lt;enumeration value="TL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CommunicationChannelCodeType")
@XmlEnum
public enum CommunicationChannelCodeType {


    /**
     * адрес сайта в сети Интернет
     * 
     */
    AO,

    /**
     * электронная почта
     * 
     */
    EM,

    /**
     * телефакс
     * 
     */
    FX,

    /**
     * телефон
     * 
     */
    TE,

    /**
     * телеграф
     * 
     */
    TG,

    /**
     * телекс
     * 
     */
    TL;

    public String value() {
        return name();
    }

    public static CommunicationChannelCodeType fromValue(String v) {
        return valueOf(v);
    }

}
