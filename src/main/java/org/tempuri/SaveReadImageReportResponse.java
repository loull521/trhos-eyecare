
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
 *         &lt;element name="saveReadImageReportResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "saveReadImageReportResult"
})
@XmlRootElement(name = "saveReadImageReportResponse")
public class SaveReadImageReportResponse {

    protected boolean saveReadImageReportResult;

    /**
     * Gets the value of the saveReadImageReportResult property.
     * 
     */
    public boolean isSaveReadImageReportResult() {
        return saveReadImageReportResult;
    }

    /**
     * Sets the value of the saveReadImageReportResult property.
     * 
     */
    public void setSaveReadImageReportResult(boolean value) {
        this.saveReadImageReportResult = value;
    }

}
