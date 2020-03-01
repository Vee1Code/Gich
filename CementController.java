/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gproduct1;

import java.net.URL;
import java.time.LocalDate;
import java.time.Month;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author user 2
 */
public class CementController implements Initializable {
    
//table configuration
    
    @FXML private TableView<TabViewCem>tableView;
    @FXML private TableColumn<TabViewCem, String> productNameColumn;
    @FXML private TableColumn<TabViewCem, String> inStockColumn;
    @FXML private TableColumn<TabViewCem, String> locationColumn;
    @FXML private TableColumn<TabViewCem, LocalDate> lastSupplyColumn;
   
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     // column setup
       productNameColumn.setCellValueFactory(new PropertyValueFactory<>("productName"));
        inStockColumn.setCellValueFactory(new PropertyValueFactory<>("inStock"));
         locationColumn.setCellValueFactory(new PropertyValueFactory<>("location"));
          lastSupplyColumn.setCellValueFactory(new PropertyValueFactory<>("lastSupply"));
          
          
          
        tableView.setItems(getCem()); 
        
        
    }
    
    public ObservableList<TabViewCem> getCem()
    {

        ObservableList<TabViewCem> cem = FXCollections.observableArrayList();
        cem.add(new TabViewCem("Savanna", "65", "Basement7", LocalDate.of(2019, Month.NOVEMBER, 12)));
        cem.add(new TabViewCem("Tembo", "27", "Basement2", LocalDate.of(2019, Month.APRIL, 17)));
        cem.add(new TabViewCem("BlueTriangle", "34", "Basement5", LocalDate.of(2019, Month.SEPTEMBER, 25)));
        cem.add(new TabViewCem("Rhino", "48", "Basement4", LocalDate.of(2019, Month.OCTOBER, 15)));
     
        return cem;
    }   
          
    
    
}
