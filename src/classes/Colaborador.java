/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author 1_DEV
 */
public class Colaborador {
    
    private int id_empresa;
    
    private int id_colab;
    
    
    
    private String nome;
    
    private String cpf;
    
    private int id_cargo;
    
    private int id_setor;
    
    private double salLiquido;
    
    
    
    private int horaExtraQtd;
    
    private double horaExtraValor;
    
    private int horaExtraFdQtd;
    
    private double horaExtraFdValor;
    
    private double salFamiiaValor;
    
    private double vencTotal;
    
    private double fgtsValor;
    
    
    
    private double inssValor;
    
    private double vtValor;
    
    private double irrfValor;
    
    private int faltasQtd;
    
    private double faltasValor;
    
    private double descTotal;
    
    
    private String nomeDep;
    
    private String cpfDep;
    
    private String dataNasc;

    public int getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(int id_empresa) {
        this.id_empresa = id_empresa;
    }

    public int getId_colab() {
        return id_colab;
    }

    public void setId_colab(int id_colab) {
        this.id_colab = id_colab;
    }
    
    
    
    
    
    
    public int getId_cargo() {
        return id_cargo;
    }

    public void setId_cargo(int id_cargo) {
        this.id_cargo = id_cargo;
    }

    public int getId_setor() {
        return id_setor;
    }

    public void setId_setor(int id_setor) {
        this.id_setor = id_setor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalLiquido() {
        return salLiquido;
    }

    public void setSalLiquido(double salLiquido) {
        this.salLiquido = salLiquido;
    }
    
    
    
    
    
    
    
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

    public int getHoraExtraFdQtd() {
        return horaExtraFdQtd;
    }

    public void setHoraExtraFdQtd(int horaExtraFdQtd) {
        this.horaExtraFdQtd = horaExtraFdQtd;
    }

    public double getHoraExtraFdValor() {
        return horaExtraFdValor;
    }

    public void setHoraExtraFdValor(double horaExtraFdValor) {
        this.horaExtraFdValor = horaExtraFdValor;
    }

    public double getSalFamiiaValor() {
        return salFamiiaValor;
    }

    public void setSalFamiiaValor(double salFamiiaValor) {
        this.salFamiiaValor = salFamiiaValor;
    }

    public double getVencTotal() {
        return vencTotal;
    }

    public void setVencTotal(double vencTotal) {
        this.vencTotal = vencTotal;
    }

    public double getFgtsValor() {
        return fgtsValor;
    }

    public void setFgtsValor(double fgtsValor) {
        this.fgtsValor = fgtsValor;
    }
    
    
    
    
    

    public double getInssValor() {
        return inssValor;
    }

    public void setInssValor(double inssValor) {
        this.inssValor = inssValor;
    }

    public double getVtValor() {
        return vtValor;
    }

    public void setVtValor(double vtValor) {
        this.vtValor = vtValor;
    }

    public double getIrrfValor() {
        return irrfValor;
    }

    public void setIrrfValor(double irrfValor) {
        this.irrfValor = irrfValor;
    }

    public int getFaltasQtd() {
        return faltasQtd;
    }

    public void setFaltasQtd(int faltasQtd) {
        this.faltasQtd = faltasQtd;
    }

    public double getFaltasValor() {
        return faltasValor;
    }

    public void setFaltasValor(double faltasValor) {
        this.faltasValor = faltasValor;
    }

    public double getDescTotal() {
        return descTotal;
    }

    public void setDescTotal(double descTotal) {
        this.descTotal = descTotal;
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

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    
    

    public Colaborador(String nome, String cpf, int id_cargo, int id_setor, double salLiquido) {
        this.nome = nome;
        this.cpf = cpf;
        this.id_cargo = id_cargo;
        this.id_setor = id_setor;
        this.salLiquido = salLiquido;
    }

    public Colaborador(int id_empresa, String nome, String cpf, int id_cargo, int id_setor, double salLiquido, int horaExtraQtd, double horaExtraValor, int horaExtraFdQtd, double horaExtraFdValor, double salFamiiaValor, double vencTotal, double fgtsValor, double inssValor, double vtValor, double irrfValor, int faltasQtd, double faltasValor, double descTotal) {
        this.id_empresa = id_empresa;
        this.nome = nome;
        this.cpf = cpf;
        this.id_cargo = id_cargo;
        this.id_setor = id_setor;
        this.salLiquido = salLiquido;
        this.horaExtraQtd = horaExtraQtd;
        this.horaExtraValor = horaExtraValor;
        this.horaExtraFdQtd = horaExtraFdQtd;
        this.horaExtraFdValor = horaExtraFdValor;
        this.salFamiiaValor = salFamiiaValor;
        this.vencTotal = vencTotal;
        this.fgtsValor = fgtsValor;
        this.inssValor = inssValor;
        this.vtValor = vtValor;
        this.irrfValor = irrfValor;
        this.faltasQtd = faltasQtd;
        this.faltasValor = faltasValor;
        this.descTotal = descTotal;
    }

    public Colaborador() {
    }
    
    
    
    
    @Override
    public String toString() {
        return "Colaborador{" + "id_empresa=" + id_empresa + ", nome=" + nome + ", cpf=" + cpf + ", id_cargo=" + id_cargo + ", id_setor=" + id_setor + ", salLiquido=" + salLiquido + ", horaExtraQtd=" + horaExtraQtd + ", horaExtraValor=" + horaExtraValor + ", horaExtraFdQtd=" + horaExtraFdQtd + ", horaExtraFdValor=" + horaExtraFdValor + ", salFamiiaValor=" + salFamiiaValor + ", vencTotal=" + vencTotal + ", fgtsValor=" + fgtsValor + ", inssValor=" + inssValor + ", vtValor=" + vtValor + ", irrfValor=" + irrfValor + ", faltasQtd=" + faltasQtd + ", faltasValor=" + faltasValor + ", descTotal=" + descTotal + '}';
    }

    
    
    
     
    

    

    
    

    
    
    
    
}
