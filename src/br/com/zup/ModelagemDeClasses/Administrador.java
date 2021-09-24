package br.com.zup.ModelagemDeClasses;

public class Administrador extends Colaborador{
    //Atributos
    private double ajudaDeCusto;

    //Método construtor
    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    //Getters and Setters
    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public  double calcularSalario(){
        double salarioLiquido = ajudaDeCusto + (getSalarioBase() - getImposto());
        return salarioLiquido;
    }


}
