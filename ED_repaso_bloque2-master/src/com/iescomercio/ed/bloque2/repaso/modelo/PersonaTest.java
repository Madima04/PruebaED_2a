package com.iescomercio.ed.bloque2.repaso.modelo;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {
	
	private String dni;
	private String nombre;
	private String apellido1;
	private List<Persona> listaAlumnos;
	
	public void setDni(String dni) throws Exception {
		//comprobacion de si el ultimo caracter es una letra
		if(Character.isLetter(dni.charAt(dni.length()))) {
			this.dni=dni;
		}else {
			throw new Exception("El ultimo caracter introducido no es una letra");
		}
	}
	
	 @BeforeEach
	    public void setUp() {
	        // Inicializar la lista de alumnos
	        listaAlumnos = new ArrayList<>();
	        listaAlumnos.add(new Persona("123456789", "Juan", "Pérez"));
	        listaAlumnos.add(new Persona("987654321", "María", "García"));
	    }

	@Test
	void testPersona() {
		 String dni = "12345678A";
	        String nombre = "Juan";
	        String apellido1 = "Pérez";
	        Persona persona = new Persona(dni, nombre, apellido1);
	        assertEquals(dni, persona.getDni());
	        assertEquals(nombre, persona.getNombre());
	        assertEquals(apellido1, persona.getApellido1());
	}

	@Test
	void testGetDni() {
		String dni = "12345678A";
        String nombre = "Juan";
        String apellido1 = "Pérez";
        Persona persona = new Persona(dni, nombre, apellido1);
        assertEquals(dni, persona.getDni());
	}

	@Test
	void testSetDni() throws Exception {
		 // Caso válido, el DNI termina en letra
	    Persona p = new Persona();
	    p.setDni("12345678Z");
	    try {
	        p.setDni("12345678A1");
	        fail("Debería haber lanzado una excepción");
	    } catch (Exception e) {
	        assertEquals("El último caracter introducido no es una letra", e.getMessage());
	    }
	}

	@Test
	void testGetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testSetNombre() {
		fail("Not yet implemented");
	}

	@Test
	void testGetApellido1() {
		fail("Not yet implemented");
	}

	@Test
	void testSetApellido1() {
		fail("Not yet implemented");
	}

}
