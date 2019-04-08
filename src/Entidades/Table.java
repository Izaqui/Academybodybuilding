/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author kiel
 */
public class Table extends AbstractTableModel{

    private List<Aluno> alunoLista = new ArrayList<>();
    private String [] colunas = {"Nome", "Sexo", "CPF","Endereço","Email","Telefone","Data de Nascimento","Data de Ingresso", "Status do pagamento"};

    @Override
    public String getColumnName(int colums) {
        return colunas[colums];
    }
    
    @Override
    public int getRowCount() {
        
        return alunoLista.size();
        
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna){
        
            case 0:
                return alunoLista.get(linha).getNome();
            case 1:
                return alunoLista.get(linha).getSexo();
            case 2:
                return alunoLista.get(linha).getCpf();
            case 3:
                return alunoLista.get(linha).getEndereco();
            case 4:
                return alunoLista.get(linha).getEmail();
            case 5:
                return alunoLista.get(linha).getTelefone();
            case 6:
                return alunoLista.get(linha).getNascimento();
            case 7:
                return alunoLista.get(linha).getIngresso();
            case 8:
                return alunoLista.get(linha).getStatus();
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int lin, int col) {
        
            return false;
        
    }
    
   public void addRow(Aluno a){
   
       this.alunoLista.add(a);
       this.fireTableDataChanged();
       
   } 
   
   public void addList(List<Aluno> lista){
   
       this.alunoLista = lista;
       this.fireTableDataChanged();
   }
    
}
