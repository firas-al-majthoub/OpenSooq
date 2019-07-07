package com.firas.opensooq.utils;

public final class AppConstants {

    public static final String AMMAN = "Amman";
    public static final String IRBID = "Irbid";
    public static final String AQABA = "Aqaba";

    public static final int AMMAN_ID = 250441;
    public static final int IRBID_ID = 248944;
    public static final int AQABA_ID = 250774;

    public static int getCityId(String cityName) {
        switch (cityName) {
            case AMMAN:
                return AMMAN_ID;
            case IRBID:
                return IRBID_ID;
            case AQABA:
                return AQABA_ID;
            default:
                return AQABA_ID;
        }
    }

}
