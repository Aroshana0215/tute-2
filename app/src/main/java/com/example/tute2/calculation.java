package com.example.tute2;

public class calculation {
    protected float convertCelciusToFahrenheit(float value) {
        Float ans = (value * 9/5) + 32;
        return ans;
    }

    protected float convertFahrenheitToCelcius(float value) {
        Float ans = (value - 32) * 5/9;
        return ans;
    }
}
