package cz.kolbsps;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MyHash {
    public byte[] vytvorHashMD5(byte[] vstup) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] vystup = md.digest(vstup);
        return vystup;
    }

    public byte[] vytvorHashSHA1(byte[] vstup) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA1");
        byte[] vystup = md.digest(vstup);
        return vystup;
    }

    public byte[] vytvorHashSHA2Salt(byte[] vstup, String salt) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA2-512");
        md.update(salt.getBytes());
        byte[] vystup = md.digest(vstup);
        return vystup;
    }
}
