
package Classes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AhmedClass{
    
    private static String Email,Password,FirstName,LastName,Phone;
    
          
    public boolean LoginMethod() throws ClassNotFoundException, SQLException{
    //check in Database if email and password already exit will return true to login in controller and go to home if not will call login method again
        boolean access=false;
        
        Class.forName("com.mysql.jdbc.Driver");
   
        Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/adv", "root", "");
       
          String select = "select Email,Password,FirstName,LastName,Phone from users where Email = '" + Email.toLowerCase() + "'";
          
        Statement statement = connection.createStatement();
          ResultSet resultSet=statement.executeQuery(select);
          
           while(resultSet.next()){
            String pass = resultSet.getString(2);  //1234
            
            if(pass.equals(Password)){
                access =true;
            }
            
            this.Email=resultSet.getString(1);
            this.FirstName = resultSet.getString(3);
            this.LastName = resultSet.getString(4);
            this.Phone = resultSet.getString(5);
    }
          
    connection.close();

           return access;
    }
    
    
    public void SignupMethod() throws SQLException, ClassNotFoundException{
        //write in dataBase  Email,Password,FirstName,LastName,Phone then send them to profile  
        Class.forName("com.mysql.jdbc.Driver");
         
        Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/adv", "root", "");
                  
       String sql = "INSERT INTO users (Email, Phone, FirstName, LastName, Password) VALUES ('" + Email + "', '"+ Phone + "', '"+ FirstName + "', '"+ LastName + "', '"+ Password + "')";
       
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
    }
    
    public String[] ProfileMethod(){
        // take Email,FirstName,LastName,Phone of user and go to controller then show all data in profile
        String[] profile = {Email,FirstName,LastName,Phone};
        return profile;
    }
    
    
    //setters & getters
    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    
}
