//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.21 at 03:11:25 PM EST 
//


package edu.bu.kuali.kc.award.printing.awardnotice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvestigatorUnitsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvestigatorUnitsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AwardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PersonId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LeadUnit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OSPAdminName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdministrativeOfficer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdministrativeOfficerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitHead" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitHeadName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeanVp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeanVpName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherIndividualToNotify" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherIndividualToNotifyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UnitAdministrator" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UnitAdministratorTypeCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *                   &lt;element name="Administrator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="AdministratorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestigatorUnitsType", propOrder = {
    "awardNumber",
    "sequenceNumber",
    "personId",
    "unitNumber",
    "unitName",
    "leadUnit",
    "ospAdminName",
    "administrativeOfficer",
    "administrativeOfficerName",
    "unitHead",
    "unitHeadName",
    "deanVp",
    "deanVpName",
    "otherIndividualToNotify",
    "otherIndividualToNotifyName",
    "unitAdministrator"
})
public class InvestigatorUnitsType {

    @XmlElement(name = "AwardNumber")
    protected String awardNumber;
    @XmlElement(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlElement(name = "PersonId")
    protected String personId;
    @XmlElement(name = "UnitNumber")
    protected String unitNumber;
    @XmlElement(name = "UnitName")
    protected String unitName;
    @XmlElement(name = "LeadUnit")
    protected Boolean leadUnit;
    @XmlElement(name = "OSPAdminName")
    protected String ospAdminName;
    @XmlElementRef(name = "AdministrativeOfficer", namespace = "http://printing.award.kc.kuali.bu.edu/awardnotice", type = JAXBElement.class)
    protected JAXBElement<String> administrativeOfficer;
    @XmlElementRef(name = "AdministrativeOfficerName", namespace = "http://printing.award.kc.kuali.bu.edu/awardnotice", type = JAXBElement.class)
    protected JAXBElement<String> administrativeOfficerName;
    @XmlElementRef(name = "UnitHead", namespace = "http://printing.award.kc.kuali.bu.edu/awardnotice", type = JAXBElement.class)
    protected JAXBElement<String> unitHead;
    @XmlElementRef(name = "UnitHeadName", namespace = "http://printing.award.kc.kuali.bu.edu/awardnotice", type = JAXBElement.class)
    protected JAXBElement<String> unitHeadName;
    @XmlElementRef(name = "DeanVp", namespace = "http://printing.award.kc.kuali.bu.edu/awardnotice", type = JAXBElement.class)
    protected JAXBElement<String> deanVp;
    @XmlElementRef(name = "DeanVpName", namespace = "http://printing.award.kc.kuali.bu.edu/awardnotice", type = JAXBElement.class)
    protected JAXBElement<String> deanVpName;
    @XmlElementRef(name = "OtherIndividualToNotify", namespace = "http://printing.award.kc.kuali.bu.edu/awardnotice", type = JAXBElement.class)
    protected JAXBElement<String> otherIndividualToNotify;
    @XmlElementRef(name = "OtherIndividualToNotifyName", namespace = "http://printing.award.kc.kuali.bu.edu/awardnotice", type = JAXBElement.class)
    protected JAXBElement<String> otherIndividualToNotifyName;
    @XmlElement(name = "UnitAdministrator")
    protected List<InvestigatorUnitsType.UnitAdministrator> unitAdministrator;

    /**
     * Gets the value of the awardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwardNumber() {
        return awardNumber;
    }

    /**
     * Sets the value of the awardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwardNumber(String value) {
        this.awardNumber = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequenceNumber(Integer value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonId(String value) {
        this.personId = value;
    }

    /**
     * Gets the value of the unitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitNumber() {
        return unitNumber;
    }

    /**
     * Sets the value of the unitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitNumber(String value) {
        this.unitNumber = value;
    }

    /**
     * Gets the value of the unitName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * Sets the value of the unitName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitName(String value) {
        this.unitName = value;
    }

    /**
     * Gets the value of the leadUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLeadUnit() {
        return leadUnit;
    }

    /**
     * Sets the value of the leadUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeadUnit(Boolean value) {
        this.leadUnit = value;
    }

    /**
     * Gets the value of the ospAdminName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOSPAdminName() {
        return ospAdminName;
    }

    /**
     * Sets the value of the ospAdminName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOSPAdminName(String value) {
        this.ospAdminName = value;
    }

    /**
     * Gets the value of the administrativeOfficer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdministrativeOfficer() {
        return administrativeOfficer;
    }

    /**
     * Sets the value of the administrativeOfficer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdministrativeOfficer(JAXBElement<String> value) {
        this.administrativeOfficer = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the administrativeOfficerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdministrativeOfficerName() {
        return administrativeOfficerName;
    }

    /**
     * Sets the value of the administrativeOfficerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdministrativeOfficerName(JAXBElement<String> value) {
        this.administrativeOfficerName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the unitHead property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnitHead() {
        return unitHead;
    }

    /**
     * Sets the value of the unitHead property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnitHead(JAXBElement<String> value) {
        this.unitHead = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the unitHeadName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUnitHeadName() {
        return unitHeadName;
    }

    /**
     * Sets the value of the unitHeadName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUnitHeadName(JAXBElement<String> value) {
        this.unitHeadName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the deanVp property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeanVp() {
        return deanVp;
    }

    /**
     * Sets the value of the deanVp property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeanVp(JAXBElement<String> value) {
        this.deanVp = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the deanVpName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeanVpName() {
        return deanVpName;
    }

    /**
     * Sets the value of the deanVpName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeanVpName(JAXBElement<String> value) {
        this.deanVpName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the otherIndividualToNotify property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOtherIndividualToNotify() {
        return otherIndividualToNotify;
    }

    /**
     * Sets the value of the otherIndividualToNotify property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOtherIndividualToNotify(JAXBElement<String> value) {
        this.otherIndividualToNotify = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the otherIndividualToNotifyName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOtherIndividualToNotifyName() {
        return otherIndividualToNotifyName;
    }

    /**
     * Sets the value of the otherIndividualToNotifyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOtherIndividualToNotifyName(JAXBElement<String> value) {
        this.otherIndividualToNotifyName = ((JAXBElement<String> ) value);
    }

    /**
     * Gets the value of the unitAdministrator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitAdministrator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitAdministrator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestigatorUnitsType.UnitAdministrator }
     * 
     * 
     */
    public List<InvestigatorUnitsType.UnitAdministrator> getUnitAdministrator() {
        if (unitAdministrator == null) {
            unitAdministrator = new ArrayList<InvestigatorUnitsType.UnitAdministrator>();
        }
        return this.unitAdministrator;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="UnitAdministratorTypeCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
     *         &lt;element name="Administrator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="AdministratorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "unitAdministratorTypeCode",
        "administrator",
        "administratorName"
    })
    public static class UnitAdministrator {

        @XmlElementRef(name = "UnitAdministratorTypeCode", namespace = "http://printing.award.kc.kuali.bu.edu/awardnotice", type = JAXBElement.class)
        protected JAXBElement<Integer> unitAdministratorTypeCode;
        @XmlElementRef(name = "Administrator", namespace = "http://printing.award.kc.kuali.bu.edu/awardnotice", type = JAXBElement.class)
        protected JAXBElement<String> administrator;
        @XmlElementRef(name = "AdministratorName", namespace = "http://printing.award.kc.kuali.bu.edu/awardnotice", type = JAXBElement.class)
        protected JAXBElement<String> administratorName;

        /**
         * Gets the value of the unitAdministratorTypeCode property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public JAXBElement<Integer> getUnitAdministratorTypeCode() {
            return unitAdministratorTypeCode;
        }

        /**
         * Sets the value of the unitAdministratorTypeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
         *     
         */
        public void setUnitAdministratorTypeCode(JAXBElement<Integer> value) {
            this.unitAdministratorTypeCode = ((JAXBElement<Integer> ) value);
        }

        /**
         * Gets the value of the administrator property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAdministrator() {
            return administrator;
        }

        /**
         * Sets the value of the administrator property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAdministrator(JAXBElement<String> value) {
            this.administrator = ((JAXBElement<String> ) value);
        }

        /**
         * Gets the value of the administratorName property.
         * 
         * @return
         *     possible object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public JAXBElement<String> getAdministratorName() {
            return administratorName;
        }

        /**
         * Sets the value of the administratorName property.
         * 
         * @param value
         *     allowed object is
         *     {@link JAXBElement }{@code <}{@link String }{@code >}
         *     
         */
        public void setAdministratorName(JAXBElement<String> value) {
            this.administratorName = ((JAXBElement<String> ) value);
        }

    }

}