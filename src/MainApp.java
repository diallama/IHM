
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    private Stage primaryStage;
    private AnchorPane rootLayout;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("BRIDGE  CHINOIS");
        
        

        afficherMenu();

    }

    /**
     * Initializes the root layout.
     */
    public void afficherMenu() {
        try {
            // lecture du FXML
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("View/Plateau.fxml"));
            AnchorPane menu = (AnchorPane) loader.load();
          

            // On charge la scène
            Scene scene = new Scene(menu);

            
            primaryStage.setScene(scene);

            primaryStage.show();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
}
    
    public static void main(String[] args) {
        launch(args);
    }
}