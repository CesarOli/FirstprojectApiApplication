package com.example.crm.firstprojectapi.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Users {
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      @Column(name = "username", unique = true)
      private String username;

      @Column(nullable = false)
      private String name;
      private String email;
      private String password;
      private String role;
      private String dateCreation;

      public String getName() {
            return name;
      }

      public void setName(String name) {
            this.name = name;
      }

      public String getUsername() {
            return username;
      }

      public void setUsername(String username) {
            this.username = username;
      }

      public String getEmail() {
            return email;
      }

      public void setEmail(String email) {
            this.email = email;
      }

      public String getPassword() {
            return password;
      }

      public void setPassword(String password) {
            this.password = password;
      }

      public String getRole() {
            return role;
      }

      public void setRole(String role) {
            this.role = role;
      }

      public String getDateCreation() {
            return dateCreation;
      }

      public void setDateCreation(String dateCreation) {
            this.dateCreation = dateCreation;
      }

      @Override
      public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Users users)) return false;
          return Objects.equals(getUsername(), users.getUsername()) && Objects.equals(getEmail(), users.getEmail());
      }

      @Override
      public int hashCode() {
            return Objects.hash(getUsername(), getEmail());
      }
}
