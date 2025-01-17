
package KedenApp.dto.xsd_gen.eec.m.ca.complexdataobjects_v1_8;

import java.util.ArrayList;
import java.util.List;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * компоненты, представляющие дополнительные характеристики базовых сведений товара
 * 
 * <p>Java class for CACommodityDescriptionBaseDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CACommodityDescriptionBaseDetailsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:EEC:M:CA:ComplexDataObjects:v1.8.1}CAGoodsManufacturerDetailsType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}TradeMarkName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ProductMarkName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ProductModelName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ProductId" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ProductSortName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:CA:SimpleDataObjects:v1.8.1}StandardName" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ProductInstanceId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:EEC:M:SimpleDataObjects:v0.4.14}ManufactureDate" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CACommodityDescriptionBaseDetailsType", propOrder = {
    "tradeMarkName",
    "productMarkName",
    "productModelName",
    "productId",
    "productSortName",
    "standardName",
    "productInstanceId",
    "manufactureDate"
})
public class CACommodityDescriptionBaseDetailsType
    extends CAGoodsManufacturerDetailsType
{

    @XmlElement(name = "TradeMarkName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tradeMarkName;
    @XmlElement(name = "ProductMarkName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String productMarkName;
    @XmlElement(name = "ProductModelName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String productModelName;
    @XmlElement(name = "ProductId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String productId;
    @XmlElement(name = "ProductSortName", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String productSortName;
    @XmlElement(name = "StandardName", namespace = "urn:EEC:M:CA:SimpleDataObjects:v1.8.1")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String standardName;
    @XmlElement(name = "ProductInstanceId", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected List<String> productInstanceId;
    @XmlElement(name = "ManufactureDate", namespace = "urn:EEC:M:SimpleDataObjects:v0.4.14")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar manufactureDate;

    /**
     * Gets the value of the tradeMarkName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeMarkName() {
        return tradeMarkName;
    }

    /**
     * Sets the value of the tradeMarkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeMarkName(String value) {
        this.tradeMarkName = value;
    }

    /**
     * Наименование марки
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductMarkName() {
        return productMarkName;
    }

    /**
     * Sets the value of the productMarkName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductMarkName(String value) {
        this.productMarkName = value;
    }

    /**
     * Наименование модели продукта (товара)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductModelName() {
        return productModelName;
    }

    /**
     * Sets the value of the productModelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductModelName(String value) {
        this.productModelName = value;
    }

    /**
     * Уникальный идентификатор вида продукта (товара) или артикул товара
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductId(String value) {
        this.productId = value;
    }

    /**
     * Наименование сорта (группы сортов) продукта (товара)
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductSortName() {
        return productSortName;
    }

    /**
     * Sets the value of the productSortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductSortName(String value) {
        this.productSortName = value;
    }

    /**
     * наименование стандарта (международного, межгосударственного, государственного, отраслевого или организации) или технических условий на товар
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardName() {
        return standardName;
    }

    /**
     * Sets the value of the standardName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardName(String value) {
        this.standardName = value;
    }

    /**
     * Уникальный идентификатор (серийный номер, код) экземпляра продукта (товара) Gets the value of the productInstanceId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the productInstanceId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductInstanceId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProductInstanceId() {
        if (productInstanceId == null) {
            productInstanceId = new ArrayList<String>();
        }
        return this.productInstanceId;
    }

    /**
     * Дата производства (изготовления) товара
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getManufactureDate() {
        return manufactureDate;
    }

    /**
     * Sets the value of the manufactureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setManufactureDate(XMLGregorianCalendar value) {
        this.manufactureDate = value;
    }

}
