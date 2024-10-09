package com.mycompany.atividadeexecao;

public class TesteBanco {

        public static void main(String[] args) {

            try {

            ContaBancaria conta1 = new ContaBancaria("12345", 1000.0);

            conta1.depositar(500.0);
            System.out.println("Saldo após deposito: " + conta1.getSaldo());

            conta1.sacar(500.0);
            System.out.println("Saldo após o saque: " + conta1.getSaldo());
    } catch (SaldoInsuficienteException e){
            System.out.println("Erro ao depositar: " + e.getMessage());
    } catch (IllegalArgumentException e){
            System.out.println("Erro ao sacar: " + e.getMessage());
    } catch (ContaInvalidaException e) {
            System.out.println("Erro ao depositar: " + e.getMessage());
    } finally {
            System.out.println("Operação Finalizada");
        }
    }
}
