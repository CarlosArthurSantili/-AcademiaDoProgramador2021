/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AcademiaProgramador_CarlosArthurSantili;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class Equipamento {

    private String nome, dataFabricacao, fabricante;
    private double preco;
    private int numeroSerie;
    
    public Equipamento() {
    }
    
    public Equipamento(String nome, double preco, int numeroSerie, String dataFabricacao, String fabricante){
        this.nome = nome;
        this.preco = preco;
        this.numeroSerie = numeroSerie;
        this.dataFabricacao = dataFabricacao;
        this.fabricante = fabricante;
    }
    
    public void imprimirDados(){
            System.out.println("Nome: " + this.nome);
            System.out.println("Preco: " + this.preco);
            System.out.println("Numero Serie: " + this.numeroSerie);
            System.out.println("Data Fabricacao: " + this.dataFabricacao);
            System.out.println("Fabricante: " + this.fabricante);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void gravarTxt(){
        try{
        FileWriter fw = new FileWriter("equipamento.txt");
        PrintWriter pw = new PrintWriter(fw);
        pw.println("Nome: " + this.nome);
        pw.println("Preco: " + this.preco);
        pw.println("NumeroSerie: " + this.numeroSerie);
        pw.println("DataFabricacao: " + this.dataFabricacao);
        pw.println("Fabricante: " + this.fabricante);
        pw.flush();
        pw.close();
        fw.close();
        }
        catch(IOException ex){
            Logger.getLogger(Equipamento.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }
    
}
