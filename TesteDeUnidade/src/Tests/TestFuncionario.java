package Tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import testeUnidade.Funcionario;

public class TestFuncionario {
	private Funcionario funcionarios;
	@Before
	public void criaFuncionario() {
		funcionarios = new Funcionario("Michel Treme", "45", 10000.00);
	}
	@Test
	public void testaFuncionario() {
		assertEquals("Nome diferente do esperado", "Michel Treme", funcionarios.getNome());
		assertEquals("Matricula diferente do esperado", "45", funcionarios.getMatricula());
		assertEquals("Salario errado", 10000.00, funcionarios.getSalario(), 000.1);
		funcionarios.setSalario(100000.00);
		funcionarios.setMatricula("22");
		funcionarios.setNome("Roberto Estarke");
		assertEquals("Nome errado", "Roberto Estarque", funcionarios.getNome());
		assertEquals("Matricula errada", "22", funcionarios.getMatricula());
		assertEquals("Salario errado", 100000.00, funcionarios.getSalario(), 000.1);
	}
	
	@Test
	public void testaToString() {
		assertEquals("toString não corresponde ao funcionario", "Michel Treme - 45 - 10000.0", funcionarios.toString());
	}
}
