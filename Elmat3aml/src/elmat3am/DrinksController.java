package elmat3am;

import Classes.DrinksClass;
import java.io.IOException;
import java.sql.SQLException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class DrinksController {
    
    DrinksClass myclass= new DrinksClass();
    
    @FXML
    private HBox FromDashboardToMenu;

    @FXML
    private HBox FromDashboardToMenu1;
    
    private String[]menu = new String[11]; // array for every menu menu2,menu3,......
    private int[] count = new int[11];      // count for every menu 
    private int[] total;  
    
    @FXML
    void Add1(ActionEvent event) {
        count[0]++;
        menu[0]="Pristine Coffe";
    }

    @FXML
    void Add2(ActionEvent event) {
        count[1]++;
        menu[1]="Exquisite Raspberry Juice";
    }

    @FXML
    void Add3(ActionEvent event) {
        count[2]++;
        menu[2]="Strawberry Milkshake";
    }

    @FXML
    void Add4(ActionEvent event) {
        count[3]++;
        menu[3]="Refreshing ice Mint";
    }

    @FXML
    void Add5(ActionEvent event) {
        count[4]++;
        menu[4]="Spiro Spathis Grape";
    }

    @FXML
    void Add6(ActionEvent event) {
        count[5]++;
        menu[5]="Spiro Spathis Apple";
    }

    @FXML
    void Add7(ActionEvent event) {
        count[6]++;
        menu[6]="Spiro Spathis Mandarine";
    }

    @FXML
    void Add8(ActionEvent event) {
        count[7]++;
        menu[7]="Spiro Spathis Lime";
    }
    
    @FXML
    void Add9(ActionEvent event) {
        count[8]++;
        menu[8]="Spiro Spathis Kiwi";
    }
    
    @FXML
    void Add10(ActionEvent event) {
        count[9]++;
        menu[9]="Spiro Spathis Peach";
    }
    
    @FXML
    void Add11(ActionEvent event) {
        count[10]++;
        menu[10]="Spiro Spathis Pineapple";
    }
    
    @FXML
    void Add12(ActionEvent event) {
        count[11]++;
        menu[11]="Spiro Spathis Lime";
    }

    @FXML
    void Cart(ActionEvent event) throws ClassNotFoundException, SQLException, IOException {
        // here multithreading call run to send data and run menu method
        myclass.info(menu, count);
        myclass.Menu();

        Parent root = FXMLLoader.load(getClass().getResource("CheckOut.fxml"));
            Scene scene = new Scene(root);
            Stage stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("Main Menu");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
    }

    @FXML
    void Remove1(ActionEvent event) {
        count[0]--;
        menu[0]="Pizza Pepperoni";
    }

    @FXML
    void Remove2(ActionEvent event) {
        count[1]--;
        menu[1]="Mix Meat Pizza";
    }

    @FXML
    void Remove3(ActionEvent event) {
        count[2]--;
        menu[2]="Extra Cheese Pizza";
    }

    @FXML
    void Remove4(ActionEvent event) {
        count[3]--;
        menu[3]="Chicken Pizza";
    }

    @FXML
    void Remove5(ActionEvent event) {
        count[4]--;
        menu[4]="Sausage Pizza";
    }

    @FXML
    void Remove6(ActionEvent event) {
        count[5]--;
        menu[5]="Seafood Pizza";
    }

    @FXML
    void Remove7(ActionEvent event) {
        count[6]--;
        menu[6]="Vegiterian Pizza";
    }

    @FXML
    void Remove8(ActionEvent event) {
        count[7]--;
        menu[7]="Pizza Basterma";
    }
    
    @FXML
    void Remove9(ActionEvent event) {
        count[8]--;
        menu[8]="Pizza Basterma";
    }
    
    @FXML
    void Remove10(ActionEvent event) {
        count[9]--;
        menu[9]="Pizza Basterma";
    }
    
    @FXML
    void Remove11(ActionEvent event) {
        count[10]--;
        menu[10]="Pizza Basterma";
    }
    
    @FXML
    void Remove12(ActionEvent event) {
        count[11]--;
        menu[11]="Pizza Basterma";
    }
    
    public void switchToLogin(ActionEvent event) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("Login.fxml"));
            Scene scene = new Scene(root);
            Stage stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("Main Menu");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
    }
    
    
    public void switchToMainMenu(ActionEvent event) throws IOException {        
        Parent root = FXMLLoader.load(getClass().getResource("Elmat3am.fxml"));
            Scene scene = new Scene(root);
            Stage stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("Main Menu");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        
    }

    public void switchToFoodMenu(ActionEvent event) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("chickenMenu.fxml"));
            Scene scene = new Scene(root);
            Stage stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("Chicken Menu");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
    }

    public void switchToContactus(ActionEvent event) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("Contactus.fxml"));
            Scene scene = new Scene(root);
            Stage stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("Contactus Menu");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
    }

    public void switchToAboutus(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Aboutus.fxml"));
            Scene scene = new Scene(root);
            Stage stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("Aboutus Menu");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
    }

    public void switchToLocaiton(ActionEvent event) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("Location.fxml"));
            Scene scene = new Scene(root);
            Stage stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("Location Menu");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
    }

    public void switchToPizzaMenu(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("pizzaMenu.fxml"));
            Scene scene = new Scene(root);
            Stage stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("pizza Menu");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
    }

    public void switchToBurgerMenu(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("burgerMenu.fxml"));
            Scene scene = new Scene(root);
            Stage stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("burger Menu");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
    }

    public void switchToDrinksMenu(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("drinksMenu.fxml"));
            Scene scene = new Scene(root);
            Stage stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("drinks Menu");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
    }

    public void switchToDessertsMenu(ActionEvent event) throws IOException {
         Parent root = FXMLLoader.load(getClass().getResource("dessertsMenu.fxml"));
            Scene scene = new Scene(root);
            Stage stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("desserts Menu");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
    }

    public void switchToProfile(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Profile.fxml"));
            Scene scene = new Scene(root);
            Stage stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("Profile Menu");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
    }
}


