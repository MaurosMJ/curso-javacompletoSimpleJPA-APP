package Application;

import domain.Pessoa;

public class Program {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa (1, "Carlos Silva", "carlos.silva@email.com");
		Pessoa pessoa2 = new Pessoa (2, "Joaquim Torres", "joaquim.torres@email.com");
		Pessoa pessoa3 = new Pessoa (3, "Ana Maria", "ana.maria@email.com");
		
		System.out.println(pessoa1);
		System.out.println(pessoa2);
		System.out.println(pessoa3);
		
	}

}
