package org.ccnt.msi.eyecare;

import java.io.ByteArrayInputStream;
import java.util.GregorianCalendar;
import java.util.Iterator;

import org.ccnt.msi.eyecare.wscall.LoginService;
import org.ccnt.msi.eyecare.wscall.ReadImageService;
import org.ccnt.msi.eyecare.wscall.WordService;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main( String[] args )
    {
        LoginService loginServ = new LoginService();
        ReadImageService readImageServ = new ReadImageService();
        WordService wordServ = new WordService();
        
        
        //Test login
        
        String loginMsg = loginServ.doctorLogin("098f6bcd4621d373cade4e832627b4f6", "202cb962ac59075b964b07152d234b70");
        
        //Parse XML
		try {
			SAXReader reader = new SAXReader();
			Document doc = reader.read(new ByteArrayInputStream(loginMsg.getBytes("UTF-8")));
			Element root = doc.getRootElement(); 
			
			int ndid = Integer.valueOf(root.element("ndid").getText());
			String token = root.element("token").getTextTrim();
			
			System.out.println("Test login");
			System.out.println(loginMsg);
			
			
			//Test ReadImage
			
			GregorianCalendar begin = new GregorianCalendar(2013, 0, 1);
	        GregorianCalendar end = new GregorianCalendar(2013, 11, 31);
	        //nstate : 20 送阅  21 阅毕
	        String imageListMsg = readImageServ.getReadImageListByNdidAndDateAndState(ndid, token, begin.getTime() , end.getTime(), 20);
	        
	        System.out.println("Image List");
	        System.out.println(imageListMsg);
	        
	        doc = reader.read(new ByteArrayInputStream(imageListMsg.getBytes("UTF-8")));
	        int nid = Integer.valueOf(doc.getRootElement().element("ReadImage").element("nid").getText());
	        
	        
	        //Test ImageDetail
	        
	        String imageMsg = readImageServ.getReadImageById(nid, ndid, token);
	        System.out.println("Test ImageDetail");
	        System.out.println(imageMsg);
	        
	        
			
		} catch (Exception e) {
			e.printStackTrace();
		}
        
        
        
        
        
        
        
    }
}
