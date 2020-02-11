package com.pierre.myfirstblockchain;

import java.security.NoSuchAlgorithmException;

public class Main {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Blockchain blockchain = new Blockchain();
        System.out.println(blockchain.chain.get(0).hash);

        //Block block1 = new Block(1,"11/02/2020","block data","0");
        //System.out.println(block1.hash);
    }
}
