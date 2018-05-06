package com.buratinka.statement;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class Menu {

    private static char result ;

    private static char[] read;

    public Menu() throws Exception {

        command();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
try {
    read = reader.readLine().toCharArray();

    switch (read[0]) {
        case 'a':
            Connector con = new Connector();con.Connect();
            break;
        case 'e':
            result = 'e';
            break;
            default : throw new IllegalArgumentException();


    }

}catch(IllegalArgumentException e)
{
    System.out.println("Illegal argument : " + read[0]);

}

    }

    public static char getResult() {
        return result;
    }

    public static void setResult(char result) {
        Menu.result = result;
    }

    private static void command()
    {
        System.out.println("Please chcose command : \n a - show all \n e - exit");

    }

}
