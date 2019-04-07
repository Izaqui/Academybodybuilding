package Principal;

import Dao.DaoAlunoImpl;
import Entidades.Aluno;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import tipoSexo.Sexo;

public class App {
    
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Aluno aluno = new Aluno("Jose", Sexo.MASCULINO, "01234567895", "Rua da Bosta", "zenoia@gmail.com", 
                "(88)99636-9852", LocalDate.now(), LocalDate.now(), "Dinheiro", "Pago");
//        Aluno aluno2 = new Aluno("Matheus", Sexo.MASCULINO, "01234567896", "Rua da Bosta", "zenoia@gmail.com", 
//                "(88)99636-9852", LocalDate.now(), LocalDate.now(), "Dinheiro", "Pago");
//        Aluno aluno3 = new Aluno("Laurilene", Sexo.MASCULINO, "01234567896", "Rua da Bosta", "zenoia@gmail.com", 
//                "(88)99636-9852", LocalDate.now(), LocalDate.now(), "Dinheiro", "Pago");
        DaoAlunoImpl dao = new DaoAlunoImpl();
//        if(dao.addAluno(aluno)) System.out.println("Cadastrado");
//        else System.out.println("Não cadastrado");
            
//        dao.addAluno(aluno3);

        List<Aluno> lista = dao.listarAluno();
        System.out.println(lista.toString());
    }

}

