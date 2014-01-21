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
 * <p>Java class for AwardHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AwardHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AwardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TransactionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TransactionType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SAPGrantNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FundsCenterInfo" type="{http://printing.award.kc.kuali.bu.edu/awardnotice}FundsCenterInfoType" minOccurs="0"/>
 *         &lt;element name="Investigators" type="{http://printing.award.kc.kuali.bu.edu/awardnotice}AwardInvestigatorsType" minOccurs="0"/>
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SponsorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SponsorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimeSponsorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimeSponsorDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SponsorAwardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartmentAdminList" type="{http://printing.award.kc.kuali.bu.edu/awardnotice}AdminsType" minOccurs="0"/>
 *         &lt;element name="OSPAdminList" type="{http://printing.award.kc.kuali.bu.edu/awardnotice}AdminsType" minOccurs="0"/>
 *         &lt;element name="PAFOAdminList" type="{http://printing.award.kc.kuali.bu.edu/awardnotice}AdminsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AwardHeaderType", propOrder = {
    "awardNumber",
    "sequenceNumber",
    "accountNumber",
    "statusDescription",
    "transactionDate",
    "transactionType",
    "sapGrantNumber",
    "fundsCenterInfo",
    "investigators",
    "title",
    "sponsorCode",
    "sponsorDescription",
    "primeSponsorCode",
    "primeSponsorDescription",
    "sponsorAwardNumber",
    "departmentAdminList",
    "ospAdminList",
    "pafoAdminList"
})
public class AwardHeaderType {

    @XmlElement(name = "AwardNumber")
    protected String awardNumber;
    @XmlElement(name = "SequenceNumber")
    protected Integer sequenceNumber;
    @XmlElement(name = "AccountNumber")
    protected String accountNumber;
    @XmlElement(name = "StatusDescription")
    protected String statusDescription;
    @XmlElement(name = "TransactionDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar transactionDate;
    @XmlElement(name = "TransactionType")
    protected String transactionType;
    @XmlElement(name = "SAPGrantNumber")
    protected String sapGrantNumber;
    @XmlElement(name = "FundsCenterInfo")
    protected FundsCenterInfoType fundsCenterInfo;
    @XmlElement(name = "Investigators")
    protected AwardInvestigatorsType investigators;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "SponsorCode")
    protected String sponsorCode;
    @XmlElement(name = "SponsorDescription")
    protected String sponsorDescription;
    @XmlElement(name = "PrimeSponsorCode")
    protected String primeSponsorCode;
    @XmlElement(name = "PrimeSponsorDescription")
    protected String primeSponsorDescription;
    @XmlElement(name = "SponsorAwardNumber")
    protected String sponsorAwardNumber;
    @XmlElement(name = "DepartmentAdminList")
    protected AdminsType departmentAdminList;
    @XmlElement(name = "OSPAdminList")
    protected AdminsType ospAdminList;
    @XmlElement(name = "PAFOAdminList")
    protected AdminsType pafoAdminList;

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
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the statusDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusDescription() {
        return statusDescription;
    }

    /**
     * Sets the value of the statusDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusDescription(String value) {
        this.statusDescription = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDate(XMLGregorianCalendar value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionType(String value) {
        this.transactionType = value;
    }

    /**
     * Gets the value of the sapGrantNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPGrantNumber() {
        return sapGrantNumber;
    }

    /**
     * Sets the value of the sapGrantNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPGrantNumber(String value) {
        this.sapGrantNumber = value;
    }

    /**
     * Gets the value of the fundsCenterInfo property.
     * 
     * @return
     *     possible object is
     *     {@link FundsCenterInfoType }
     *     
     */
    public FundsCenterInfoType getFundsCenterInfo() {
        return fundsCenterInfo;
    }

    /**
     * Sets the value of the fundsCenterInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundsCenterInfoType }
     *     
     */
    public void setFundsCenterInfo(FundsCenterInfoType value) {
        this.fundsCenterInfo = value;
    }

    /**
     * Gets the value of the investigators property.
     * 
     * @return
     *     possible object is
     *     {@link AwardInvestigatorsType }
     *     
     */
    public AwardInvestigatorsType getInvestigators() {
        return investigators;
    }

    /**
     * Sets the value of the investigators property.
     * 
     * @param value
     *     allowed object is
     *     {@link AwardInvestigatorsType }
     *     
     */
    public void setInvestigators(AwardInvestigatorsType value) {
        this.investigators = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the sponsorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSponsorCode() {
        return sponsorCode;
    }

    /**
     * Sets the value of the sponsorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSponsorCode(String value) {
        this.sponsorCode = value;
    }

    /**
     * Gets the value of the sponsorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSponsorDescription() {
        return sponsorDescription;
    }

    /**
     * Sets the value of the sponsorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSponsorDescription(String value) {
        this.sponsorDescription = value;
    }

    /**
     * Gets the value of the primeSponsorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimeSponsorCode() {
        return primeSponsorCode;
    }

    /**
     * Sets the value of the primeSponsorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimeSponsorCode(String value) {
        this.primeSponsorCode = value;
    }

    /**
     * Gets the value of the primeSponsorDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimeSponsorDescription() {
        return primeSponsorDescription;
    }

    /**
     * Sets the value of the primeSponsorDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimeSponsorDescription(String value) {
        this.primeSponsorDescription = value;
    }

    /**
     * Gets the value of the sponsorAwardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSponsorAwardNumber() {
        return sponsorAwardNumber;
    }

    /**
     * Sets the value of the sponsorAwardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSponsorAwardNumber(String value) {
        this.sponsorAwardNumber = value;
    }

    /**
     * Gets the value of the departmentAdminList property.
     * 
     * @return
     *     possible object is
     *     {@link AdminsType }
     *     
     */
    public AdminsType getDepartmentAdminList() {
        return departmentAdminList;
    }

    /**
     * Sets the value of the departmentAdminList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdminsType }
     *     
     */
    public void setDepartmentAdminList(AdminsType value) {
        this.departmentAdminList = value;
    }

    /**
     * Gets the value of the ospAdminList property.
     * 
     * @return
     *     possible object is
     *     {@link AdminsType }
     *     
     */
    public AdminsType getOSPAdminList() {
        return ospAdminList;
    }

    /**
     * Sets the value of the ospAdminList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdminsType }
     *     
     */
    public void setOSPAdminList(AdminsType value) {
        this.ospAdminList = value;
    }

    /**
     * Gets the value of the pafoAdminList property.
     * 
     * @return
     *     possible object is
     *     {@link AdminsType }
     *     
     */
    public AdminsType getPAFOAdminList() {
        return pafoAdminList;
    }

    /**
     * Sets the value of the pafoAdminList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdminsType }
     *     
     */
    public void setPAFOAdminList(AdminsType value) {
        this.pafoAdminList = value;
    }

}
