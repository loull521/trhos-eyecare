package org.ccnt.msi.eyecare.wscall;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class LoginServiceTest extends TestCase {
	public LoginServiceTest(String testname) {
		super(testname);
	}
	
	public static Test suite()
    {
        return new TestSuite( LoginServiceTest.class );
    }
	
	public void testLoginService(){
		String sampleInput = "098f6bcd4621d373cade4e832627b4f6";
		String samplePass = "202cb962ac59075b964b07152d234b70";
		LoginService service = new LoginService();
		String rev = service.doctorLogin(sampleInput, samplePass);
		
		System.out.println(rev);
	}
}
