/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entidades.Administrador;
import Entidades.Aluno;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author kiel
 */
public interface IDaoAdministrador {
    public boolean addAdministrador(Administrador adm)throws IOException, ClassNotFoundException;
    public boolean removeAdministrador(String email)throws IOException, ClassNotFoundException;
    public boolean atualizarAdministrador(String email, Administrador adm)throws IOException, ClassNotFoundException;
    public Administrador buscarAdministrador(String email)throws IOException, ClassNotFoundException;
    public List<Administrador> listarAdministrador()throws IOException, ClassNotFoundException;
    
}
