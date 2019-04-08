/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Aluno;
import Interfaces.IDaoAluno;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class DaoAlunoImpl implements IDaoAluno {

    private final File arquivo;
    public DaoAlunoImpl(){
    
        arquivo = new File("Aluno.bin");
        
        if (!arquivo.exists()) {
         
            try {
                arquivo.createNewFile();
            } catch (IOException ex) {
                System.out.println("Erro no arquivo");
            }
            
        }
        
    }
    
    @Override
    public boolean addAluno(Aluno aluno) throws IOException, ClassNotFoundException{
        
        List<Aluno> listaAluno;        
        
        if (arquivo.length() > 0) {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(arquivo));

            listaAluno = (List<Aluno>) in.readObject();
        } else {
            listaAluno = new ArrayList<>();
        }
        
        for(Aluno a : listaAluno){
            if(a.getCpf().equals(aluno.getCpf())){
                return false;
            }
        }
        
       
        if (listaAluno.add(aluno)) {
            try (ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream(arquivo))) {
                out.writeObject(listaAluno);
            }
            
            return true;

        } else {
            return false;
        }
    }

    @Override
    public boolean RemoveAluno(String cpf) throws IOException, ClassNotFoundException{
        
        List<Aluno> listaAluno;        
        
        if (arquivo.length() > 0) {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(arquivo));

            listaAluno = (List<Aluno>) in.readObject();
        } else {
            return false;
        }
        
        
        for(int i=0; i<listaAluno.size(); i++){
        
            if(listaAluno.get(i).getCpf().equals(cpf)){
                listaAluno.remove(i); 
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivo));
                out.writeObject(listaAluno);
                out.close();
                return true;
            }
            
        }
        return false;
    }

    @Override
    public boolean atualizarAluno(String cpf, Aluno aluno) throws IOException, ClassNotFoundException{
        List<Aluno> listaAluno;        
        
        if (arquivo.length() > 0) {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(arquivo));

            listaAluno = (List<Aluno>) in.readObject();
        } else {
            listaAluno = new ArrayList<>();
        }
        
        for(int i=0; i<listaAluno.size(); i++){
            if(listaAluno.get(i).getCpf().equals(cpf)){
                listaAluno.get(i).setEmail(aluno.getEmail());
                listaAluno.get(i).setEndereco(aluno.getEndereco());
                listaAluno.get(i).setIngresso(aluno.getIngresso());
                listaAluno.get(i).setNascimento(aluno.getNascimento());
                listaAluno.get(i).setNome(aluno.getNome());
                listaAluno.get(i).setSexo(aluno.getSexo());
                listaAluno.get(i).setStatus(aluno.getStatus());
                listaAluno.get(i).setTelefone(aluno.getTelefone());
                listaAluno.get(i).setTipoPagamento(aluno.getTipoPagamento());
                
                ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream(arquivo));
                out.writeObject(listaAluno);
                out.close();
                return true;
            }
        }
        
        return false;
    }

    @Override
    public Aluno buscarAlunoCpf(String cpf) throws IOException, ClassNotFoundException{
        for(Aluno a : listarAluno()){
            if(a.getCpf().equals(cpf))
                return a;
        }
        return null;
    }

    @Override
    public List<Aluno> listarAluno() throws IOException, ClassNotFoundException{
        if (arquivo.length() > 0) {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(arquivo));

            return (List<Aluno>) in.readObject();
        } else {
            return new ArrayList<>();
        }
    }
    
}
