package com.buratinka.statement;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;



public class Connector implements Query{

    private static final String URL = "jdbc:mysql://localhost:3306/mydbtest" ;
    private static final String USERNAME = "root";
    private static final String PASSWORD = "admin";



    private static String result = "";


    static void Connect() throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try
        {

            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            preparedStatement = connection.prepareStatement(GET_ALL);

            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next())
            {
                int id = rs.getInt("id");
                int age = rs.getInt("age");
                String name = rs.getString("name");
                String email = rs.getString("email");

                result = "id: "+id+"; name: "+name+"; age: "+age+"; email: "+email+";";

                Print(result);

            }

        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        finally {
            connection.close();
        }

    }


    public static void Print(String result)
    {
        System.out.println(result);
    }

}
