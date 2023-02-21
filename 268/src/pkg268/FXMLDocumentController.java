
package pkg268;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class FXMLDocumentController implements Initializable {

    @FXML
    private Label number;
    int count=1;

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
    }    

    @FXML
    private void decrease(ActionEvent event)
    {
        count--;
        String nom=number.getText();
        Integer tt=Integer.parseInt(nom);
        number.setText(""+sub(tt));
        
    }

    @FXML
    private void increase(ActionEvent event)
    {
        count++;
        String nom=number.getText();
        Integer tt=Integer.parseInt(nom);
        number.setText(""+add(tt));
        
    }
    public int add(int x)
    {
        int num=x+1;
        return num;
    }
    public int sub(int x)
    {
        int num=x-1;
        return num;
    }
}
