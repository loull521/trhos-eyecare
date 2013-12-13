
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="suser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "suser",
    "spass"
})
@XmlRootElement(name = "doctorLogin")
public class DoctorLogin {

    protected String suser;
    protected String spass;

    /**
     * Gets the value of the suser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuser() {
        return suser;
    }

    /**
     * Sets the value of the suser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuser(String value) {
        this.suser = value;
    }

    /**
     * Gets the value of the spass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpass() {
        return spass;
    }

    /**
     * Sets the value of the spass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpass(String value) {
        this.spass = value;
    }

}
