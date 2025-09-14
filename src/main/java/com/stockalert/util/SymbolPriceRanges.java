package com.stockalert.util;

import static com.stockalert.common.NSEStockSymbols.*;

import java.util.HashMap;
import java.util.Map;

public class SymbolPriceRanges {

    public static class Range {
        public final double min;
        public final double max;

        public Range(double min, double max) {
            this.min = min;
            this.max = max;
        }
    }

    public static final Map<String, Range> RANGES = new HashMap<>();

    static {
        put(RELIANCE, 2200, 3200);
        put(TCS, 3200, 4200);
        put(INFY, 1300, 1700);
        put(HDFCBANK, 1400, 1800);
        put(ICICIBANK, 800, 1200);
        put(SBIN, 500, 750);
        put(AXISBANK, 700, 1000);
        put(KOTAKBANK, 1600, 2200);
        put(LT, 2500, 3500);
        put(ITC, 350, 500);
        put(HINDUNILVR, 2400, 3000);
        put(BHARTIARTL, 800, 1100);
        put(MARUTI, 9000, 11000);
        put(BAJFINANCE, 6500, 8500);
        put(HCLTECH, 1100, 1500);
        put(WIPRO, 350, 500);
        put(ASIANPAINT, 2800, 3600);
        put(ULTRACEMCO, 7000, 8500);
        put(TITAN, 3000, 3800);
        put(NESTLEIND, 18000, 22000);
        put(SUNPHARMA, 950, 1200);
        put(DRREDDY, 5000, 6000);
        put(DIVISLAB, 3300, 4500);
        put(CIPLA, 1000, 1300);
        put(COALINDIA, 250, 350);
        put(NTPC, 200, 300);
        put(POWERGRID, 250, 350);
        put(ONGC, 150, 250);
        put(TECHM, 1100, 1500);
        put(ADANIENT, 2000, 3000);
        put(ADANIPORTS, 700, 1000);
        put(GRASIM, 1800, 2400);
        put(JSWSTEEL, 700, 1000);
        put(TATASTEEL, 100, 150);
        put(HDFCLIFE, 500, 700);
        put(SBILIFE, 1100, 1400);
        put(ICICIPRULI, 450, 650);
        put(BAJAJFINSV, 1500, 1800);
        put(BAJAJ_AUTO, 4500, 5200);
        put(EICHERMOT, 3200, 3800);
        put(HEROMOTOCO, 2500, 3000);
        put(MOTILALOFS, 1400, 1800);
        put(TATAMOTORS, 600, 900);
        put(INDUSINDBK, 1100, 1400);
        put(BANDHANBNK, 180, 250);
        put(DABUR, 500, 650);
        put(BRITANNIA, 4500, 5200);
        put(GODREJCP, 900, 1200);
        put(HAVELLS, 1200, 1600);
        put(PIDILITIND, 2500, 3200);
        put(PAGEIND, 35000, 42000);
        put(COLPAL, 1500, 1900);
        put(AMBUJACEM, 400, 600);
        put(SHREECEM, 25000, 30000);
        put(UPL, 600, 800);
        put(TORNTPHARM, 1800, 2400);
        put(LUPIN, 900, 1200);
        put(ASTRAL, 1800, 2400);
        put(BOSCHLTD, 18000, 22000);
        put(GAIL, 100, 150);
        put(IOC, 80, 120);
        put(PETRONET, 200, 300);
        put(HAL, 3000, 4000);
        put(BEL, 150, 250);
        put(IRCTC, 600, 900);
        put(CONCOR, 600, 800);
        put(PFC, 250, 350);
        put(REC, 250, 350);
        put(NHPC, 70, 100);
        put(SAIL, 80, 120);
        put(VEDL, 250, 350);
        put(ZOMATO, 80, 120);
        put(NYKAA, 120, 180);
        put(PAYTM, 600, 900);
        put(DELHIVERY, 300, 450);
        put(MOTHERSON, 250, 350);
        put(TATAPOWER, 200, 300);
        put(TATAELXSI, 7000, 8500);
        put(TATACOMM, 1600, 2200);
        put(LTI, 4500, 5500);
        put(MINDTREE, 3000, 4000);
        put(MPHASIS, 2500, 3500);
        put(PERSISTENT, 3000, 4000);
        put(COFORGE, 4000, 5000);
        put(INDIGO, 2000, 2500);
        put(INTERGLOBE, 1800, 2300);
        put(IEX, 120, 180);
        put(BSE, 800, 1200);
        put(NSE, 1800, 2200);
        put(CDSL, 1000, 1400);
        put(CAMS, 2200, 2800);
        put(HONAUT, 40000, 45000);
        put(ABB, 4500, 5500);
        put(SCHNEIDER, 120, 180);
        put(SIEMENS, 3500, 4500);
    }

    private static void put(String symbol, double min, double max) {
        RANGES.put(symbol, new Range(min, max));
    }
}