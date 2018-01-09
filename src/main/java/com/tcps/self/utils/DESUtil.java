package com.tcps.self.utils;

import java.io.IOException;  
import java.security.SecureRandom;  
import javax.crypto.Cipher;  
import javax.crypto.SecretKey;  
import javax.crypto.SecretKeyFactory;  
import javax.crypto.spec.DESKeySpec;  

import sun.misc.BASE64Decoder;  
import sun.misc.BASE64Encoder;  

/**
 * DES 加密解密算法工具类
 * @author qfGuo 2015-07-29
 */
public class DESUtil {  
	//密钥
    private byte[] desKey;  
  
    /**
     * 构造方法：指定密钥字符串
     * @param desKey
     */
    public DESUtil(String desKey) {  
        this.desKey = desKey.getBytes();  
    }  
  
    /**
     * DES 加密字节数组
     * @param plainText 要加密的字节数组
     * @return 加密后的字节数组
     * @throws Exception
     */
    public byte[] desEncrypt(byte[] plainText) throws Exception {  
        SecureRandom sr = new SecureRandom();  
        byte rawKeyData[] = desKey;  
        DESKeySpec dks = new DESKeySpec(rawKeyData);  
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");  
        SecretKey key = keyFactory.generateSecret(dks);  
        Cipher cipher = Cipher.getInstance("DES");  
        cipher.init(Cipher.ENCRYPT_MODE, key, sr);  
        byte data[] = plainText;  
        byte encryptedData[] = cipher.doFinal(data);  
        return encryptedData;  
    }  
  

    /**
     * DES 解密字节数组
     * @param plainText 要解密的字节数组
     * @return 解密后的字节数组
     * @throws Exception
     */
    public byte[] desDecrypt(byte[] encryptText) throws Exception {  
        SecureRandom sr = new SecureRandom();  
        byte rawKeyData[] = desKey;  
        DESKeySpec dks = new DESKeySpec(rawKeyData);  
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");  
        SecretKey key = keyFactory.generateSecret(dks);  
        Cipher cipher = Cipher.getInstance("DES");  
        cipher.init(Cipher.DECRYPT_MODE, key, sr);  
        byte encryptedData[] = encryptText;  
        byte decryptedData[] = cipher.doFinal(encryptedData);  
        return decryptedData;  
    }  
  
    /**
     * DES 加密字符串
     * @param plainText 要加密的字符串
     * @return 加密后的字符串
     * @throws Exception
     */
    public String encrypt(String input) throws Exception {  
        return base64Encode(desEncrypt(input.getBytes("utf-8")));  
    }  
  
    /**
     * DES 解密字符串
     * @param plainText 要解密的字符串
     * @return 解密后的字符串
     * @throws Exception
     */
    public String decrypt(String input) throws Exception {  
        byte[] result = base64Decode(input);  
        return new String(desDecrypt(result),"utf-8");  
    }  
    
    /**
     * Base64转码：字节数组转字符串
     * @param s 要转码的字节数组
     * @return 转码后的字符串
     */
    public static String base64Encode(byte[] s) {  
        if (s == null)  
            return null;  
        BASE64Encoder b = new BASE64Encoder();
        return b.encode(s);  
    }  
  
    /**
     * Base64转码：字符串转字节数组
     * @param s 要转码的字符串
     * @return 转码后的字节数组
     */
    public static byte[] base64Decode(String s) throws IOException {  
        if (s == null)  
            return null;  
        BASE64Decoder decoder = new BASE64Decoder();  
        byte[] b = decoder.decodeBuffer(s);  
        return b;  
    }  

} 