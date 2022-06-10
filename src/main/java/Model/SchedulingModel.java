/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Evandro
 */
public class SchedulingModel {
    private int id;
    private ClienteModel client;
    private ServicoModel service;
    private double value;
    private Date date;
    private String observation;

    public SchedulingModel(int id, ClienteModel client, ServicoModel service, double value, String date) throws ParseException {
        this.id = id;
        this.client = client;
        this.service = service;
        this.value = value;
        this.date = new SimpleDateFormat("dd-MM-yyyy").parse(date);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ClienteModel getClient() {
        return client;
    }

    public void setClient(ClienteModel client) {
        this.client = client;
    }

    public ServicoModel getService() {
        return service;
    }

    public void setService(ServicoModel service) {
        this.service = service;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }
    
    
    
}
