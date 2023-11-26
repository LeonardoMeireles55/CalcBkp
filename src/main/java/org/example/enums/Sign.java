package org.example.enums;

public enum Sign {
    MULTIPLY("*"),
    DIVISION("/"),
    SUM("+"),
    MINUS("-"),
    MODULUS("%");

    public final String sign;

    Sign(String sign) {
        this.sign = sign;
    }
}