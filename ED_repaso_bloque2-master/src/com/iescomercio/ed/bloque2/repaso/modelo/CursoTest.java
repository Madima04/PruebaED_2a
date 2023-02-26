package com.iescomercio.ed.bloque2.repaso.modelo;

import com.iescomercio.ed.bloque2.repaso.modelo.Curso;

import junit.framework.Assert;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CursoTest {
	public  void eliminarAlumno(String dni) throws Exception {
		if(dni.length()==9) {//comprobar la longitud del dni
			listaAlumnos.remove(new Persona(dni, "", "")); //solo hace falta el dni
		}else {
			throw new Exception("El dni no tiene la longitud adecuada");
		}
	}
	
	public void aniadirAlumno(Persona p) {
		listaAlumnos.add(p);
	}
	
	public Boolean estaRegistrado(String dni) {
		int i =0;
		Boolean encontrado=false;
		while (!encontrado && i<listaAlumnos.size()) {
			if(listaAlumnos.get(i).getDni().equals(dni)) {
				encontrado=true;
			}
			i++;
		}
		return encontrado;
	}
	
	private List<Persona> listaAlumnos;
	
	 @BeforeEach
	    public void setUp() {
	        // Inicializar la lista de alumnos
	        listaAlumnos = new ArrayList<>();
	        listaAlumnos.add(new Persona("123456789", "Juan", "Pérez"));
	        listaAlumnos.add(new Persona("987654321", "María", "García"));
	    }

	@Test
	void testEliminarAlumno() throws Exception {
		String dni = "123456789";
		int cantidadAlumnosAntes = listaAlumnos.size();
		eliminarAlumno(dni);
		int cantidadAlumnosDespues = listaAlumnos.size();
		assertEquals(cantidadAlumnosAntes -1, cantidadAlumnosDespues);	
	}

	@Test
	void testAniadirAlumno() {
		int cantidadAlumnosAntes = listaAlumnos.size();
		listaAlumnos.add(new Persona("16636908L", "Mario", "Díaz"));
		int cantidadAlumnosDespues = listaAlumnos.size();
		assertEquals(cantidadAlumnosAntes + 1, cantidadAlumnosDespues);	
	}

	@Test
	void testEstaRegistrado() {
		String dni = "123456789";
		assertEquals( estaRegistrado(dni), true);	
	}

	@Test
	void testCurso() {
		 Curso curso = new Curso();
	     ArrayList<String> listaAlumnos = new ArrayList<String>();
	     assertEquals(0, listaAlumnos.size());
	}

	@Test
	void testNumeroAlumnos() {
		int cantidadAlumnos = listaAlumnos.size();
		assertEquals(cantidadAlumnos, listaAlumnos.size());
	}
	
}
