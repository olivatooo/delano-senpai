/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delano;

/**
 *
 * @author Olivato
 */
public class Conta {
    private double saldo;
    
    Conta(double saldo)
    {
        this.saldo = saldo;
    }
    double getSaldo()
    {
        return this.saldo;
    }
    void deposito(double valor)
    {
        this.saldo+=valor;
    }
    void saque(double valor)
    {
        if((this.saldo-valor)>=0)
            this.saldo-=valor;
    }
    
}
