
package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ReadImageWebServiceSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ReadImageWebServiceSoap {


    /**
     * 
     * @param nstate
     * @param ndid
     * @param dtend
     * @param token
     * @param dtbegin
     * @return
     *     returns byte[]
     */
    @WebMethod(action = "http://tempuri.org/getReadImageListByNdidAndDateAndState")
    @WebResult(name = "getReadImageListByNdidAndDateAndStateResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "getReadImageListByNdidAndDateAndState", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetReadImageListByNdidAndDateAndState")
    @ResponseWrapper(localName = "getReadImageListByNdidAndDateAndStateResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetReadImageListByNdidAndDateAndStateResponse")
    public byte[] getReadImageListByNdidAndDateAndState(
        @WebParam(name = "ndid", targetNamespace = "http://tempuri.org/")
        int ndid,
        @WebParam(name = "token", targetNamespace = "http://tempuri.org/")
        String token,
        @WebParam(name = "dtbegin", targetNamespace = "http://tempuri.org/")
        XMLGregorianCalendar dtbegin,
        @WebParam(name = "dtend", targetNamespace = "http://tempuri.org/")
        XMLGregorianCalendar dtend,
        @WebParam(name = "nstate", targetNamespace = "http://tempuri.org/")
        int nstate);

    /**
     * 
     * @param ndid
     * @param token
     * @param nid
     * @return
     *     returns byte[]
     */
    @WebMethod(action = "http://tempuri.org/getReadImageByNid")
    @WebResult(name = "getReadImageByNidResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "getReadImageByNid", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetReadImageByNid")
    @ResponseWrapper(localName = "getReadImageByNidResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.GetReadImageByNidResponse")
    public byte[] getReadImageByNid(
        @WebParam(name = "ndid", targetNamespace = "http://tempuri.org/")
        int ndid,
        @WebParam(name = "token", targetNamespace = "http://tempuri.org/")
        String token,
        @WebParam(name = "nid", targetNamespace = "http://tempuri.org/")
        int nid);

    /**
     * 
     * @param ndid
     * @param sLimageQuality
     * @param token
     * @param sreport
     * @param nid
     * @param sRimageQuality
     * @return
     *     returns boolean
     */
    @WebMethod(action = "http://tempuri.org/saveReadImageReport")
    @WebResult(name = "saveReadImageReportResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "saveReadImageReport", targetNamespace = "http://tempuri.org/", className = "org.tempuri.SaveReadImageReport")
    @ResponseWrapper(localName = "saveReadImageReportResponse", targetNamespace = "http://tempuri.org/", className = "org.tempuri.SaveReadImageReportResponse")
    public boolean saveReadImageReport(
        @WebParam(name = "ndid", targetNamespace = "http://tempuri.org/")
        int ndid,
        @WebParam(name = "token", targetNamespace = "http://tempuri.org/")
        String token,
        @WebParam(name = "nid", targetNamespace = "http://tempuri.org/")
        int nid,
        @WebParam(name = "sreport", targetNamespace = "http://tempuri.org/")
        String sreport,
        @WebParam(name = "sRimageQuality", targetNamespace = "http://tempuri.org/")
        String sRimageQuality,
        @WebParam(name = "sLimageQuality", targetNamespace = "http://tempuri.org/")
        String sLimageQuality);

}
