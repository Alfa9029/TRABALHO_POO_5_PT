package Q3;

public class PessoaFisicaQ3 extends PessoaQ3{
    protected String cpf;
    protected String sobrenome;

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
        return "PessoaFisicaQ3{" +
                "cpf='" + cpf + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                '}';
    }
}
