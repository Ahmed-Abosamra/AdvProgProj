package elmat3am;

import Classes.AhmedClass;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class AhmedController implements Initializable {
    
    
    @FXML
    private TextField Sc1_Email;

    @FXML
    private Button Sc1_Login;

    @FXML
    private TextField Sc1_Password;

    @FXML
    private Button Sc1_Signup;
    
    @FXML
    private TextField Sc2_Confirm;

    @FXML
    private TextField Sc2_Email;

    @FXML
    private TextField Sc2_First;

    @FXML
    private TextField Sc2_Last;

    @FXML
    private TextField Sc2_Password;

    @FXML
    private TextField Sc2_Phone;

    @FXML
    private Button Sc2_Signup;
    
    @FXML
    private Button Home;

    @FXML
    private Label p_FirstName;

    @FXML
    private Label p_Gmail;

    @FXML
    private Label p_LastName;

    @FXML
    private Label p_Phone;

    @FXML
    private Label p_Welcome;

    @FXML
    private AnchorPane profile;
    
    @FXML
    private Label check;
    
     @FXML
    private Label Sc_2check;
    
    @FXML
    private BorderPane menu;
     
      @FXML
    private Button m_profile;

    @FXML
    private Label m_welcome;

    
        AhmedClass myclass = new AhmedClass();
            
    @Override
    public void initialize(URL location, ResourceBundle resources ) {
        //
        if(profile !=null){
            
            SetProf1();
        }
//        When the profile window is present, it will be call setprofile1
        if(menu != null){
            //        When the profile window is present, it will call setprofile2
            SetProf2();
        }
        
    }
    

    @FXML
    void Sc1_Login(ActionEvent event) throws IOException, ClassNotFoundException, SQLException {
        //If the user information entered is correct, he will be moved to the home page and if not will present The Email or password is incorrect. Please Login again
        myclass.setEmail(Sc1_Email.getText());
        myclass.setPassword(Sc1_Password.getText());
         if(myclass.LoginMethod()){ 
             Parent root = FXMLLoader.load(getClass().getResource("Elmat3am.fxml"));
            Scene scene = new Scene(root);
            Stage stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("Profile");
            stage.setScene(scene);
            stage.show();
            
         }else{
             check.setText("The Email or password is incorrect. Please Login again");

         }

    }
    
    @FXML
    void Sc1_Signup(ActionEvent event) throws IOException {
        //go to Signup page (Create a new account within Database)
        Parent root = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
            Scene scene = new Scene(root);
            Stage stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("Login");
            stage.setScene(scene);
            stage.show();
    }
    
    @FXML
    void Sc2_Signup(ActionEvent event) throws IOException, SQLException, ClassNotFoundException {
        // go to Login page
            myclass.setEmail(Sc2_Email.getText());
            myclass.setPassword(Sc2_Password.getText());
            myclass.setFirstName(Sc2_First.getText());
            myclass.setLastName(Sc2_Last.getText());
            myclass.setPhone(Sc2_Phone.getText());
        
        if(Sc2_Password.getText().equals(Sc2_Confirm.getText()) ){
            
            myclass.SignupMethod();
            Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
            Scene scene = new Scene(root);
            Stage stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("SignUp");
            stage.setScene(scene);
            stage.show();
 
            }else{
                Sc_2check.setText("The passwords do not match");
        }
    }

    public void SetProf2(){ 
//            Send data to profile name label
        m_welcome.setText("Welcome "+myclass.ProfileMethod()[1]);
        m_profile.setText(myclass.ProfileMethod()[1]);
    }
    
    public void SetProf1(){
        //            Send data to profile window
        p_Welcome.setText("Welcome "+myclass.ProfileMethod()[1]+myclass.ProfileMethod()[2]);
        p_FirstName.setText(myclass.ProfileMethod()[1]);
        p_LastName.setText(myclass.ProfileMethod()[2]);
        p_Gmail.setText(myclass.ProfileMethod()[0]);
        p_Phone.setText(myclass.ProfileMethod()[3]);
    }
    
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToSignUp(ActionEvent event) throws IOException {
        //change to the signup screen
         root = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
     scene = new Scene(root);
     stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
     stage.setTitle("Main Menu");
     stage.setScene(scene);
     stage.centerOnScreen();
     stage.show();
    }

    public void switchToLogin(ActionEvent event) throws IOException {
//        change to the Login screen
          root = FXMLLoader.load(getClass().getResource("Login.fxml"));
            scene = new Scene(root);
            stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("Main Menu");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
    }

    public void switchToMainMenu(ActionEvent event) throws IOException {  
//        change to the main screen
         root = FXMLLoader.load(getClass().getResource("Elmat3am.fxml"));
            scene = new Scene(root);
            stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("Main Menu");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        
    }

    public void switchToFoodMenu(ActionEvent event) throws IOException {
//        change to the chicken screen
          root = FXMLLoader.load(getClass().getResource("chickenMenu.fxml"));
             scene = new Scene(root);
             stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("Chicken Menu");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
    }

    public void switchToContactus(ActionEvent event) throws IOException {
//        change to the contactus screen
          root = FXMLLoader.load(getClass().getResource("Contactus.fxml"));
             scene = new Scene(root);
             stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("Contactus Menu");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
    }

    public void switchToAboutus(ActionEvent event) throws IOException {
//        change to the aboutus screen
         root = FXMLLoader.load(getClass().getResource("Aboutus.fxml"));
             scene = new Scene(root);
             stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("Aboutus Menu");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
    }

    public void switchToLocaiton(ActionEvent event) throws IOException {
//        change to the location screen
          root = FXMLLoader.load(getClass().getResource("Location.fxml"));
             scene = new Scene(root);
             stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("Location Menu");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
    }

    public void switchToPizzaMenu(ActionEvent event) throws IOException {
//        change to the pizza menu screen
         root = FXMLLoader.load(getClass().getResource("pizzaMenu.fxml"));
             scene = new Scene(root);
             stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("pizza Menu");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
    }

    public void switchToBurgerMenu(ActionEvent event) throws IOException {
         root = FXMLLoader.load(getClass().getResource("burgerMenu.fxml"));
             scene = new Scene(root);
             stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("burger Menu");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
    }

    public void switchToDrinksMenu(ActionEvent event) throws IOException {
        //        change to the Drinks menu screen
         root = FXMLLoader.load(getClass().getResource("drinksMenu.fxml"));
             scene = new Scene(root);
             stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("drinks Menu");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
    }

    public void switchToDessertsMenu(ActionEvent event) throws IOException {
        //        change to the Desserts menu screen
          root = FXMLLoader.load(getClass().getResource("dessertsMenu.fxml"));
             scene = new Scene(root);
             stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("desserts Menu");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
    }

    public void switchToProfile(ActionEvent event) throws IOException {
        //        change to the Profile screen
         root = FXMLLoader.load(getClass().getResource("Profile.fxml"));
             scene = new Scene(root);
             stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("Profile Menu");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
    }
    


}
