package abstratic;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Funcionario> funcionarios =  new ArrayList<Funcionario>();
		funcionarios.add(new Concursado(400 , 5));
		funcionarios.add(new Concursado(200 , 12));
		funcionarios.add(new Temporario(144 , 5));
		
		for (Funcionario funcionario : funcionarios) {
		System.out.print("  " + funcionario.getSalario());
		}
	}

}
