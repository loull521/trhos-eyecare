package org.ccnt.msi.eyecare.wscall;

import javax.jws.WebParam;

import org.ccnt.msi.eyecare.wscall.util.GZipDecoder;
import org.tempuri.WordWebService;

public class WordService {
	public String getWordByFatherId(
			int ndid,
	        String stoken,
	        int nid) {
		
		WordWebService serv = new WordWebService();
		byte[] rev = serv.getWordWebServiceSoap().getWordByFatherId(ndid, stoken, nid);
		
		return GZipDecoder.decodeGZip(rev);
	}
	
	public String getWordByNtypeAndOfficeUniDoctor(
			int ndid,
	        String stoken,
	        int ntype,
	        int nhid,
	        int noffice) {
		WordWebService serv = new WordWebService();
		byte[] rev = serv.getWordWebServiceSoap().getWordByNtypeAndOfficeUniDoctor(ndid, stoken, ntype, nhid, noffice);
		
		return GZipDecoder.decodeGZip(rev);
	}
}
