package com.mycompany.atividadeexecao;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;


    public ContaBancaria(String numeroConta, double saldoInicial) throws
            ContaInvalidaException {

        if (numeroConta == null || numeroConta.isEmpty()){
            throw new ContaInvalidaException("Numero da conta Invalido.");
        }
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor >= 0){
            saldo += valor;
        }else{
            throw new IllegalArgumentException("Valor invalido.");
        }
    }

    public void sacar(double valor) throws SaldoInsuficienteException{
        if (saldo < valor){
            throw new SaldoInsuficienteException("Saldo insuficiente.");
        }else if (valor <= 0){

            //System.out.println("Valor invalido.");
            throw new IllegalArgumentException("Valor do saque invalido.");
        }else saldo -= valor;
    }
}