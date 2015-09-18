package com.example.app;

/**
 * Created by hukoru on 15. 9. 18.
 */
public class AddCalculator implements Calculator {
    @Override
    public int calc(int a, int b) {
        return a + b;
    }
}
