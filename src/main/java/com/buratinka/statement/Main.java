package com.buratinka.statement;

import com.mysql.fabric.jdbc.FabricMySQLDriver;
import com.mysql.jdbc.ResultSetImpl;

import java.io.IOException;
import java.sql.*;


public class Main {


    public static void main(String[] args) throws Exception {

        Menu menu = new Menu();

        switch (menu.getResult())
        {
            case 'e' : System.out.println("bye-bye");
            break;
            case 'x' : System.out.println("IllegalArgumentException");
            break;
        }


    }
}
