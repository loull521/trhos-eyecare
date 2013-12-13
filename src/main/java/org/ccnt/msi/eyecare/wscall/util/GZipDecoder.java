package org.ccnt.msi.eyecare.wscall.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

public class GZipDecoder {
	public static String decodeGZip(byte[] input){
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try {
			GZIPInputStream ungzip = new GZIPInputStream(new ByteArrayInputStream(input));
			byte[] buf = new byte[256];
			int n;
			
			while((n = ungzip.read(buf)) > 0){
				out.write(buf,0,n);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		return out.toString();
	}
}
