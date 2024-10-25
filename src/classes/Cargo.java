/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author 1_DEV
 */
public class Cargo {
    
    private String cargo;
    
    private int idCargo;
    
    private String salBruto;
    
    private String horaNormal;
    
    private int idSetor;

    public int getIdSetor() {
        return idSetor;
    }

    public void setIdSetor(int idSetor) {
        this.idSetor = idSetor;
    }
    
    
    

    public String getHoraNormal() {
        return horaNormal;
    }

    public void setHoraNormal(String horaNormal) {
        this.horaNormal = horaNormal;
    }

    
    public String getSalBruto() {
        return salBruto;
    }

    public void setSalBruto(String salBruto) {
        this.salBruto = salBruto;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }
    
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public Cargo() {
    }

    public Cargo(String cargo) {
        this.cargo = cargo;
    }

    public Cargo(String cargo, String salBruto, String horaNormal, int idSetor) {
        this.cargo = cargo;
        this.salBruto = salBruto;
        this.horaNormal = horaNormal;
        this.idSetor = idSetor;
    }

    
    
    
}
