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
public class ClienteModel extends PessoaModel {
    
    private String address;
    private String cep;

    public ClienteModel(String address, String cep, int id, String name, char sex, Date birthDate, String telephone, String email, String rg) {
        super(id, name, sex, birthDate, telephone, email, rg);
        this.address = address;
        this.cep = cep;
    }

    public ClienteModel(int id, String name, String address, String cep) {
        super(id, name);
        this.address = address;
        this.cep = cep;
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
}
