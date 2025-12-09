package cz.kolbsps;

public class XOR {
    public static byte[] zasifrujPomociXor(byte[] vstupni, int klic){
        byte[] poOperaciXor = new byte[vstupni.length];
        for (int i = 0; i < vstupni.length; i++) {
            poOperaciXor[i] = (byte)(vstupni[i]^klic);

        }

        return poOperaciXor;
    }
}
