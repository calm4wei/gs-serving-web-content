package com.ssm.dao;

import com.ssm.domain.User;
import com.ssm.util.DataSourceBean;
import com.ssm.util.DataSourceUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2016/6/22
 *
 * @author feng.wei
 */

@Repository
public class UserDao {

    @Autowired
    DataSourceBean dataSourceBean;

    public List<User> queryUsersAll() {
        List<User> userList = new ArrayList<User>();
        Connection connection = null;
        Statement statement = null;
        ResultSet rs = null;
//        Connection connection = DataSourceUtils.getConnection();
        try {
            connection = this.dataSourceBean.getDataSource().getConnection();
            String sql = "SELECT * from users";

            statement = connection.createStatement();
            rs = statement.executeQuery(sql);
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getString("id"));
                user.setName(rs.getString("name"));
                user.setAge(rs.getInt("age"));
                user.setSex(rs.getString("sex"));
                user.setNation(rs.getString("native"));
                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }

                if (statement != null) {
                    statement.close();
                }

                if (rs != null) {
                    rs.close();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return userList;
    }

}
