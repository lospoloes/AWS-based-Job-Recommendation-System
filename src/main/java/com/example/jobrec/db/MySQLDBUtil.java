package com.example.jobrec.db;

public class MySQLDBUtil {
    private static final String INSTANCE = "database1.cjg0aooeqrq7.us-east-2.rds.amazonaws.com";
    private static final String PORT_NUM = "3306";
    public static final String DB_NAME = "jobrecdb";
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "Lyc10086!";
    public static final String URL = "jdbc:mysql://"
            + INSTANCE + ":" + PORT_NUM + "/" + DB_NAME
            + "?user=" + USERNAME + "&password=" + PASSWORD
            + "&autoReconnect=true&serverTimezone=UTC";
}
