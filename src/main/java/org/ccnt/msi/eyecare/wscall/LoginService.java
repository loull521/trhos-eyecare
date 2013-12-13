package org.ccnt.msi.eyecare.wscall;

import org.ccnt.msi.eyecare.wscall.util.GZipDecoder;
import org.tempuri.LoginWebService;

public class LoginService {
	public String doctorLogin(String suser, String spass){
		LoginWebService loginws = new LoginWebService();
		byte[] rev = loginws.getLoginWebServiceSoap().doctorLogin(suser, spass);
        return GZipDecoder.decodeGZip(rev);
	}
}
