package com.quantiguous.iib.ed;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;

public class SecurityCodeEncode {
	public static String encryption(String input, String key){
		byte[] crypted = null; try{
			SecretKeySpec skey = new SecretKeySpec(key.getBytes(), "AES"); 
			Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding"); 
			cipher.init(Cipher.ENCRYPT_MODE, skey);
			crypted = cipher.doFinal(input.getBytes());
		}
		catch(Exception e){ 
			System.out.println(e.toString());
		}
		//return urlEncode(new String(Base64.encodeBase64(crypted))); 
		return urlEncode(DatatypeConverter.printBase64Binary(crypted));
		}
	public static String decryption(String input, String key)
	  {
		  try {
		    byte[] crypted = null;
		    SecretKeySpec skey = new SecretKeySpec(key.getBytes(), "AES");
		    Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
		    cipher.init(Cipher.DECRYPT_MODE, skey);
		    crypted = cipher.doFinal(DatatypeConverter.parseBase64Binary(urlDecode(input.trim())));
		    return new String(crypted);
		  } catch (Exception e) {
			  return null;
		  }
	  }
	
	public static String urlEncode(String data) {
		return data.replaceAll("/+","-").replaceAll("/","_").replaceAll("=",","); }
	public static String urlDecode(String data) {
		return data.replaceAll("-","+").replaceAll("_","/").replaceAll(",","="); }
	public static void main(String[] args) {
		String key = "ytxQz6HJQgHv7Eei";
		String data = "{\"transactionid\":\"96632096\",\"frcode\":\"IMCLSUBFR4627\",\"amount\":\"2\",\"paymentmode\":\"DMT\",\"paymentdate\":\"22/09/2017\"}"; 
		//System.out.println(Security.decryption(Security.decryption(data, key), key)); 
		String a = SecurityCodeEncode.encryption(data, key);
		String b = "Rfy9GzLk1Kf7WXb8k7FYjigtfNvUy8dEYPmPenyjltGH- dEJ68PMoCQfXjBjiQyWpsqQITyqJpFJoD4SeLZ7P51kzy5Gkwa8wLA_3BsSIg- vD4iABnqwwfLSwQGUgs-NDR4ppbWa42Gk2AgZ5YjhMTftlBjA7I1ZynTVR22- x5vdS8CUXE0jNG-kgc3UJZJcO31GNjORMHLVhNW1f_ItXA,,";
		System.out.println("encrypted : " + a);
		System.out.println(SecurityCodeEncode.decryption(a, key));
		System.out.println("doc" + SecurityCodeEncode.decryption(b, key));
		
	}
}
