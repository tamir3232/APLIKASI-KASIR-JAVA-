package com.mycompany.peojekuas;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
 
/**
 *
 * @author Herdi Naufal
 */
public class login {
    public static String md5Java(String message)
    {
        String digest = null;
        try {
                MessageDigest md = MessageDigest.getInstance("MD5");
                byte[] hash = md.digest(message.getBytes("UTF-8"));
                //merubah byte array ke dalam String Hexadecimal
                StringBuilder sb = new StringBuilder(2*hash.length);
                for(byte b : hash)
                {
                        sb.append(String.format("%02x", b&0xff));
                }
                digest = sb.toString();
            } catch (UnsupportedEncodingException ex)
                {
                        Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                } catch (NoSuchAlgorithmException ex)
                        {
                                Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        return digest;
    }
 
}

