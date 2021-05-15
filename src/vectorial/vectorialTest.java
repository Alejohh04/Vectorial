package vectorial;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
/**
 * Clase donde se hacen las pruebas con JUNIT
 * @author ALEJANDRO
 *
 */
public class vectorialTest {
	static parametros p;
	static vectorial vectorial;
	
	int v1[]= {5,5,5};
	int v2[]= {2,2,2};
	int v3[]= {1,1,1};
	int v4[]= {1,2,3};
	int v5[]= {1,1,1,1};
	
	
	
	@Before
	public void before() {
		p=new parametros();
		vectorial=new vectorial();
	}
	
	@Test
	public void testSuma() {
		vectorial.suma(v1, v2);
		int resultado1[]=vectorial.getResultante();
		int esperado1[]= {7,7,7};
		assertArrayEquals(esperado1,resultado1);
		int error1[]= {7,7,8};
		assertArrayEquals(error1,resultado1);
		
		vectorial.suma(v1, v2, v3);
		int resultado2[]=vectorial.getResultante();
		int esperado2[]= {8,8,8};
		assertArrayEquals(esperado2,resultado2);
		int error2[]= {7,7,8};
		assertArrayEquals(error2,resultado1);
	}
	
	@Test
	public void testResta() {
		vectorial.resta(v1, v2);
		int resultado1[]=vectorial.getResultante();
		int esperado1[]= {3,3,3};
		assertArrayEquals(esperado1,resultado1);
		int error1[]= {7,7,8};
		assertArrayEquals(error1,resultado1);
		
		vectorial.resta(v1, v2, v3);
		int resultado2[]=vectorial.getResultante();
		int esperado2[]= {2,2,2};
		assertArrayEquals(esperado2,resultado2);
		int error2[]= {7,7,8};
		assertArrayEquals(error2,resultado1);
		
	}
	
	@Test
	public void testMultiplicacion() {
		vectorial.multiplicacion(v1, v2);
		int resultado1[]=vectorial.getResultante();
		int esperado1[]= {10,10,10};
		assertArrayEquals(esperado1,resultado1);
		int error1[]= {7,7,8};
		assertArrayEquals(error1,resultado1);
		
		vectorial.multiplicacion(v1, v2, v3);
		int resultado2[]=vectorial.getResultante();
		int esperado2[]= {10,10,10};
		assertArrayEquals(esperado2,resultado2);
		int error2[]= {7,7,8};
		assertArrayEquals(error2,resultado1);
		
	}
	
	@Test
	public void testInverso() {
		vectorial.inverso(v4);
		int resultado1[]=vectorial.getResultante();
		int esperado1[]= {3,2,1};
		assertArrayEquals(esperado1,resultado1);
		int error[]= {7,7,8};
		assertArrayEquals(error,resultado1);

	}
	
	@Test
	public void testTotal() {

		int resultado=vectorial.total(v1);
		int esperado=15;
		assertEquals(esperado,resultado);
		int error=99;
		assertEquals(error,resultado);
		
	}
	
	//----------------------------------------------------------------
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void ExcepSuma2() {
		vectorial.suma(v1, v5);
	}
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void ExcepSuma3() {
		vectorial.suma(v1, v2, v5);
	}
	
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void ExcepResta2() {
		vectorial.resta(v1, v5);
	}
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void ExcepResta3() {
		vectorial.resta(v1, v2, v5);
	}
	
	
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void ExcepMultiplicacion2() {
		vectorial.multiplicacion(v1, v5);
	}
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void ExcepMultiplicacion3() {
		vectorial.multiplicacion(v1, v2, v5);
	}
}
