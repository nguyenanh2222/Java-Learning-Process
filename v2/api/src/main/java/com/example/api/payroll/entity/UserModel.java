package com.example.api.payroll.entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public
class UserModel {
    private @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    long id;

    private String name;
    private  String email;
    private String phone;

//    UserModel() {
//    }

//    public UserModel(String name, String email, String phone) {
//        this.name = name;
//        this.email = email;
//        this.phone = phone;
//
//    }
//
//    public Long getId() {
//        return this.id;
//    }
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
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//
    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof UserModel))
            return false;
        UserModel userModel = (UserModel) o;
        return Objects.equals(this.id, userModel.id) && Objects.equals(this.name, userModel.name)
                && Objects.equals(this.email, userModel.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.email);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id + ", name='" + this.name + '\'' + ", email='" + this.email + '\'' + '}';
    }

//    public void setId(Long id) {
//    }
}

