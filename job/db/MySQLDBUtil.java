package com.laioffer.job.db;

public class MySQLDBUtil {
    private static final String INSTANCE = "laiproject-instance.xxxxxxxx.rds.amazonaws.com";   //link of AWS RDS instance
    private static final String PORT_NUM = "xxxx";
    public static final String DB_NAME = "laiproject";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "xxxxxxxxxx";
    public static final String URL = "jdbc:mysql://"
            + INSTANCE + ":" + PORT_NUM + "/" + DB_NAME
            + "?user=" + USERNAME + "&password=" + PASSWORD
            + "&autoReconnect=true&serverTimezone=UTC";

}
