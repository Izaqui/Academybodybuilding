/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;


import Entidades.Administrador;
import Interfaces.IDaoAdministrador;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author kiel
 */
public class DaoAdmImpl implements IDaoAdministrador {
    
    private final File arquivo;
    
    Administrador administrador;
    public DaoAdmImpl(){
    
        arquivo = new File("Adm.bin");
        
        if (!arquivo.exists()) {
         
            try {
                arquivo.createNewFile();
            } catch (IOException ex) {
                System.out.println("Erro no arquivo");
            }
            
        }
        
    }

    @Override
    public boolean addAdministrador(Administrador adm) throws IOException, ClassNotFoundException{
           List<Administrador> listaAdministrador = null;        
           
           if (arquivo.length() > 0) {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(arquivo));

            listaAdministrador = (List<Administrador>) in.readObject();
        } else {
            listaAdministrador = new ArrayList<>();
        }
        
        for(Administrador a : listaAdministrador){
            if(a.getEmail().equals(adm.getEmail())){
                return false;
            }
        }
        
       
        if (listaAdministrador.add(adm)) {
            try (ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream(arquivo))) {
                out.writeObject(listaAdministrador);
            }
            
            return true;

        } else {
            return false;
        }
    }

    @Override
    public boolean removeAdministrador(String email) throws IOException, ClassNotFoundException {
        List<Administrador> listaAdm;        
        
        if (arquivo.length() > 0) {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(arquivo));

            listaAdm = (List<Administrador>) in.readObject();
        } else {
            return false;
        }
        
        
        for(int i=0; i<listaAdm.size(); i++){
        
            if(listaAdm.get(i).getEmail().equals(email)){
                listaAdm.remove(i); 
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(arquivo));
                out.writeObject(listaAdm);
                out.close();
                return true;
            }
            
        }
        return false;
    }

    @Override
    public boolean atualizarAdministrador(String email, Administrador adm) throws IOException, ClassNotFoundException {
        List<Administrador> listaAdm;        
        
        if (arquivo.length() > 0) {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(arquivo));

            listaAdm = (List<Administrador>) in.readObject();
        } else {
            listaAdm = new ArrayList<>();
        }
        
        for(Administrador a : listaAdm){
            if(a.getEmail().equals(email)){
                a.setEmail(adm.getEmail());
                a.setNome(adm.getNome());
                a.setSenha(adm.getSenha());
                return true;
            }
        }
        
        return false;
    }

    @Override
    public Administrador buscarAdministrador(String email) throws IOException, ClassNotFoundException {
     for(Administrador a : listarAdministrador()){
            if(a.getEmail().equals(email))
                return a;
        }
        return null;   
    }

    @Override
    public List<Administrador> listarAdministrador() throws IOException, ClassNotFoundException {
        if (arquivo.length() > 0) {
            ObjectInputStream in = new ObjectInputStream(
                    new FileInputStream(arquivo));

            return (List<Administrador>) in.readObject();
        } else {
            return new ArrayList<>();
        }
    }
}

