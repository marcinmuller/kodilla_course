package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {
    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }
    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(5, counter);
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException{
        //given
        DbManager dbManager=DbManager.getInstance();
        //when
        String sqlQuery = "SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*)  FROM POSTS P, USERS U WHERE P.USER_ID=U.ID GROUP BY U.ID HAVING COUNT(*)>1";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        //THEN
        int counter=0;
        while (rs.next()){
            counter++;
            System.out.println(rs.getString("FIRSTNAME")+" "+rs.getString("LASTNAME"));
        }
        rs.close();
        statement.close();
        Assert.assertEquals(1,counter);
    }
}