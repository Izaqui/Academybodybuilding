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
import java.time.LocalDate;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        
        for(Aluno a : listaAluno){
            if(a.getCpf().equals(cpf)){
                a.setEmail(aluno.getEmail());
                a.setEndereco(aluno.getEmail());
                a.setIngresso(aluno.getIngresso());
                a.setNascimento(aluno.getNascimento());
                a.setNome(aluno.getNome());
                a.setSexo(aluno.getSexo());
                a.setStatus(aluno.getStatus());
                a.setTelefone(aluno.getTelefone());
                a.setTipoPagamento(aluno.getTipoPagamento());
                return true;
            }
        }
        
//        for(int i=0; i<listaAluno.size();i++){
//        
//            if(listaUser.get(i).getId() == id){
//            
//                listaUser.get(i).setEmail(u.getEmail());
//                listaUser.get(i).setNome(u.getNome());
//                listaUser.get(i).setNascimento(u.getNascimento());
//                listaUser.get(i).setSexo(u.getSexo());
//                listaUser.get(i).setSenha(u.getSenha());
//                
//                ObjectOutputStream out = new ObjectOutputStream(
//                    new FileOutputStream(arquivo));
//                out.writeObject(listaUser);
//                out.close();
//            
//                return true;
//                
//            }
//        
//        }
        return false;
    }

    @Override
    public Aluno buscarAlunoCpf(String cpf) throws IOException, ClassNotFoundException{
        Iterable<Aluno> listaAluno = null;
         for(Aluno a : listaAluno){
            if(a.getCpf().equals(cpf)){
                return (Aluno) listaAluno;
            }}
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
