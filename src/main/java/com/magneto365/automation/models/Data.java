package com.magneto365.automation.models;

public class Data {
    private String email;
    private String password;
    private String nameUser;

    public Data(String email, String password,String nameUser){
        this.email=email;
        this.password=password;
        this.nameUser=nameUser;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getNameUser(){
        return nameUser;
    }
}
