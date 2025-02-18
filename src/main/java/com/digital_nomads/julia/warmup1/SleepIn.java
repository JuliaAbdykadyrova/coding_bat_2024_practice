package com.digital_nomads.julia.warmup1;

public class SleepIn {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == false || vacation) {
            return true;
        } else {
            return false;
        }
    }

}
