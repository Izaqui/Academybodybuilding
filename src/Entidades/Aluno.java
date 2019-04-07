package Entidades;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Aluno implements Serializable{

    private String nome;
    private Enum sexo;
    private String cpf;
    private String endereco;
    private String email;
    private String telefone;
    private LocalDate nascimento;
    private LocalDate ingresso;
    private String tipoPagamento;
    private String status;

    public Aluno() {
    }

    public Aluno(String nome, Enum sexo, String cpf, String endereco, String email, String telefone, LocalDate nascimento, LocalDate ingresso, String tipoPagamento, String status) {
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.nascimento = nascimento;
        this.ingresso = ingresso;
        this.tipoPagamento = tipoPagamento;
        this.status = status;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Enum getSexo() {
        return sexo;
    }

    public void setSexo(Enum sexo) {
        this.sexo = sexo;
    }

    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public LocalDate getIngresso() {
        return ingresso;
    }

    public void setIngresso(LocalDate ingresso) {
        this.ingresso = ingresso;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(String tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.nome);
        hash = 79 * hash + Objects.hashCode(this.sexo);
        hash = 79 * hash + Objects.hashCode(this.cpf);
        hash = 79 * hash + Objects.hashCode(this.endereco);
        hash = 79 * hash + Objects.hashCode(this.email);
        hash = 79 * hash + Objects.hashCode(this.telefone);
        hash = 79 * hash + Objects.hashCode(this.nascimento);
        hash = 79 * hash + Objects.hashCode(this.ingresso);
        hash = 79 * hash + Objects.hashCode(this.tipoPagamento);
        hash = 79 * hash + Objects.hashCode(this.status);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.tipoPagamento, other.tipoPagamento)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (this.sexo != other.sexo) {
            return false;
        }
        if (!Objects.equals(this.nascimento, other.nascimento)) {
            return false;
        }
        if (!Objects.equals(this.ingresso, other.ingresso)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", sexo=" + sexo + ", cpf=" + cpf + 
                ", endereco=" + endereco + ", email=" + email + ", telefone=" + 
                telefone + ", nascimento=" + nascimento + ", ingresso=" + ingresso + 
                ", tipoPagamento=" + tipoPagamento + ", status=" + status + '}'+"\n";
    }

    
    /**
     *
     * @param nome
     * @param sexo
     * @param cpf
     * @param endereco
     * @param email
     * @param telefone
     * @param nascimento
     *
     * construtor de pessoa
     */
    
    
    
}
