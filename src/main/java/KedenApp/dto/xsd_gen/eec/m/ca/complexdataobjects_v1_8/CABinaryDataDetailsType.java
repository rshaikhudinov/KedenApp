
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4.CheckSumIdType;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Компоненты, представляющие метаинформацию о бинарных данных
 * 
 * <p>Java class for CABinaryDataDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CABinaryDataDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}BinaryFileName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}MediaTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}SignIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}CheckSumId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}CryptoIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}LoadingIndicator"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}DescriptionText" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CABinaryDataDetailsType", propOrder = {
    "binaryFileName",
    "mediaTypeCode",
    "signIndicator",
    "checkSumId",
    "cryptoIndicator",
    "loadingIndicator",
    "descriptionText"
})
public class CABinaryDataDetailsType {

    @XmlElement(name = "BinaryFileName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String binaryFileName;
    @XmlElement(name = "MediaTypeCode", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String mediaTypeCode;
    @XmlElement(name = "SignIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean signIndicator;
    @XmlElement(name = "CheckSumId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected CheckSumIdType checkSumId;
    @XmlElement(name = "CryptoIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean cryptoIndicator;
    @XmlElement(name = "LoadingIndicator", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    protected Boolean loadingIndicator;
    @XmlElement(name = "DescriptionText", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    protected String descriptionText;

    /**
     * Gets the value of the binaryFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinaryFileName() {
        return binaryFileName;
    }

    /**
     * Sets the value of the binaryFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinaryFileName(String value) {
        this.binaryFileName = value;
    }

    /**
     * Кодовое обозначение формата данных
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMediaTypeCode() {
        return mediaTypeCode;
    }

    /**
     * Sets the value of the mediaTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMediaTypeCode(String value) {
        this.mediaTypeCode = value;
    }

    /**
     * признак подписания данных электронной цифровой подписью (электронной подписью)
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSignIndicator() {
        return signIndicator;
    }

    /**
     * Sets the value of the signIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSignIndicator(Boolean value) {
        this.signIndicator = value;
    }

    /**
     * Контрольная сумма бинарных данных
     * 
     * @return
     *     possible object is
     *     {@link CheckSumIdType }
     *     
     */
    public CheckSumIdType getCheckSumId() {
        return checkSumId;
    }

    /**
     * Sets the value of the checkSumId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckSumIdType }
     *     
     */
    public void setCheckSumId(CheckSumIdType value) {
        this.checkSumId = value;
    }

    /**
     * Gets the value of the cryptoIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCryptoIndicator() {
        return cryptoIndicator;
    }

    /**
     * Sets the value of the cryptoIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCryptoIndicator(Boolean value) {
        this.cryptoIndicator = value;
    }

    /**
     * признак загрузки бинарных данных на материальный носитель
     * 
     */
    public Boolean isLoadingIndicator() {
        return loadingIndicator;
    }

    /**
     * Sets the value of the loadingIndicator property.
     * 
     */
    public void setLoadingIndicator(Boolean value) {
        this.loadingIndicator = value;
    }

    /**
     * Описание информации, содержащейся в бинарных данных
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionText() {
        return descriptionText;
    }

    /**
     * Sets the value of the descriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionText(String value) {
        this.descriptionText = value;
    }

}
