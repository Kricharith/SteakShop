/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steakshop;

import java.sql.Connection;
import java.sql.DriverManager;

public class database {

    public static Connection connectDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/steakshop", "root", "");
            System.out.println("passssssss");
            return connect;
        } catch (Exception e) {
            System.out.println("noooooooooooo");
            e.printStackTrace();
        }
        System.out.println("nullllllll");
        return null;
        
    }
}
