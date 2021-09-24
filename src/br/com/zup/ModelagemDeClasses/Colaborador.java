package br.com.zup.ModelagemDeClasses;

/*
Considere, como outra subclasse da classe Pessoa, a classe Colaborador. Considere que cada instância da classe
Colaborador tem, para além dos atributos que caracterizam a classe Pessoa, os atributos codigoSetor (inteiro),
salarioBase (double) e imposto (double).
 */
public class Colaborador extends Pessoa {
    //Atributos
    private int codigoSetor;
    private double salarioBase;
    private double imposto;

    //Método construtor
    public Colaborador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    //Getters and Setters

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    //Método calcular salario
    public double calcularSalario() {
        double salarioLiquido = salarioBase - imposto;
        return salarioLiquido;
    }
}
