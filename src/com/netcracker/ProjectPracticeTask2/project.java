package com.netcracker.ProjectPracticeTask2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class project {
    public static void main(String [] args)throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@10.106.4.121:1525/rbmbe_ci.netcracker.com","geneva_admin","geneva_admin");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("SELECT * FROM account WHERE PREPAY_BOO = 'T'");

        while(rs.next()) {
            System.out.println("Account_Num: "+rs.getString(1)+" \n"+"Customer_Ref: "+rs.getString(2)+" \n"+"Billing Status: "+rs.getString(3));
            System.out.println();
        }
        con.close();
    }

}

