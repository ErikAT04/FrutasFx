package com.example.ejfxfruta;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class FrutaController2 implements Initializable{


    @FXML
    private ImageView imaView;

    RadioButton rb;

    Image ima;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        rb=Cache.radioButton;
            String fruta = "img/"+rb.getText()+".png";
            ima = new Image(getClass().getResource(fruta).toString());
            imaView.setImage(ima);
    }
}

