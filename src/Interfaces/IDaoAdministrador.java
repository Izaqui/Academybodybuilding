/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Entidades.Administrador;
import Entidades.Aluno;

/**
 *
 * @author kiel
 */
public interface IDaoAdministrador {
    public boolean addAdministrador(Administrador adm);
    public boolean removeAdministrador(String email);
    public boolean atualizarAdministrador(String cpf, Aluno aluno);
    public boolean buscarAdministrador(String email);
    public boolean listarAdministrador();
    
}
