package com.pierre.myfirstblockchain;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class Blockchain {
    ArrayList<Block> chain;

    public Blockchain() throws NoSuchAlgorithmException {
        this.chain = new ArrayList<Block>();
        chain.add(createGenesisBlock());
    }

    Block createGenesisBlock() throws NoSuchAlgorithmException {
        return new Block(0,"11/02/2020","Genesis block data","0");
    }


}
