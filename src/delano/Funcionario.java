/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package delano;

/**
 *
 * @author 743537
 */
public class Funcionario {
    private int id;
    private String nome;
    private double cargaHoraria;
    private double salarioPorHora;

    public Funcionario(int id, String nome, double cargaHoraria, double salarioPorHora) {
        this.id = id;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.salarioPorHora = salarioPorHora;
    }
    public double getSalario()
    {
        return this.cargaHoraria*this.salarioPorHora;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "id=" + id + ", nome=" + nome + ", cargaHoraria=" + cargaHoraria + ", salarioPorHora=" + salarioPorHora + '}';
    }
    
    
    
}
