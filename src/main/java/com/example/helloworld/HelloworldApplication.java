package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldApplication {

    public static void main(String[] args) {
        Database db = new Database();
        db.connect();
        SignUp signup = new SignUp();
        Login login = new Login();

        signup.doSomething(db);
        login.doSomething(db);
    }

}
