/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package View;
import Model.ClienteModel;
import Model.PessoaModel;
import Model.SchedulingModel;
import Model.ServicoModel;

/**
 *
 * @author Evandro
 */
public class Main {

    public static void main(String[] args){
    
        ClienteModel cl = new ClienteModel(22, "Evandro", "Rua j G de Araújo", "97043190");
        System.out.println(cl.getName());
        
        ServicoModel service = new ServicoModel(1, "Corte de barba", 20);
        
        SchedulingModel sc = new SchedulingModel();
        sc.setClient(cl);
        sc.setService(service);
        
        System.out.println(sc.getClient().getName());
        
    }
}
