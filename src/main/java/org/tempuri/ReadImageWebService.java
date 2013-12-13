
package org.tempuri;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ReadImageWebService", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://103.244.232.251:8080/ImageCloudServicePlatformService/webService/clinic/ReadImageWebService.asmx?wsdl")
public class ReadImageWebService
    extends Service
{

    private final static URL READIMAGEWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException READIMAGEWEBSERVICE_EXCEPTION;
    private final static QName READIMAGEWEBSERVICE_QNAME = new QName("http://tempuri.org/", "ReadImageWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://103.244.232.251:8080/ImageCloudServicePlatformService/webService/clinic/ReadImageWebService.asmx?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        READIMAGEWEBSERVICE_WSDL_LOCATION = url;
        READIMAGEWEBSERVICE_EXCEPTION = e;
    }

    public ReadImageWebService() {
        super(__getWsdlLocation(), READIMAGEWEBSERVICE_QNAME);
    }

    public ReadImageWebService(WebServiceFeature... features) {
        super(__getWsdlLocation(), READIMAGEWEBSERVICE_QNAME, features);
    }

    public ReadImageWebService(URL wsdlLocation) {
        super(wsdlLocation, READIMAGEWEBSERVICE_QNAME);
    }

    public ReadImageWebService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, READIMAGEWEBSERVICE_QNAME, features);
    }

    public ReadImageWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ReadImageWebService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ReadImageWebServiceSoap
     */
    @WebEndpoint(name = "ReadImageWebServiceSoap")
    public ReadImageWebServiceSoap getReadImageWebServiceSoap() {
        return super.getPort(new QName("http://tempuri.org/", "ReadImageWebServiceSoap"), ReadImageWebServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReadImageWebServiceSoap
     */
    @WebEndpoint(name = "ReadImageWebServiceSoap")
    public ReadImageWebServiceSoap getReadImageWebServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "ReadImageWebServiceSoap"), ReadImageWebServiceSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (READIMAGEWEBSERVICE_EXCEPTION!= null) {
            throw READIMAGEWEBSERVICE_EXCEPTION;
        }
        return READIMAGEWEBSERVICE_WSDL_LOCATION;
    }

}
