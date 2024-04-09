package edu.iu.habahram.ducksservice.security;

import java.security.KeyPairGenerator;
import java.security.KeyPair;

public class KeyGeneratorUtils {
    
    private KeyGeneratorUtils(){}

    static KeyPair generateRsaKey(){
        KeyPair keyPair;
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
            keyPair = keyPairGenerator.generateKeyPair();
        } catch (Exception ex) {
            throw new IllegalStateException(ex);
        }
        return keyPair;
    }
}
