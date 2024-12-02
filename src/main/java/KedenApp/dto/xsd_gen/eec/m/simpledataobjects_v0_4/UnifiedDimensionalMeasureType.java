
package KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4;

import java.math.BigDecimal;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.FractionNumber102MeasureType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.FractionNumber12MeasureType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.FractionNumber9MeasureType;
import KedenApp.dto.xsd_gen.eec.m.ca.simpledataobjects_v1_8.UnifiedFractionNumber246MeasureType;
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
 * Числовая величина, определенная в результате измерения физических параметров в каких-либо единицах измерения, с указанием классификатора единиц измерения
 * 
 * <p>Java class for UnifiedDimensionalMeasureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnifiedDimensionalMeasureType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;urn:EEC:M:BaseDataTypes:v0.4.14&gt;MeasureType"&gt;
 *       &lt;attribute name="measurementUnitCode" use="required" type="{urn:EEC:M:SimpleDataObjects:v0.4.14}MeasurementUnitCodeType" /&gt;
 *       &lt;attribute name="measurementUnitCodeListId" use="required" type="{urn:EEC:M:SimpleDataObjects:v0.4.14}ReferenceDataIdType" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnifiedDimensionalMeasureType", propOrder = {
    "value"
})
@XmlSeeAlso({
    UnifiedPhysicalMeasureType.class,
    UnifiedFractionNumber246MeasureType.class,
    FractionNumber102MeasureType.class,
    FractionNumber12MeasureType.class,
    FractionNumber9MeasureType.class
})
@Data
@Accessors(chain = true)
public class UnifiedDimensionalMeasureType {

    @XmlValue
    protected BigDecimal value;
    @XmlAttribute(name = "measurementUnitCode", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String measurementUnitCode;
    @XmlAttribute(name = "measurementUnitCodeListId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String measurementUnitCodeListId;
}
