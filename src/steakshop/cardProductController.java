/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steakshop;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author UserPRO
 */
public class cardProductController implements Initializable{
    
     @FXML
    private AnchorPane card_form;

    @FXML
    private Label prod_name;

    @FXML
    private Label prod_price;

    @FXML
    private ImageView prod_imageView;

    @FXML
    private Spinner<?> prod_spinner;

    @FXML
    private Button prod_addBtn;

    private ProductData prodData;
    private Image image;
    
    public void setData(ProductData prodData){
        this.prodData = prodData;
        
        prod_name.setText(prodData.getProductName());
        prod_price.setText(String.valueOf(prodData.getPrice()));
        String path = "File:" + prodData.getImage();
        image = new Image(path,220,135,false,true);
        prod_imageView.setImage(image);
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }
    
}
