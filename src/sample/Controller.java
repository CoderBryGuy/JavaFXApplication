package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;


import java.awt.*;
import java.io.File;

public class Controller {
    @FXML
    private Label label;

    @FXML
    private RadioButton radioButton;

    @FXML
    private Button button4;

    @FXML
    private GridPane gridPane;

    public void initialize(){
    button4.setEffect(new DropShadow());


    }

    @FXML
    public void handleMouseEntered(){
        label.setScaleX(2.0);
        label.setScaleY(2.0);
        label.setRotate(90);


    }

    @FXML
    public void handleMouseExited(){
        label.setScaleX(1.0);
        label.setScaleY(1.0);
        label.setRotate(0);



    }

    @FXML
    public void handleClick(){
//        FileChooser chooser = new FileChooser();
//        chooser.showOpenDialog(gridPane.getScene().getWindow());

//       DirectoryChooser chooser = new DirectoryChooser();
         FileChooser chooser = new FileChooser();
        // chooser.setTitle("Save Application File");
         chooser.getExtensionFilters().addAll(
                 new FileChooser.ExtensionFilter("Text", "*.txt"),
                 new FileChooser.ExtensionFilter("PDF", "*.PDF"),
                 new FileChooser.ExtensionFilter("All Files", "*.*")
         );
         File file = chooser.showOpenDialog(gridPane.getScene().getWindow());

       if(file != null){
           System.out.println(file.getPath());
       }else {
           System.out.println("chooser canceled");
       }
    }

    @FXML
    public void handleLinkClicked(){
      try{
          Desktop.getDesktop()
      }
    }
}
