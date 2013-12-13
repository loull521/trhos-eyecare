
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
 *         &lt;element name="getReadImageListByNdidAndDateAndStateResult" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
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
    "getReadImageListByNdidAndDateAndStateResult"
})
@XmlRootElement(name = "getReadImageListByNdidAndDateAndStateResponse")
public class GetReadImageListByNdidAndDateAndStateResponse {

    protected byte[] getReadImageListByNdidAndDateAndStateResult;

    /**
     * Gets the value of the getReadImageListByNdidAndDateAndStateResult property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetReadImageListByNdidAndDateAndStateResult() {
        return getReadImageListByNdidAndDateAndStateResult;
    }

    /**
     * Sets the value of the getReadImageListByNdidAndDateAndStateResult property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetReadImageListByNdidAndDateAndStateResult(byte[] value) {
        this.getReadImageListByNdidAndDateAndStateResult = value;
    }

}
