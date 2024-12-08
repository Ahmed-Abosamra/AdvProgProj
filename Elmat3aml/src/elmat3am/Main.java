package elmat3am;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.input.KeyCombination;

import java.util.Objects;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        System.setProperty("prism.order", "es2"); // Enable hardware acceleration using OpenGL (ES2)

        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("Login.fxml")));
        primaryStage.setTitle("E7naltalata");

//        primaryStage.setMinWidth(1300); // dah el 7ad el adnaa ll 3ard
//        primaryStage.setMinHeight(570); // dah el 7ad el adnaa ll tool

//        Image icon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/appIcon.png"))); // create an object for the image
//        primaryStage.getIcons().add(icon); // set the icon object as the app's icon

        primaryStage.setResizable(true); // this window is using responsive design so no worries :D
        primaryStage.setFullScreen(false); // initially open in fullscreen mode if set to true
        primaryStage.setFullScreenExitHint("Ed3ass zerr el f 3shan tetla3 mn el fullscreen"); // prompt the user with how to exit full screen mode
        primaryStage.setFullScreenExitKeyCombination(KeyCombination.valueOf("f")); // to exit full screen press f

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) { launch(args); }
}
