package application;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculController 
{

    @FXML
    private Button add;

    @FXML
    private Button division;
    
    @FXML
    private TextField txt2;

    @FXML
    private TextField txt1;

    @FXML
    private Label iblres;

    @FXML
    private Button sous;
    
    @FXML
    private Button multi;
    
    int num1=0, num2=0, res=0;

    @FXML
    void check1()
    {
    	checkNum(txt1);
    }
    
    @FXML
    void check2()
    {
    	checkNum(txt2);
    }
    
    @FXML
    void checkNum(TextField a)
    {
    	{
			num1=Integer.parseInt(txt1.getText());
		} catch (NumberFormatException e) 
    	{
		Alert alert=new Alert(AlertType.ERROR);
		alert.setHeaderText("Attention - Erreur");
		alert.setTitle("Erreur");
		alert.setContentText("Tu dois ecrire un nombre");
		alert.show();
		txt1.requestFocus();
		}
    }

}
