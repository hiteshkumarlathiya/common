package com.stockalert.util;

import static com.stockalert.util.SymbolPriceRanges.RANGES;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SymbolPreviousClose {

    public static final Map<String, Double> PREV_CLOSE = new HashMap<>();

    static {
        Random random = new Random();

        // For each symbol in RANGES, generate a close price within min/max
        RANGES.forEach((symbol, range) -> {
            double closePrice = range.min + (range.max - range.min) * random.nextDouble();
            PREV_CLOSE.put(symbol, round(closePrice, 2));
        });
    }

    private static double round(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    public static Double getClosePrice(String symbol) {
        return PREV_CLOSE.get(symbol);
    }
}