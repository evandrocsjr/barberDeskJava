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
public class UserModel extends PessoaModel{
    
   private String password;
   private String accessLevel;

    public UserModel(String password, String accessLevel, int id, String name, char sex, Date birthDate, String telephone, String email, String rg) {
        super(id, name, sex, birthDate, telephone, email, rg);
        this.password = password;
        this.accessLevel = accessLevel;
    }

    public UserModel(String password, String accessLevel, int id, String name) {
        super(id, name);
        this.password = password;
        this.accessLevel = accessLevel;
    }
   
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }
}
