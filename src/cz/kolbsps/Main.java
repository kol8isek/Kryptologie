package cz.kolbsps;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Kryptologie");
        System.out.println("Význam operace XOR");

        byte[] vstup = Files.readAllBytes(Paths.get("pokus2.txt"));
        byte[] vystup = XOR.zasifrujPomociXor(vstup, 101);
        Files.write( Paths.get("pokus.txt"),vystup);


    }

}