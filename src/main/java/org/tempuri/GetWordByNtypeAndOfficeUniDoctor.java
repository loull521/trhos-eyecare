
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
 *         &lt;element name="stoken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ntype" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nhid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="noffice" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "stoken",
    "ntype",
    "nhid",
    "noffice"
})
@XmlRootElement(name = "getWordByNtypeAndOfficeUniDoctor")
public class GetWordByNtypeAndOfficeUniDoctor {

    protected int ndid;
    protected String stoken;
    protected int ntype;
    protected int nhid;
    protected int noffice;

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
     * Gets the value of the stoken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStoken() {
        return stoken;
    }

    /**
     * Sets the value of the stoken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStoken(String value) {
        this.stoken = value;
    }

    /**
     * Gets the value of the ntype property.
     * 
     */
    public int getNtype() {
        return ntype;
    }

    /**
     * Sets the value of the ntype property.
     * 
     */
    public void setNtype(int value) {
        this.ntype = value;
    }

    /**
     * Gets the value of the nhid property.
     * 
     */
    public int getNhid() {
        return nhid;
    }

    /**
     * Sets the value of the nhid property.
     * 
     */
    public void setNhid(int value) {
        this.nhid = value;
    }

    /**
     * Gets the value of the noffice property.
     * 
     */
    public int getNoffice() {
        return noffice;
    }

    /**
     * Sets the value of the noffice property.
     * 
     */
    public void setNoffice(int value) {
        this.noffice = value;
    }

}
