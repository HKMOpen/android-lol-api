package com.mobilesolutions.lolapi.utls;

/**
 * Error constants in the api.
 * <p/>
 * Created by georgi.eftimov on 08/06/2015.
 */
public class ErrorConstants {

    private ErrorConstants() {
        //no instances.
    }

    public static final String ERROR_NO_REGION_PROVIDED = "No region provided. Please call LolApi.setRegion(region).";
    public static final String ERROR_NO_API_KEY_PROVIDED = "Api key should not be null. Please call LolApi.init(apiKey) with not null reference.";
    public static final String ERROR_NO_RX_FOR_SHARDS = "We do not support shards rx because we can not change the the endpoint back after observable is used.";
    public static final String ERROR_NO_MORE_THAN_TEN_TEAMS = "Can't get leagues for more than 10 teams!";
    public static final String ERROR_NO_MORE_THAN_FOURTY_NAMES = "Can't get summoner objects for more than 10 names!";
    public static final String ERROR_NO_MORE_THAN_TEN_SUMMONERS = "Can't get teams for more than 10 summoner ids!";
    public static final String ERROR_QUEUE_TYPE_NULL = "Queue type cannot be null!";
    public static final String ERROR_PARAMETER_NULL = "Locale , version or champData cannot be null!";


}
