package Prin;

public class PessoaFisica extends Pessoa {

    protected String cpf;

    protected String sobrenome;

    public PessoaFisica(String nome, String sobrenome, int idade, String cpf) {
        super();
        this.sobrenome=sobrenome;
        this.cpf=cpf;
    }

    public PessoaFisica(String nome) {
        super(nome);
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf=cpf;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome=sobrenome;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "cpf='" + cpf + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                '}';
    }
}

