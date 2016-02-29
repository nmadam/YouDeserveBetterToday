package com.nancyadam.ydbt.persistence;

import com.nancyadam.ydbt.entity.Users;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author nancyadam
 * @version 1.0 2/28/2016
 */
public class UsersDoaWithSql implements UsersDoa {
    private final Logger log = Logger.getLogger(this.getClass());

    @Override
    public List<Users> getAllUsers() {
        List<Users> users = new ArrayList<Users>();

        Database database = Database.getInstance();

        Connection connection = null;


        String sql = "select * from users order by user_id";
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            database.connect();
            connection = database.getConnection();
            Statement selectStatement = connection.createStatement();
            ResultSet results = selectStatement.executeQuery(sql);

            // iterate over the resultset, adding each user to the list
            while (results.next()) {
                Users user = createUserFromResults(results);
                users.add(user);
            }
        } catch (SQLException e) {
            log.error("SQL Exception: ", e);
        } catch (Exception e) {
            log.error(e);
        }
        return users;
    }

    @Override
    public void updateUser(Users user) {

    }

    @Override
    public void deleteUser(Users user) {

    }

    @Override
    public int addUser(Users user) {return 0;}

    private Users createUserFromResults(ResultSet results) throws SQLException {
        Users user = new Users();
        user.setUserId(results.getInt("user_id"));
        user.setFirstName(results.getString("first_name"));
        user.setLastName(results.getString("last_name"));
        user.setUserPass(results.getString("user_pass"));
        user.setEmail(results.getString("email"));

        return user;
    }
}
