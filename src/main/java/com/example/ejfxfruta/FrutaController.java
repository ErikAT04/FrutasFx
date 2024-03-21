package com.example.ejfxfruta;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class FrutaController{

    @FXML
    private ToggleGroup fruta;

    @FXML
    private RadioButton kiwiRB;

    @FXML
    private RadioButton mandarinaRB;

    @FXML
    private RadioButton mangoRB;

    @FXML
    private RadioButton manzanaRB;

    @FXML
    private RadioButton melocRB;

    @FXML
    private RadioButton naranjaRB;

    @FXML
    private RadioButton peraRB;

    @FXML
    private RadioButton platanoRB;

    @FXML
    private RadioButton tomateRB;
    @FXML
    private Button enviarBT;

    @FXML
    private Label nombreFruta;

    @FXML
    private ImageView image;

    public RadioButton radioButton;
    @FXML
    void onEnviarClick(ActionEvent event){
        radioButton=(RadioButton) fruta.getSelectedToggle();
        if (radioButton==null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Mal");
            alert.showAndWait();
        } else {
            Cache.radioButton=radioButton;
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(FrutaApp.class.getResource("FrutaChosen.fxml"));
                Parent root = fxmlLoader.load();
                FrutaController2 controller = fxmlLoader.getController();

                Scene scene = new Scene(root);
                Stage stage = (Stage) this.enviarBT.getScene().getWindow();
                stage.setScene(scene);

            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
