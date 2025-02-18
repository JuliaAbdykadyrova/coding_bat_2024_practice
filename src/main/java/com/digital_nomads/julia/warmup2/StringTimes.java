package com.digital_nomads.julia.warmup2;

public class StringTimes {

    public String stringTimes(String str, int n) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < n; i++){
            result.append(str);
        } return result.toString();
    }
}
