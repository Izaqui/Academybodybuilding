/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;


import Entidades.Administrador;
import Entidades.Aluno;
import Interfaces.IDaoAdministrador;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public boolean addAdministrador(Administrador adm) {
           List<Administrador> listaAdministrador = null;        
        
        if (arquivo.length() > 0) {
            ObjectInputStream in = null;
               try {
                   in = new ObjectInputStream(
                           new FileInputStream(arquivo));
               } catch (IOException ex) {
                   Logger.getLogger(DaoAdmImpl.class.getName()).log(Level.SEVERE, null, ex);
               }

               try {
                   listaAdministrador = (List<Administrador>) in.readObject();
               } catch (IOException ex) {
                   Logger.getLogger(DaoAdmImpl.class.getName()).log(Level.SEVERE, null, ex);
               } catch (ClassNotFoundException ex) {
                   Logger.getLogger(DaoAdmImpl.class.getName()).log(Level.SEVERE, null, ex);
               }
        } else {
            listaAdministrador = new ArrayList<>();
        }
        
        for(Administrador a : listaAdministrador){
            if(a.getEmail().equals(administrador.getEmail())){
                return false;
            }
        }
        
       
        if (listaAdministrador.add(administrador)) {
            try (ObjectOutputStream out = new ObjectOutputStream(
                    new FileOutputStream(arquivo))) {
                out.writeObject(listaAdministrador);
            }  catch (IOException ex) {
                   Logger.getLogger(DaoAdmImpl.class.getName()).log(Level.SEVERE, null, ex);
               }
            
            return true;

        } else {
            return false;
        }
    }
/*        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    @Override
    public boolean removeAdministrador(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean atualizarAdministrador(String cpf, Aluno aluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
**/
    @Override
    public boolean buscarAdministrador(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean listarAdministrador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAdministrador(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean atualizarAdministrador(String cpf, Aluno aluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    }
/*
    @Override
    public boolean removeAdministrador(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean atualizarAdministrador(String cpf, Aluno aluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean buscarAdministrador(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean listarAdministrador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}*/
