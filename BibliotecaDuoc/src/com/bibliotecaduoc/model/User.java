package com.bibliotecaduoc.model;

import java.util.ArrayList;


public class User {
    private String RUT;
    private String firstName;
    private String lastName;
    private String address;
    private int phoneNumber;
    private ArrayList<Book> books;

    public User(String RUT, String firstName, String lastName, String address, int phoneNumber) {
        this.RUT = RUT;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.books = new ArrayList<>();
    }
    
    public String getRUT() {
        return RUT;
    };

    public void getClientData() {
        System.out.println("\n=== Datos del cliente ===");
        System.out.println("RUT: " + this.RUT);
        System.out.println("Nombre: " + this.firstName);
        System.out.println("Apellido: " + this.lastName);
        System.out.println("Domicilio: " + this.address);
        System.out.println("Numero de telefono: " + this.phoneNumber);
    }
    
    public ArrayList<Book> getBooks() {
        return books;
    }
}