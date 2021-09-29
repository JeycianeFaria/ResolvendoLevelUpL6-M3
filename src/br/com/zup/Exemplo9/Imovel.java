package br.com.zup.Exemplo9;

import java.util.ArrayList;
import java.util.List;

public class Imovel {
    private String endereco;
    private double valorDoAluguel;
    private Funcionario funcionarioResponsavel;
    private List<Morador> moradores = new ArrayList<>();

    public Imovel(String endereco, double valorDoAluguel) {
        this.endereco = endereco;
        this.valorDoAluguel = valorDoAluguel;
    }

    public Imovel(String endereco, double valorDoAluguel, Funcionario funcionarioResponsavel) {
        this.endereco = endereco;
        this.valorDoAluguel = valorDoAluguel;
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getValorDoAluguel() {
        return valorDoAluguel;
    }

    public void setValorDoAluguel(double valorDoAluguel) {
        this.valorDoAluguel = valorDoAluguel;
    }

    public Funcionario getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }

    public void setFuncionarioResponsavel(Funcionario funcionarioResponsavel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public List<Morador> getMoradores() {
        return moradores;
    }

    public void adicionarMorador(Morador novoMorador){
        moradores.add(novoMorador);
    }


    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n======Imóvel======");
        retorno.append("\nEndereço: " +endereco);
        retorno.append("\nValor do Aluguel: R$" +valorDoAluguel);
        retorno.append("\nFuncionário responsável: " +funcionarioResponsavel.getNome());
        retorno.append("\nQuantidade de moradores: " +moradores.size());
        retorno.append("\nLista de moradores: " +moradores);
        return retorno.toString();
    }
}
