package com.example.hunter.myapplication.util;

/**
 * Created by hunter on 13.06.15.
 */

public class SymbolNotFoundException extends IllegalArgumentException {
    String message = null;
    public SymbolNotFoundException(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}