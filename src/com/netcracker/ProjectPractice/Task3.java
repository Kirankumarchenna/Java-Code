package com.netcracker.ProjectPractice;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;

public class Task3 {
    public static void main(String[] args) throws ClassNotFoundException {
        String clusterIP = "10.109.65.102";
        Cluster cluster;
        Session session;
        cluster = Cluster.builder().withCredentials("ocs_superuser","password").addContactPoint(clusterIP).withPort(9042).build();
        session = cluster.connect();

        ResultSet resultSet = session.execute("select * from smart.costedevent2_220319000;");
        for(Row row: resultSet){
            System.out.format("Accountnum "+row.getInt("accountnum"), row.getString("eventsource"));
        }
    }
}
