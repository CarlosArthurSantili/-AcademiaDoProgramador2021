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
public class Manutencao {
    private String titulo, descricao, equipamento, dataAbertura;

    public Manutencao() {
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
    
    public void gravarTxt(){
        try{
        FileWriter fw = new FileWriter("manutencao.txt");
        PrintWriter pw = new PrintWriter(fw);
        pw.println("Titulo: " + this.titulo);
        pw.println("Descricao: " + this.descricao);
        pw.println("Equipamento: " + this.equipamento);
        pw.println("DataAbertura: " + this.dataAbertura);
        pw.flush();
        pw.close();
        fw.close();
        }
        catch(IOException ex){
            Logger.getLogger(Equipamento.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }
}
