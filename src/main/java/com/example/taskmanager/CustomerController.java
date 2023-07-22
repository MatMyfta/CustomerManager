package com.example.taskmanager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

import java.net.URL;
import java.util.ResourceBundle;

public class CustomerController implements Initializable {

    @FXML
    private TableView<Customer> table;

    @FXML
    private TableColumn<Customer, String> id;

    @FXML
    private TableColumn<Customer, String> name;

    @FXML
    private TableColumn<Customer, String> email;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        final ObservableList<Customer> data = FXCollections.observableArrayList(
                new Customer("1","Matmyfta", "mateomyftaraj98@gmail.com"),
                new Customer("2","AleAnge", "freetatebrothers@matrix.com")
        );

        TableColumn<Customer, String> id = new TableColumn<Customer, String>("ID");
        TableColumn<Customer, String> name = new TableColumn<Customer, String>("Name");
        TableColumn<Customer, String> email = new TableColumn<Customer, String>("Email");

        id.setCellValueFactory(new PropertyValueFactory<Customer,String>("id"));
        name.setCellValueFactory(new PropertyValueFactory<Customer,String>("name"));
        email.setCellValueFactory(new PropertyValueFactory<Customer,String>("email"));

        name.setCellFactory(TextFieldTableCell.forTableColumn());
        email.setCellFactory(TextFieldTableCell.forTableColumn());

        name.setOnEditCommit(event -> {
            Customer customer = event.getRowValue();
            customer.setName(event.getNewValue());
        });

        email.setOnEditCommit(event -> {
            Customer customer = event.getRowValue();
            customer.setName(event.getNewValue());
        });

        table.getColumns().addAll(id, name, email);

        table.setItems(data);
    }
}
