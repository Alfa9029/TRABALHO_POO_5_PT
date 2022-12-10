package Q3;

public class PessoaJuridicaQ3 extends PessoaQ3{
    protected String cnpj;
    protected String razaoSocial;

    public String getCnpj(){
        return cnpj;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public String getRazaoSocial(){
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial){
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String toString() {
        return "PessoaJuridicaQ3{" +
                "cnpj='" + cnpj + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                '}';
    }
}
