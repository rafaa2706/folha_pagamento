
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;


/**
 *
 * @author 1_DEV
 */

public class Desconto {
    
    private double valorINSS;
    
    private double valorVT;
    
    private double valorIRRF;
    
    private int qtdFaltas;
    
    private double valorFaltas;
    
    private double descTotal;
    
    private int id_colaborador;
    

    public double getValorINSS() {
        return valorINSS;
    }

    public void setValorINSS(double valorINSS) {
        this.valorINSS = valorINSS;
    }

    public double getValorVT() {
        return valorVT;
    }

    public void setValorVT(double valorVT) {
        this.valorVT = valorVT;
    }

    public double getValorIRRF() {
        return valorIRRF;
    }

    public void setValorIRRF(double valorIRRF) {
        this.valorIRRF = valorIRRF;
    }

    public int getQtdFaltas() {
        return qtdFaltas;
    }

    public void setQtdFaltas(int qtdFaltas) {
        this.qtdFaltas = qtdFaltas;
    }

    public double getValorFaltas() {
        return valorFaltas;
    }

    public void setValorFaltas(double valorFaltas) {
        this.valorFaltas = valorFaltas;
    }

    public int getId_colaborador() {
        return id_colaborador;
    }

    public void setId_colaborador(int id_colaborador) {
        this.id_colaborador = id_colaborador;
    }

    public double getDescTotal() {
        return descTotal;
    }

    public void setDescTotal(double descTotal) {
        this.descTotal = descTotal;
    }

    public Desconto(double valorINSS, double valorVT, double valorIRRF, int qtdFaltas, double valorFaltas, double descTotal, int id_colaborador) {
        this.valorINSS = valorINSS;
        this.valorVT = valorVT;
        this.valorIRRF = valorIRRF;
        this.qtdFaltas = qtdFaltas;
        this.valorFaltas = valorFaltas;
        this.descTotal = descTotal;
        this.id_colaborador = id_colaborador;
    }
    
    
    
    
    

    
}
