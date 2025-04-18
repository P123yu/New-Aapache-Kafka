package com.example.SpringKafka.model;
//
//public class User {
//    private String id;
//    private String name;
//    private String email;
//
//    // Constructors
//    public User() {}
//
//    public User(String id, String name, String email) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//    }
//
//    // Getters & Setters
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    // Optional: toString() if you want to log
//    @Override
//    public String toString() {
//        return "User{" + "id='" + id + "', name='" + name + "', email='" + email + "'}";
//    }
//}



public class User {
    private Long id;
    private String name;
    private String city;

    public User(){}


    public User(Long id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
