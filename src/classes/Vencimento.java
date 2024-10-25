/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author 1_DEV
 */
public class Vencimento {
    
    private int horaExtraQtd;
    
    private double horaExtraValor;
    
    private int horaExtraFDQtd;
    
    private double horaExtraFDValor;
    
    private double salarioFamilia;
    
    private double vencTotal;
    
    private double valorFGTS;
    
    private int id_colaborador;
    

    public int getHoraExtraQtd() {
        return horaExtraQtd;
    }

    public void setHoraExtraQtd(int horaExtraQtd) {
        this.horaExtraQtd = horaExtraQtd;
    }

    public double getHoraExtraValor() {
        return horaExtraValor;
    }

    public void setHoraExtraValor(double horaExtraValor) {
        this.horaExtraValor = horaExtraValor;
    }

    public int getHoraExtraFDQtd() {
        return horaExtraFDQtd;
    }

    public void setHoraExtraFDQtd(int horaExtraFDQtd) {
        this.horaExtraFDQtd = horaExtraFDQtd;
    }

    public double getHoraExtraFDValor() {
        return horaExtraFDValor;
    }

    public void setHoraExtraFDValor(double horaExtraFDValor) {
        this.horaExtraFDValor = horaExtraFDValor;
    }

    public double getSalarioFamilia() {
        return salarioFamilia;
    }

    public void setSalarioFamilia(double salarioFamilia) {
        this.salarioFamilia = salarioFamilia;
    }

    public double getVencTotal() {
        return vencTotal;
    }

    public void setVencTotal(double vencTotal) {
        this.vencTotal = vencTotal;
    }

    public double getValorFGTS() {
        return valorFGTS;
    }

    public void setValorFGTS(double valorFGTS) {
        this.valorFGTS = valorFGTS;
    }
    

    public int getId_colaborador() {
        return id_colaborador;
    }

    public void setId_colaborador(int id_colaborador) {
        this.id_colaborador = id_colaborador;
    }

    public Vencimento(int horaExtraQtd, double horaExtraValor, int horaExtraFDQtd, double horaExtraFDValor, double salarioFamilia, double vencTotal, double valorFGTS, int id_colaborador) {
        this.horaExtraQtd = horaExtraQtd;
        this.horaExtraValor = horaExtraValor;
        this.horaExtraFDQtd = horaExtraFDQtd;
        this.horaExtraFDValor = horaExtraFDValor;
        this.salarioFamilia = salarioFamilia;
        this.vencTotal = vencTotal;
        this.valorFGTS = valorFGTS;
        this.id_colaborador = id_colaborador;
    }

    

    
    
    
    

    
    
    
}
