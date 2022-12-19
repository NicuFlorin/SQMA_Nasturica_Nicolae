
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class StudentTests {

	@Test
	public void testConstructorParametru() {
		String nume = "Gigel";
		Student student = new Student(nume);

		assertEquals("Numele nu a fost initializat",nume, student.getNume());
		
		assertNotNull("Lista de note nu a fost initializata",student.getNote());

	}
	
	@Test
	public void testConstructorFaraParametrii() {
		Student student = new Student();
		assertNotNull("Numele nu a fost initializat",student.getNume());
		assertNotNull("Notele nu au fost initializate",student.getNote());

	}

	
	@Test
	public void testCalculeazaMedie() {
		Student student = new Student("Marcel");
		int nota=5;
		int nota2=1;
		int nota3=6;
		student.adaugaNota(nota);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		double medie = (nota+nota2+nota3)/3;
		assertEquals(medie, student.calculeazaMedie(),0.0001);

	}
	@Test
	public void testCalculeazaMedie1() {
		Student student = new Student("Marcel");
		int nota=5;
		int nota2=1;
		int nota3=4;
		student.adaugaNota(nota);
		student.adaugaNota(nota2);
		student.adaugaNota(nota3);
		double medie = (nota+nota2+nota3)/3.0f;
		assertEquals(medie, student.calculeazaMedie(),0.0001);

	}
	@Test
	public void testCalculeazaMedieONota() {
		Student student = new Student("Marcel");
		int nota=5;
		
		student.adaugaNota(nota);
		
		
		assertEquals(nota, student.calculeazaMedie(),0.0001);

	}
	@Test(expected = IllegalArgumentException.class)
	public void testCalculeazaMedieZeroNote() {
		Student student = new Student("Marcel");
		student.calculeazaMedie();

	}
	
	@Test
	public void testRestante() {
		Student student = new Student();
		student.adaugaNota(8);
		student.adaugaNota(3);
		student.adaugaNota(4);
		
		assertTrue(student.areRestante());

	}
	
	@Test
	public void testNuAreRestante() {
		Student student = new Student();
		student.adaugaNota(8);
		student.adaugaNota(5);
		student.adaugaNota(5);
		
		assertFalse(student.areRestante());

	}
	
	
	
	

}