/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author 1_DEV
 */
public class Dependente {
    
    private int id_colaborador;
    
    private int id_dep;
    
    
    
    private String nomeDep;
    
    private String dataNasc;
    
    private String cpfDep;
    
    

    public Dependente(String nomeDep, String cpfDep,  String dataNasc, int id_colaborador) {
        this.nomeDep = nomeDep;
        this.cpfDep = cpfDep;
         this.dataNasc = dataNasc;
        this.id_colaborador = id_colaborador;
    }
    
    
    
    
    public Dependente() {
    }
    
    
    
    public int getId_colaborador() {
        return id_colaborador;
    }

    public void setId_colaborador(int id_colaborador) {
        this.id_colaborador = id_colaborador;
    }

    public int getId_dep() {
        return id_dep;
    }

    public void setId_dep(int id_dep) {
        this.id_dep = id_dep;
    }
    
    
    
    
    
    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getNomeDep() {
        return nomeDep;
    }

    public void setNomeDep(String nomeDep) {
        this.nomeDep = nomeDep;
    }

    public String getCpfDep() {
        return cpfDep;
    }

    public void setCpfDep(String cpfDep) {
        this.cpfDep = cpfDep;
    }

    @Override
    public String toString() {
        return "Dependente{" + "id_colaborador=" + id_colaborador + ", id_dep=" + id_dep + ", nomeDep=" + nomeDep + ", dataNasc=" + dataNasc + ", cpfDep=" + cpfDep + '}';
    }

    

    
    
    
    

    

    
    
    
    
}
