
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
 *         &lt;element name="ndid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sreport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sRimageQuality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sLimageQuality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "nid",
    "sreport",
    "sRimageQuality",
    "sLimageQuality"
})
@XmlRootElement(name = "saveReadImageReport")
public class SaveReadImageReport {

    protected int ndid;
    protected String token;
    protected int nid;
    protected String sreport;
    protected String sRimageQuality;
    protected String sLimageQuality;

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
     * Gets the value of the nid property.
     * 
     */
    public int getNid() {
        return nid;
    }

    /**
     * Sets the value of the nid property.
     * 
     */
    public void setNid(int value) {
        this.nid = value;
    }

    /**
     * Gets the value of the sreport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSreport() {
        return sreport;
    }

    /**
     * Sets the value of the sreport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSreport(String value) {
        this.sreport = value;
    }

    /**
     * Gets the value of the sRimageQuality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSRimageQuality() {
        return sRimageQuality;
    }

    /**
     * Sets the value of the sRimageQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSRimageQuality(String value) {
        this.sRimageQuality = value;
    }

    /**
     * Gets the value of the sLimageQuality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSLimageQuality() {
        return sLimageQuality;
    }

    /**
     * Sets the value of the sLimageQuality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSLimageQuality(String value) {
        this.sLimageQuality = value;
    }

}
