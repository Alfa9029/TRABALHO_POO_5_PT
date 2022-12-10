package Prin;
public class Principal {
	public static void main(String[] args) {
		Pessoa jeova = new Pessoa("Jeová", 37);
		Conta c = new Conta(jeova);
		c.creditar(2000.0);
		c.debitar(100);
		
		Pessoa samuel = new Pessoa("Samuel", 22);
		ContaEspecial c2 = new ContaEspecial(samuel, 200);
		c2.debitar(500);
		
		ContaPoupanca c3 = new ContaPoupanca(new Pessoa("Agamenon", 40),
				10000.0);


		/*Pessoa Fisica*/


		PessoaFisica marcos = new PessoaFisica("Marcos", "Antonio", 30, "123.456.789-10");
		Conta c4 = new Conta(marcos);
		c4.creditar(1000.0);

		PessoaFisica maria = new PessoaFisica("Maria", "Do Carmo", 50, "109.876.543-21");
		ContaEspecial c5 =
				new ContaEspecial(maria, 200);
		c2.debitar(500);

		ContaPoupanca c6 = new ContaPoupanca(
				new PessoaFisica("Gabriel", "Pereira",40, "123.555.444-00"),
				10000);



		/*Pessoa Jurídica*/

		PessoaJuridica empresa1 = new PessoaJuridica("Empresa1", "12.345.678/9101-12", "Empres");
		Conta c7 = new Conta(marcos);
		c4.creditar(1000.0);

		PessoaJuridica empresa2 = new PessoaJuridica("Empresa2", "12.345.678/9104-13","Marca");
		ContaEspecial c8 =
				new ContaEspecial(maria, 200);
		c2.debitar(500);


		ContaPoupanca c9 = new ContaPoupanca(
				new PessoaJuridica("Empresa3", "12.345.678/9104-13", "Loja"),
				100000);


		c3.rendeJuros();
				
		System.out.println(c);

		System.out.println(c2);
		
		System.out.println(c3);

		System.out.println(c4);

		System.out.println(c5);

		System.out.println(c6);

		System.out.println(c7);

		System.out.println(c8);

		System.out.println(c9);

	}
}
