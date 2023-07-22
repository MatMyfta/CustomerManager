package com.example.taskmanager;

import javafx.beans.property.SimpleStringProperty;

public class Customer {
    private SimpleStringProperty id;
    private SimpleStringProperty name;
    private SimpleStringProperty email;

    public Customer(String id, String name, String email) {
        this.setId(id);
        this.setName(name);
        this.setEmail(email);
    }

    public String getId() {
        return id.get();
    }

    public String getName() {
        return name.get();
    }

    public String getEmail() {
        return email.get();
    }

    public void setId(String id) {
        this.id = new SimpleStringProperty(id);
    }

    public void setName(String name) {
        this.name = new SimpleStringProperty(name);
    }

    public void setEmail(String email) {
        this.email = new SimpleStringProperty(email);
    }
}
