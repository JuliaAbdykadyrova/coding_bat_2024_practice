package com.digital_nomads.julia.warmup2;

public class FrontTimes {

    public String frontTimes(String str, int n) {
        // Если n равно 0, возвращаем пустую строку
        if (n == 0) {
            return "";
        }

        // Извлекаем первые 3 символа строки (или всю строку, если она короче 3 символов)
        StringBuilder nTimes = new StringBuilder(str.substring(0, Math.min(3, str.length())));

        // Повторяем добавление подстроки n-1 раз
        for (int i = 1; i < n; i++) {
            nTimes.append(str.substring(0, Math.min(3, str.length())));
        }

        // Возвращаем результат в виде строки
        return nTimes.toString();
    }

}
