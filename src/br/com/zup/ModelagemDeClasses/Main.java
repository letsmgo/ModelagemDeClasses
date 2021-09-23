package br.com.zup.ModelagemDeClasses;

public class Main {
    public static void main(String[] args) {
        //Instanciando  o fornecedor
        Fornecedor fornecedor1 = new Fornecedor("Valecard","Avenida Jacarandá 200","3432323232",10000,5000);


        //Testando funcionalidades
        System.out.println("NOME DO FORNECEDOR: " + fornecedor1.getNome());
        System.out.println("TELEFONE: " + fornecedor1.getTelefone());
        System.out.println("ENDEREÇO: " + fornecedor1.getEndereco());
        System.out.println("VALOR DO CRÉDITO: R$" + fornecedor1.getValorCredito());
        System.out.println("VALOR DA DÍVIDA: R$" + fornecedor1.getValorDivida());

        //Testando método obter saldo
        System.out.println("VALOR SALDO RESIDUAL: R$" + fornecedor1.obterSaldo());
    }
}
