package model;

public class Funcionario {
    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(String nome, double salario, String cargo) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;

        if (this.salario < 600)
            this.salario = 600;
    }

    public void setSalario(int salario) {
        if (salario < 600)
            salario = 600;
        
        this.salario = salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNome() {
        return this.nome;
    }
    public double getSalario() {
        return this.salario;
    }
    public String getCargo() {
        return this.cargo;
    }
}