package bmi;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label resultTitle;
    @FXML
    private TextField name, height, weight;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Calculate(ActionEvent event) {
        String n;
        float w, h, bmi;
        n = name.getText();  
        h = Float.parseFloat(height.getText()); 
        w = Float.parseFloat(weight.getText());  
        bmi = w / (h * h);
        resultTitle.setText(n + ", your BMI is " + bmi);
    }
    
}
