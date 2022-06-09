/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;

/**
 *
 * @author Evandro
 */
public class ClienteModel {
    
    private int id;
    private String name;
    private char sex;
    private Date birthDate;
    private String telephone;
    private String email;
    private String rg;
    private String address;
    private String cep;

    public ClienteModel(int id, String name, char sex, Date birthDate, String telephone, String email, String rg, String address, String cep) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthDate = birthDate;
        this.telephone = telephone;
        this.email = email;
        this.rg = rg;
        this.address = address;
        this.cep = cep;
    }

    public ClienteModel(int id, String name, char sex, String telephone, String address) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.telephone = telephone;
        this.address = address;
    }

    
    
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }
    
    
}
