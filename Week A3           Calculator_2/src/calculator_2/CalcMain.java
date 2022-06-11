/*

*/

package calculator_2;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * CalcMain is the main class that will launch FXML file "View" and link to
 * the CSS file "theme". The start method will generate a new scene from the
 * FXML file "View" with the CSS styled by the file "theme".
 * 
 */

public class CalcMain extends Application {


    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }

    
    /**
     * The start method is used to create a user window by creating a stage
     * and loading the "View" file.
     * @param stage is the graphic interface that contain the FXML generated
     * GUI.
     */
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));

        stage.setTitle("Calculator");
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("theme.css").toExternalForm());


        stage.setScene(scene);
        stage.show();

    }

}
