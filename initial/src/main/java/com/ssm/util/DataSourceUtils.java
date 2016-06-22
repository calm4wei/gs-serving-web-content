package com.ssm.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created on 2016/6/22
 *
 * @author feng.wei
 */
public class DataSourceUtils {

    public static Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("org.h2.Driver");
            connection = DriverManager.getConnection("jdbc:h2:D:/work/workspace/fork/gs-serving-web-content/initial/data/fdata;DATABASE_TO_UPPER=false","h2","h2");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
