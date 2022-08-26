package authenticationPack;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Authentication {
	public static String adminPassword = "306114315168072895567266766673586969056";
	public static String Hashing(String password) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte [] messageDigest = md.digest(password.getBytes());
			BigInteger num = new BigInteger(1, messageDigest);
			
			String hashTxt =  num.toString();
			while(hashTxt.length() < 32) {
				hashTxt = "0" + hashTxt	;
			}
			return hashTxt;
		}
		catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
	}
	
//	public 

//	public static void main(String[] args) {
//		
//		
//		// TODO Auto-generated method stub
//		String s = "Admin123";
//		System.out.println(Hashing(s));
//
//	}

}
