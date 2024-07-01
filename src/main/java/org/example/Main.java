package org.example;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.sum("1000110101010", "1010010111110"));
        System.out.println(bins.sum("1", "1"));
        System.out.println(bins.mult("0", "1"));
        System.out.println(bins.mult("101101010101010", "10000100010001"));
    }
}