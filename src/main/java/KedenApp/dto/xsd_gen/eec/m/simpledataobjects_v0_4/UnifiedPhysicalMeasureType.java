
package KedenApp.dto.xsd_gen.eec.m.simpledataobjects_v0_4;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * Числовая величина с заданной точностью, определенная в результате измерения физических параметров в каких-либо единицах измерения, с указанием классификатора единиц измерения
 * 
 * <p>Java class for UnifiedPhysicalMeasureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnifiedPhysicalMeasureType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;restriction base="&lt;urn:EEC:M:SimpleDataObjects:v0.4.14&gt;UnifiedDimensionalMeasureType"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnifiedPhysicalMeasureType")
public class UnifiedPhysicalMeasureType
    extends UnifiedDimensionalMeasureType
{


}
