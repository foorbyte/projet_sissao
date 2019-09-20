/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author freexx
 */
public class FXML_essai_Controller implements Initializable {

    @FXML
    private TableView<String> table;
    @FXML
    private TableColumn<String, String> colone1;
    @FXML
    private TableColumn<String, String> colone2;
    @FXML
    private ListView<String> list;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
                //ListView<String> list_o = new ListView<String>();
   
        ObservableList names =  FXCollections.observableArrayList();
    names.addAll(
    "Single", "Double", "Suite", "Family App");
    for (int i = 0; i < 18; i++) {
            names.add("anonym");
            list.getItems().add("Item 1");
            list.getItems().set(i, "ee");
        }
    ObservableList<String> items =FXCollections.observableArrayList ();
    items.addAll("eee", "ee");
    list.setItems(names);
    
    
    colone1.setCellValueFactory(new PropertyValueFactory<>("un"));
    colone2.setCellValueFactory(new PropertyValueFactory<>("deux"));
    table.setItems(items);
    }    
    
}
