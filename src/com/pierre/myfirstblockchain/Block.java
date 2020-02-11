package com.pierre.myfirstblockchain;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Block {
    int index, nonce;
    String timestamp, data, hash, previousHash;

    MessageDigest md = MessageDigest.getInstance("SHA-256");

    public Block(int index, String timestamp, String data, String previousHash) throws NoSuchAlgorithmException {
        this.index = index;
        this.timestamp = timestamp;
        this.data = data;
        this.previousHash = previousHash;
        this.hash = this.calculateHash();
        this.nonce = 0;
    }

    String calculateHash(){
        String text = (String.valueOf(index) + timestamp + data + previousHash + String.valueOf(nonce));
        byte[] hash = md.digest(text.getBytes(StandardCharsets.UTF_8));
        return bytesToHex(hash);
    }

    private static String bytesToHex(byte[] hash) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : hash) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }

}
