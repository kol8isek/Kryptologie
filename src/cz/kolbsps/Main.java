package cz.kolbsps;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        System.out.println("Kryptologie");
        System.out.println("Význam operace XOR");

        byte[] vstup = Files.readAllBytes(Paths.get("pokus2.txt"));
        byte[] vystup = XOR.zasifrujPomociXor(vstup, 101);
        Files.write( Paths.get("pokus.txt"),vystup);


        MyHash mh = new MyHash();
         vstup = Files.readAllBytes(Paths.get("vstupProHash.txt"));
         vystup = mh.vytvorHashMD5(vstup);
        Files.write( Paths.get("vystupHashMD5.txt"),vystup);

        vstup = Files.readAllBytes(Paths.get("vstupProHash.txt"));
        vystup = mh.vytvorHashSHA1(vstup);
        Files.write( Paths.get("vystupHashSHA1.txt"),vystup);
    }

}