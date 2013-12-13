
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="ndid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dtbegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="dtend" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="nstate" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "ndid",
    "token",
    "dtbegin",
    "dtend",
    "nstate"
})
@XmlRootElement(name = "getReadImageListByNdidAndDateAndState")
public class GetReadImageListByNdidAndDateAndState {

    protected int ndid;
    protected String token;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtbegin;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dtend;
    protected int nstate;

    /**
     * Gets the value of the ndid property.
     * 
     */
    public int getNdid() {
        return ndid;
    }

    /**
     * Sets the value of the ndid property.
     * 
     */
    public void setNdid(int value) {
        this.ndid = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the dtbegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtbegin() {
        return dtbegin;
    }

    /**
     * Sets the value of the dtbegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtbegin(XMLGregorianCalendar value) {
        this.dtbegin = value;
    }

    /**
     * Gets the value of the dtend property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtend() {
        return dtend;
    }

    /**
     * Sets the value of the dtend property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtend(XMLGregorianCalendar value) {
        this.dtend = value;
    }

    /**
     * Gets the value of the nstate property.
     * 
     */
    public int getNstate() {
        return nstate;
    }

    /**
     * Sets the value of the nstate property.
     * 
     */
    public void setNstate(int value) {
        this.nstate = value;
    }

}
