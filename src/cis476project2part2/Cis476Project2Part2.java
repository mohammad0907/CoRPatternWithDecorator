/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cis476project2part2;


import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author rashe
 */
public class Cis476Project2Part2 extends Application{
    private TextField inputText = new TextField("Enter a Number");
    private TextField outputText = new TextField();
    private Button button = new Button("Convert");
    private Text kiloText = new Text("Kilometer");
    private String[] options = {"Mile", "Yard", "Foot" };
 
    
    private ComboBox comboBox = new ComboBox(FXCollections 
                                 .observableArrayList(options)); 
    
    private Parent createContent(){
        Pane root = new Pane();
        inputText.setTranslateX(50);
        inputText.setTranslateY(50);
        outputText.setTranslateX(50);
        outputText.setTranslateY(100);
        outputText.setDisable(true);
        outputText.setStyle("-fx-opacity: 1;");
        kiloText.setTranslateX(250);
        kiloText.setTranslateY(65);
        comboBox.setTranslateX(250);
        comboBox.setTranslateY(100);
        comboBox.setPromptText("Choose a Option");
        button.setTranslateX(55);
        button.setTranslateY(200);
        
        
        
        
       
        
        
        root.getChildren().add(inputText);
        root.getChildren().add(outputText);
        root.getChildren().add(kiloText);
       root.getChildren().add(button);
       root.getChildren().add(comboBox);
        button.setOnMouseClicked(e -> calculate());
        return root; 
    }
    
    private void calculate(){
        ConversionHandler mileConverter = new MileConverter();
        ConversionHandler yardConverter = new YardConverter();
        ConversionHandler footConverter = new FootConverter();
        ConversionHandler convertedUnit; 
      
        mileConverter.setSuccessor(yardConverter);
        yardConverter.setSuccessor(footConverter); 
        
        
        
       convertedUnit =  mileConverter.handleConversion(inputText.getText(), comboBox.getValue().toString());
       convertedUnit =  new RoundDecorator(convertedUnit);
       convertedUnit = new ExpNotationDecorator(convertedUnit);
       convertedUnit = new AddUnitName(convertedUnit);
       
         outputText.setText(convertedUnit.getResult());
    }
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setScene(new Scene(createContent(), 400, 300));
        stage.setTitle("Length Converter 2");
        stage.show();
    }
    
}
