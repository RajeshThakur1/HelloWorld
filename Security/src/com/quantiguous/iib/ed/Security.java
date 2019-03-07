package com.quantiguous.iib.ed;

import javax.crypto.Cipher;    																																																																																																
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.codec.binary.Base64;
public class Security {
public static String encrypt(String input, String key){
byte[] crypted = null;
try{
SecretKeySpec skey = new SecretKeySpec(key.getBytes(), "AES");
Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
cipher.init(Cipher.ENCRYPT_MODE, skey);
crypted = cipher.doFinal(input.getBytes());
}catch(Exception e){
System.out.println(e.toString());
}
return urlEncode(new String(Base64.encodeBase64(crypted)));
}
public static String decrypt(String input, String key){
input = urlDecode(input);
byte[] output = null;
try{
SecretKeySpec skey = new SecretKeySpec(key.getBytes(), "AES");
Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
cipher.init(Cipher.DECRYPT_MODE, skey);
output = cipher.doFinal(Base64.decodeBase64(input));
}catch(Exception e){
System.out.println(e.toString());
}
return new String(output);
}
public static String urlEncode(String data)
{
return data.replaceAll("\\+","-").replaceAll("/","_").replaceAll("=",",");
}
public static String urlDecode(String data)
{
return data.replaceAll("-","+").replaceAll("_","/").replaceAll(",","=");
}
public static void main(String[] args) {
String key = "ytxQz6HJQgHv7Eei";
String data="Ta0LijoMeOSOPko4ulETSNig1ndNDyV4FIDa9Zdb-NJDpCoLiXzIhBiQPm3kf3FJ578928SOJZXMMhpy7LolKdzMm1gn9nY3pp6C-pyH5rwnVs9zbFJDKecjwbyMfXQmI8rcZt08r3j4V4RY1WTeQv8LqOqTl9wTVLIQI-FmUmA,";
//String data="{'transactionid':'966320997','frcode':'IMCSUBFR4627','amount':'2','paymentmode':'DMT','paymentdate':'03/11/2017'}";
//String data = "{\"transactionid\":\"96632096\",\"frcode\":\"IMCLSUBFR4627\",\"amount\":\"2\",\"paymentmode\":\"DMT\",\"paymentdate\":\"22/09/2017\"}";
//String data = "Rfy9GzLk1Kf7WXb8k7FYjigtfNvUy8dEYPmPenyjltGH-dEJ68PMoCQfXjBjiQyWOvWyGDQOLrUSUrTNPAzhvZAyfHjwVHh4QtydBFDn_St5zupuh0w37MnuPRMnEGcbUWptavOlNzfpgkl-q9o3HhCS2GYnIhqNYcRUTn1vUvw,";
//System.out.println(Security.decrypt(Security.encrypt(data, key), key));
//System.out.println(Security.encrypt(data, key));
System.out.println(Security.decrypt(data, key));
	
//System.out.println(Security.decrypt("Eg2FzTvvOweD-vccWDktOsnbEp8eS5dFUSGIZlGPi-X36Naj6mjrQ9nYtTLG8NMIIXjNOOFu3EGzxF0xqazK0p5DHluYP1kDjYa7aXa7FjZWd8nd--ckdsHo-12ClZr0", "GBQQQbLZASZjgxg4"));	
	
	
	
	
}
}