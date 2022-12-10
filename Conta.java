package Prin;
public class Conta {

	protected String numero;
	protected Pessoa cliente;
	protected double saldo;


	public Conta() {
		int n = (int) (Math.random() * 10000 + 1);
		String numConta = "c" + n;
		this.numero = numConta;
	}

	public Conta(Pessoa cliente) {
		this();
		this.cliente = cliente;
	}

	public Conta(Pessoa cliente, double saldo) {
		this(cliente);
		this.saldo = saldo;
	}

	private String mostra() {
		String saida = "----------------------";
		saida += "\nCliente: " + this.cliente.getNome();
		saida += "\nNumero: " + this.numero;
		saida = saida + "\nSaldo :" + this.saldo;
		saida += "\n---------------------";
		return saida;
	}

	@Override
	public String toString() {
				return "\n" + cliente;
	}

	public void creditar(double valor) {
		if (valor >= 0) {
			this.saldo += valor;
		}
	}

	public void debitar(double valor) {
		if (valor <= this.saldo) {
			this.saldo = this.saldo - valor;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public Pessoa getCliente() {
		return this.cliente;
	}

	public void setCliente(String nome, int idade) {
		Pessoa cliente = new Pessoa(nome, idade);
		this.cliente = cliente;
	}

	public PessoaFisica getClienteFisico() {
		return (PessoaFisica) this.cliente;
	}

	public void setCliente(String sobrenome, String cpf) {
		PessoaFisica cliente = new PessoaFisica(sobrenome, cpf, 30, "123.456.789-10");
		this.cliente = cliente;
	}


	public PessoaJuridica getClienteJuridico() {
		return (PessoaJuridica) this.cliente;
	}

	public void setClienteJuridico(String cnpj, String razaoSocial) {
		PessoaJuridica cliente = new PessoaJuridica(cnpj, razaoSocial);
		this.cliente = cliente;
	}

}



