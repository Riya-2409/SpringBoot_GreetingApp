package com.greetingapp.model;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Greeting {
   /* private String message;

    public Greeting(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }*/

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        private String message;

        public Greeting(){

        }

        public Greeting(String message) {
            this.message = message;
        }


        public Long getId() {
            return id;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }


}
