package Classes;

import static Classes.BurgerClass.countn;
import static Classes.BurgerClass.totalp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PizzaClass implements Menu {
    
    private String[]menu ; // array for every menu menu2,menu3,......
    private int[] count ;      // count for every menu 
    public int[]total = new int[8];
    
    public static int totalp = 0;
    public static int countn = 0;
    
        @Override
    public void info(String[] menu, int[] count) {
        // get info form controller to this class 
        this.menu = menu;
        this.count = count;
    }
    
    public void Menu() throws ClassNotFoundException, SQLException{
    //Search the database by the name of the product, get the price, then multiply it by the number  
        
        Class.forName("com.mysql.jdbc.Driver");
   
        Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/adv", "root", "");
        System.out.println("conniction");
        for(int i = 0 ; i<menu.length ; i++){
            if(menu[i] != null){
            
          String select = "select name,price from pizza where name = '" + menu[i]+ "'";
          // create table called menu in DB
        Statement statement = connection.createStatement();
          ResultSet resultSet=statement.executeQuery(select);
          
           while(resultSet.next()){
                int price = Integer.parseInt(resultSet.getString(2));  
                total[i] = price*count[i];
    }
            }
        }    
    connection.close();
        for(int i = 0 ; i<total.length;i++){
            totalp+=total[i];
            countn+=count[i];
        }
    }
    


    
}

