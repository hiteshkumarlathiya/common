package com.stockalert.common;

public class PriceWindow {
    public static double lower(double price) { return price * 0.95; }
    public static double upper(double price) { return price * 1.05; }
}