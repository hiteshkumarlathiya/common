package com.stockalert.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class NSEStockSymbols {

    public static final String RELIANCE = "RELIANCE";
    public static final String TCS = "TCS";
    public static final String INFY = "INFY";
    public static final String HDFCBANK = "HDFCBANK";
    public static final String ICICIBANK = "ICICIBANK";
    public static final String SBIN = "SBIN";
    public static final String AXISBANK = "AXISBANK";
    public static final String KOTAKBANK = "KOTAKBANK";
    public static final String LT = "LT";
    public static final String ITC = "ITC";
    public static final String HINDUNILVR = "HINDUNILVR";
    public static final String BHARTIARTL = "BHARTIARTL";
    public static final String MARUTI = "MARUTI";
    public static final String BAJFINANCE = "BAJFINANCE";
    public static final String HCLTECH = "HCLTECH";
    public static final String WIPRO = "WIPRO";
    public static final String ASIANPAINT = "ASIANPAINT";
    public static final String ULTRACEMCO = "ULTRACEMCO";
    public static final String TITAN = "TITAN";
    public static final String NESTLEIND = "NESTLEIND";
    public static final String SUNPHARMA = "SUNPHARMA";
    public static final String DRREDDY = "DRREDDY";
    public static final String DIVISLAB = "DIVISLAB";
    public static final String CIPLA = "CIPLA";
    public static final String COALINDIA = "COALINDIA";
    public static final String NTPC = "NTPC";
    public static final String POWERGRID = "POWERGRID";
    public static final String ONGC = "ONGC";
    public static final String TECHM = "TECHM";
    public static final String ADANIENT = "ADANIENT";
    public static final String ADANIPORTS = "ADANIPORTS";
    public static final String GRASIM = "GRASIM";
    public static final String JSWSTEEL = "JSWSTEEL";
    public static final String TATASTEEL = "TATASTEEL";
    public static final String HDFCLIFE = "HDFCLIFE";
    public static final String SBILIFE = "SBILIFE";
    public static final String ICICIPRULI = "ICICIPRULI";
    public static final String BAJAJFINSV = "BAJAJFINSV";
    public static final String BAJAJ_AUTO = "BAJAJ_AUTO";
    public static final String EICHERMOT = "EICHERMOT";
    public static final String HEROMOTOCO = "HEROMOTOCO";
    public static final String TATAMOTORS = "TATAMOTORS";
    public static final String INDUSINDBK = "INDUSINDBK";
    public static final String BANDHANBNK = "BANDHANBNK";
    public static final String DABUR = "DABUR";
    public static final String BRITANNIA = "BRITANNIA";
    public static final String GODREJCP = "GODREJCP";
    public static final String HAVELLS = "HAVELLS";
    public static final String PIDILITIND = "PIDILITIND";
    public static final String PAGEIND = "PAGEIND";
    public static final String COLPAL = "COLPAL";
    public static final String AMBUJACEM = "AMBUJACEM";
    public static final String SHREECEM = "SHREECEM";
    public static final String UPL = "UPL";
    public static final String TORNTPHARM = "TORNTPHARM";
    public static final String LUPIN = "LUPIN";
    public static final String ASTRAL = "ASTRAL";
    public static final String BOSCHLTD = "BOSCHLTD";
    public static final String GAIL = "GAIL";
    public static final String IOC = "IOC";
    public static final String PETRONET = "PETRONET";
    public static final String HAL = "HAL";
    public static final String BEL = "BEL";
    public static final String IRCTC = "IRCTC";
    public static final String CONCOR = "CONCOR";
    public static final String PFC = "PFC";
    public static final String REC = "REC";
    public static final String NHPC = "NHPC";
    public static final String SAIL = "SAIL";
    public static final String VEDL = "VEDL";
    public static final String ZOMATO = "ZOMATO";
    public static final String NYKAA = "NYKAA";
    public static final String PAYTM = "PAYTM";
    public static final String DELHIVERY = "DELHIVERY";
    public static final String MOTILALOFS = "MOTILALOFS";
    public static final String MOTHERSON = "MOTHERSON";
    public static final String TATAPOWER = "TATAPOWER";
    public static final String TATAELXSI = "TATAELXSI";
    public static final String TATACOMM = "TATACOMM";
    public static final String LTI = "LTI";
    public static final String MINDTREE = "MINDTREE";
    public static final String MPHASIS = "MPHASIS";
    public static final String PERSISTENT = "PERSISTENT";
    public static final String COFORGE = "COFORGE";
    public static final String INDIGO = "INDIGO";
    public static final String INTERGLOBE = "INTERGLOBE";
    public static final String IEX = "IEX";
    public static final String BSE = "BSE";
    public static final String NSE = "NSE";
    public static final String CDSL = "CDSL";
    public static final String CAMS = "CAMS";
    public static final String HONAUT = "HONAUT";
    public static final String ABB = "ABB";
    public static final String SCHNEIDER = "SCHNEIDER";
    public static final String SIEMENS = "SIEMENS";

    public static final List<String> ALL_SYMBOLS = Arrays.asList(
        RELIANCE, TCS, INFY, HDFCBANK, ICICIBANK, SBIN, AXISBANK, KOTAKBANK, LT, ITC,
        HINDUNILVR, BHARTIARTL, MARUTI, BAJFINANCE, HCLTECH, WIPRO, ASIANPAINT, ULTRACEMCO, TITAN, NESTLEIND,
        SUNPHARMA, DRREDDY, DIVISLAB, CIPLA, COALINDIA, NTPC, POWERGRID, ONGC, TECHM, ADANIENT,
        ADANIPORTS, GRASIM, JSWSTEEL, TATASTEEL, HDFCLIFE, SBILIFE, ICICIPRULI, BAJAJFINSV, BAJAJ_AUTO, EICHERMOT,
        HEROMOTOCO, MOTILALOFS, TATAMOTORS, INDUSINDBK, BANDHANBNK, DABUR, BRITANNIA, GODREJCP, HAVELLS, PIDILITIND,
        PAGEIND, COLPAL, AMBUJACEM, SHREECEM, UPL, TORNTPHARM, LUPIN, ASTRAL, BOSCHLTD, GAIL,
        IOC, PETRONET, HAL, BEL, IRCTC, CONCOR, PFC, REC, NHPC, SAIL,
        VEDL, ZOMATO, NYKAA, PAYTM, DELHIVERY, MOTHERSON, TATAPOWER, TATAELXSI, TATACOMM, LTI,
        MINDTREE, MPHASIS, PERSISTENT, COFORGE, INDIGO, INTERGLOBE, IEX, BSE, NSE, CDSL,
        CAMS, HONAUT, ABB, SCHNEIDER, SIEMENS
    );
    public static List<String> pickRandomSymbols() {
    	return List.of(RELIANCE);
    }
    
    public static List<String> pickRandomSymbols1() {
        List<String> allSymbols = new ArrayList<>(NSEStockSymbols.ALL_SYMBOLS);
        Collections.shuffle(allSymbols); // Randomize order

        Random random = new Random();
        int count = 5 + random.nextInt(25); // Random number between 5 and 25

        return allSymbols.subList(0, count);
    }
}