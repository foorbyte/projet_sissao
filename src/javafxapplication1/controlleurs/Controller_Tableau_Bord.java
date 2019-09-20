/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1.controlleurs;

import java.net.URL;
import java.text.DateFormatSymbols;
import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

/**
 * FXML Controller class
 *
 * @author freexx
 */
public class Controller_Tableau_Bord implements Initializable {

    @FXML
    private AreaChart<?, ?> sattistique_encaissement_anneesattistique_encaissement_passees;
    @FXML
    private BarChart<?, ?> sattistique_encaissement_anneesattistique_encaissement_annee;

    private ObservableList<String> monthNames = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String[] mois = DateFormatSymbols.getInstance(Locale.FRANCE).getMonths();
        // TODO
        monthNames.addAll(Arrays.asList(mois));
        
        CategoryAxis categoryAxis = new CategoryAxis();
        categoryAxis.setLabel("Les mois");
        NumberAxis numberAxis = new NumberAxis();
        numberAxis.setLabel("Les monatnts en Franc CFA");
        sattistique_encaissement_anneesattistique_encaissement_annee.setTitle("Les impayés de l'années.");
        XYChart.Series series = new XYChart.Series();
        
        
        series.setName("Janvier"); 
        series.getData().add(new XYChart.Data<>("Speed", 1.0)); 
        series.getData().add(new XYChart.Data<>("User rating", 3.0)); 
        series.getData().add(new XYChart.Data<>("Milage", 5.0)); 
        series.getData().add(new XYChart.Data<>("Safety", 5.0));   

        
        
        categoryAxis.setCategories(monthNames);
        
        
    }    
    
}
