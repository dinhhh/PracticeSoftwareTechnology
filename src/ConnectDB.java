
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dinh
 */
public class ConnectDB {
    
    public static Connection getJDBCConnection(){
        final String url = "jdbc:mysql://localhost:3306/homework_db";
        final String user = "root";
        final String password = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }
    
    public static void printRecipientTable(){
        Connection connection = getJDBCConnection();
        if(connection == null){
            System.out.println("Connected");
            return;
        }
        String sql = "select * from Recipient";
        Statement st = null;
        ResultSet res = null;
        
        try{
            st = connection.createStatement();
            res = st.executeQuery(sql);
            if (res.isBeforeFirst() == false){
                System.out.println("Empty table");
                return;
            }
            String output = String.format("%-20s%-20s%-20s%-20s", "Name", "Sex", "Age", "School");
            System.out.println(output);
            while(res.next()){
                String Name = res.getString("Name");
                String Sex = res.getString("Sex");
                int Age = res.getInt("Age");
                String School = res.getString("School");
                String info = String.format("%-20s%-20s%-20d%-20s", Name, Sex, Age, School);
                System.out.println(info);                
            }
        }
        catch(SQLException throwables){
            throwables.printStackTrace();
        }
    }   
    
    public static void printGiftTable(){
        Connection connection = getJDBCConnection();
        if(connection == null){
            System.out.println("Connected");
            return;
        }
        String sql = "select * from Gift";
        Statement st = null;
        ResultSet res = null;
        try{
            st = connection.createStatement();
            res = st.executeQuery(sql);
            if (res.isBeforeFirst() == false){
                System.out.println("Empty Table");
                return;
            }
            String output = String.format("%-20s%-20s", "Gift Name", "Cost");
            System.out.println(output);
            while(res.next()){
                String Name = res.getString("Gift Name");
                String Cost = res.getString("Cost");
                String info = String.format("%-20s%-20s", Name, Cost);
                System.out.println(info);                
            }
        }
        catch(SQLException throwables){
            throwables.printStackTrace();
        }
    }
    
    public static void printFamilyTable(){
        
    }
    
    public static void main(String[] args){
//        printRecipientTable();
    }
    
    
    
}
