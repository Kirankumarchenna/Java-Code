package com.netcracker.ProjectPracticeTask2;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCExample {
    public static void main(String[] args) throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@10.106.4.121:1525/rbmbe_ci.netcracker.com","geneva_admin","geneva_admin");

    }
}
