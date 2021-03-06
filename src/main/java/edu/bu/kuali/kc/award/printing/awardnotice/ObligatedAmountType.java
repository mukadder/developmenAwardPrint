//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.21 at 03:11:25 PM EST 
//


package edu.bu.kuali.kc.award.printing.awardnotice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ObligatedAmountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObligatedAmountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ObligationStartDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ObligatedEndDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="ObligatedDirectTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ObligatedIndirectTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ObligatedTotal" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObligatedAmountType", propOrder = {
    "obligationStartDate",
    "obligatedEndDate",
    "obligatedDirectTotal",
    "obligatedIndirectTotal",
    "obligatedTotal"
})
public class ObligatedAmountType {

    @XmlElement(name = "ObligationStartDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar obligationStartDate;
    @XmlElement(name = "ObligatedEndDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar obligatedEndDate;
    @XmlElement(name = "ObligatedDirectTotal")
    protected double obligatedDirectTotal;
    @XmlElement(name = "ObligatedIndirectTotal")
    protected double obligatedIndirectTotal;
    @XmlElement(name = "ObligatedTotal")
    protected double obligatedTotal;

    /**
     * Gets the value of the obligationStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getObligationStartDate() {
        return obligationStartDate;
    }

    /**
     * Sets the value of the obligationStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setObligationStartDate(XMLGregorianCalendar value) {
        this.obligationStartDate = value;
    }

    /**
     * Gets the value of the obligatedEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getObligatedEndDate() {
        return obligatedEndDate;
    }

    /**
     * Sets the value of the obligatedEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setObligatedEndDate(XMLGregorianCalendar value) {
        this.obligatedEndDate = value;
    }

    /**
     * Gets the value of the obligatedDirectTotal property.
     * 
     */
    public double getObligatedDirectTotal() {
        return obligatedDirectTotal;
    }

    /**
     * Sets the value of the obligatedDirectTotal property.
     * 
     */
    public void setObligatedDirectTotal(double value) {
        this.obligatedDirectTotal = value;
    }

    /**
     * Gets the value of the obligatedIndirectTotal property.
     * 
     */
    public double getObligatedIndirectTotal() {
        return obligatedIndirectTotal;
    }

    /**
     * Sets the value of the obligatedIndirectTotal property.
     * 
     */
    public void setObligatedIndirectTotal(double value) {
        this.obligatedIndirectTotal = value;
    }

    /**
     * Gets the value of the obligatedTotal property.
     * 
     */
    public double getObligatedTotal() {
        return obligatedTotal;
    }

    /**
     * Sets the value of the obligatedTotal property.
     * 
     */
    public void setObligatedTotal(double value) {
        this.obligatedTotal = value;
    }

}
