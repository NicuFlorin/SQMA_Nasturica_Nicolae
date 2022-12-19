
import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class UnitTests{
@Test
	public void setterNume() {
		String nume = "Gigel";
		Student student = new Student();

		student.setNume(nume);
		assertEquals(nume, student.getNume());	

	}
	
	@Test
	public void testAdaugarNote() {
		Student student = new Student("Marcel");
		int nota =8;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));

	}
	
	@Test
	public void testDimensiuneLista() {
		Student student = new Student("Marcel");
		int nota =8;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());

	}
}