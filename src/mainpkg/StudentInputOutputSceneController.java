/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author User
 */
public class StudentInputOutputSceneController implements Initializable {

    @FXML    private TextField idTextField;
    @FXML    private TextField nameTextField;
    @FXML    private TextField cgpaTextField;
    @FXML    private Label outputLabel;

    Student newStud1, newStud2;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        newStud1 = new Student();
        newStud2 = new Student(123, "Nafiz AHmed Sargis", 3.56F);
    }    

    @FXML
    private void captureNewStudentInfoMouseonClicked(ActionEvent event) {
    }

    @FXML
    private void showInfoNewStudentMouseOnClicked(ActionEvent event) {
    
        outputLabel.setText(
                "newStud1: " + newStud1.getStringEquivalent() + "\n"
                + "newStud2: " + newStud2.getStringEquivalent()
        );
    }
    
    
}
