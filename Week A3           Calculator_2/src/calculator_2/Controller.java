
/*

 */
package calculator_2;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.scene.layout.*;

/**
 * FXML Controller class is called from the "View" file. The "Controller" has a
 * "eventNumpad" to input characters from the GUI and has a "eventOperator"
 * method to handle operators from the GUI to input math expressions. There is
 * an "eventC" method to clear the output and program total.
 *
 */
public class Controller implements Initializable {

    private double number1;
    private double newNumber2;

    private boolean operatorPressed;
    private String operator = "";
    private String currentOper;

    private Model model;

    @FXML
    private Text output;

    String value;

    /**
     * "eventNumpad" method will set the text for output.
     *
     * @FXML used to handle the ActionEvent process as a parameter in the
     * processNumpad method.
     * @param event is triggered by numeric characters on the GUI. The selected
     * character will execute processNumpad method.
     */
    @FXML
    private void eventNumpad(ActionEvent event) {
        if (event.getSource() instanceof Button) {
            Button btn = (Button) event.getSource();
            if (operatorPressed) {
                output.setText(btn.getText().trim());
            } else {
                output.setText(output.getText().trim() + btn.getText().trim());
            }
            operatorPressed = false;
        }
    }

    /**
     * The "eventOperator"method will set the operator that will determine what
     * switch statement to execute from the model class. The Model's switch
     * statement contains math expressions.
     *
     * @FXML used to handle the ActionEvent process as a parameter in the
     * eventOperator method.
     * @param event is triggered by operator events on the GUI.
     */
    @FXML
    private void eventOperator(ActionEvent event) {
        if (event.getSource() instanceof Button) {
            Button btn = (Button) event.getSource();
            currentOper = btn.getText().trim();

            if (!output.getText().isEmpty()) {

                newNumber2 = Double.valueOf(output.getText());
                model = new Model(number1, newNumber2, operator);
                number1 = model.calculate();

            }

            if (currentOper.equals("=")) {
                output.setText(String.valueOf(number1));
                operator = "";

            } else {
                output.setText("");
                operator = currentOper;
            }
            operatorPressed = true;
        }
    }

    /**
     * The "eventC' method will set the output text to empty, and clear the
     * input fields.
     * @FXML used to handle the ActionEvent process as a parameter in the eventC
     * method.
     * @param event is triggered by "C" events on the GUI.
     */
    @FXML
    private void eventC(ActionEvent event) {
        output.setText("");
        newNumber2 = 0.0;
        number1 = 0.0;
        operatorPressed = false;
        operator = "";
    }

    /**
     * // * The initialize method is Overridden to populate FXML fields. // *
     * @param url is used to resolve relative paths for the root object, and //
     * * null if the location is unknown. // * @param rb is part of the
     * ResourceBundle passed from the FXML loader and // * can be used to
     * translate text and modify local fields. //
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //
    }
}
