package org.ccnt.msi.eyecare.wscall;

import java.util.Date;

import javax.xml.datatype.XMLGregorianCalendar;

import org.ccnt.msi.eyecare.wscall.util.DateConverter;
import org.ccnt.msi.eyecare.wscall.util.GZipDecoder;
import org.tempuri.ReadImageWebService;

public class ReadImageService {
	public String getReadImageById(int nid,int ndid,String token) {
		ReadImageWebService serv = new ReadImageWebService();
		byte[] rev = serv.getReadImageWebServiceSoap().getReadImageByNid(ndid, token, nid);
		
		return GZipDecoder.decodeGZip(rev);
	}
	
	public String getReadImageListByNdidAndDateAndState(
			int ndid,
	        String token,
	        Date begin,
	        Date end,
	        int nstate) {
		ReadImageWebService serv = new ReadImageWebService();
		
		XMLGregorianCalendar dtbegin = DateConverter.convertToXMLGregorianCalendar(begin);
        XMLGregorianCalendar dtend = DateConverter.convertToXMLGregorianCalendar(end);
		
		byte[] rev = serv.getReadImageWebServiceSoap().getReadImageListByNdidAndDateAndState(ndid, token, dtbegin, dtend, nstate);
		
		return GZipDecoder.decodeGZip(rev);
	}
	
	public boolean saveReadImageReport(
    int ndid,
    String token,
    int nid,
    String sreport,
    String sRimageQuality,
    String sLimageQuality) {
		ReadImageWebService serv = new ReadImageWebService();
		return  serv.getReadImageWebServiceSoap().saveReadImageReport(ndid, token, nid, sreport, sRimageQuality, sLimageQuality);
		
	}
}
