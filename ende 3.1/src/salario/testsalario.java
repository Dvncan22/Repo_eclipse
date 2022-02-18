package salario;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


class testsalario {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	@ParameterizedTest
	@CsvSource({"2000,1640"})
	@DisplayName ("Prueba salario neto")
	void testSalarioNeto(double neto, double resul) {
		//salario salobj = new salario();
		assertEquals(resul,salario.calculaSalarioNeto(2000));
	}
	

}
