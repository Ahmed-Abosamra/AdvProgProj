package elmat3am;

import Classes.BurgerClass;
import Classes.ChickenClass;
import Classes.DessertsClass;
import Classes.DrinksClass;
import Classes.PizzaClass;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class CheckOutController implements Initializable{

    @FXML
    private Label PDesserts;

    @FXML
    private AnchorPane checkout;
        
    @FXML
    private Label nDesserts;

    @FXML
    private Label nDrinks;

    @FXML
    private Label nchicken;

    @FXML
    private Label npizza;

    @FXML
    private Label pDrinks;

    @FXML
    private Label pburger;
    
    @FXML
    private Label nburger;

    @FXML
    private Label pchicken;

    @FXML
    private Label ppizza;
   
        ChickenClass chicken = new ChickenClass();
        BurgerClass burger = new BurgerClass();
        DessertsClass dessert = new DessertsClass();
        DrinksClass drink = new DrinksClass();
        PizzaClass pizza = new PizzaClass();
        
    
        @Override
    public void initialize(URL location, ResourceBundle resources) {
        if(checkout !=null){
            
            pchicken.setText(String.valueOf(ChickenClass.totalp));
            nchicken.setText(String.valueOf(ChickenClass.countn));
            
            pburger.setText(String.valueOf(BurgerClass.totalp));
            nburger.setText(String.valueOf(BurgerClass.countn));
            
            PDesserts.setText(String.valueOf(DessertsClass.totalp));
            nDesserts.setText(String.valueOf(DessertsClass.countn));
            
            pDrinks.setText(String.valueOf(DrinksClass.totalp));
            nDrinks.setText(String.valueOf(DrinksClass.countn));
            
            ppizza.setText(String.valueOf(PizzaClass.totalp));
            npizza.setText(String.valueOf(PizzaClass.countn));
            
        }
    }
   
     public void switchToMainMenu(ActionEvent event) throws IOException {        
        Parent root = FXMLLoader.load(getClass().getResource("chickenMenu.fxml"));
            Scene scene = new Scene(root);
            Stage stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
            stage.setTitle("CheckOut");
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();      
    }
     
     @FXML
    void Exit(ActionEvent event) {
        System.exit(0);
    }
     
}
