package com.example;

public class Bridge {
    static {
        System.loadLibrary("rustlib");
    }

    private native int add(int a, int b);

    public static void main(String[] args) {
        Bridge bridge = new Bridge();
        int result = bridge.add(5, 3);
        System.out.println("Result of addition from Rust: " + result);
    }
}
