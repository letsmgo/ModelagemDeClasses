package br.com.zup.ModelagemDeClasses;

public class Main {
    public static void main(String[] args) {
        //Instanciando  o fornecedor
        Fornecedor fornecedor1 = new Fornecedor("Valecard", "Avenida Jacarandá 200", "3432323232", 10000, 5000);
        //Instanciando o colaborador
        Colaborador colaborador1 = new Colaborador("Let Marçal", "Genarino Cazabona 309", "349999999", 12, 12000, 1550);
        //Instanciando o administrador
        Administrador adm1 = new Administrador("André","Logo ali 300","348888888",11,50000,5000,3000);

        //Testando funcionalidades da classe Fornecedor
        System.out.println("NOME DO FORNECEDOR: " + fornecedor1.getNome());
        System.out.println("TELEFONE: " + fornecedor1.getTelefone());
        System.out.println("ENDEREÇO: " + fornecedor1.getEndereco());
        System.out.println("VALOR DO CRÉDITO: R$" + fornecedor1.getValorCredito());
        System.out.println("VALOR DA DÍVIDA: R$" + fornecedor1.getValorDivida());

        //Testando método obter saldo da classe fornecedor
        System.out.println("VALOR SALDO RESIDUAL: R$" + fornecedor1.obterSaldo() + "\n");

        //Testando a classe Colaborador
        System.out.println("NOME DO COLABORADOR: " + colaborador1.getNome());
        System.out.println("TELEFONE DO COLABORADOR: " + colaborador1.getTelefone());
        System.out.println("CÓDIGO DO SETOR DO COLABORADOR: " + colaborador1.getCodigoSetor());
        System.out.println("SALÁRIO BASE DO COLABORADOR: R$" + colaborador1.getSalarioBase());
        System.out.println("VALOR IMPOSTO DO COLABORADOR: R$" + colaborador1.getImposto() + "\n");

        //Testando o método calcular salário
        System.out.println("SALÁRIO LÍQUIDO DO COLABORADOR É: R$" + colaborador1.calcularSalario() + "\n");

        //Testando funcionalidades da classe Administrador
        System.out.println("NOME DO ADMINISTRADOR: " + adm1.getNome());
        System.out.println("TELEFONE DO ADM: " + adm1.getTelefone());
        System.out.println("CODIGO DO SETOR DO ADM: " + adm1.getCodigoSetor());
        System.out.println("SALÁRIO DO ADM: R$" + adm1.getSalarioBase());
        System.out.println("VALOR DO IMPOSTO DO ADM: R$" + adm1.getImposto());
        System.out.println("VALOR DA AJUDA DE CUSTO DO ADM: R$" + adm1.getAjudaDeCusto());

        //Testando funcionalidade do método calcular salário para ADM
        System.out.println("SALARIO LIQUIDO DO ADM: R$" + adm1.calcularSalario() + "\n");


    }
}
