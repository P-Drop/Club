package com.cursoceat.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

import com.cursoceat.xml.schema.Club;
import com.cursoceat.xml.schema.Club.Socio;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

public class Controller {
	
	static String rutaOrigen = "C:\\Users\\PROGRAMACION\\Desktop\\STERK BOX\\Java\\ClubDeSuciosSocios\\";
	static String rutaDestino = rutaOrigen;
	static Scanner keyboard = new Scanner(System.in);
	static Club sucioClub = new Club();
	
	public static void main(String[] args) throws JAXBException {
		saludo();
		menu();
		despedida();
	}
	
	public static void leerXML() throws JAXBException{
		System.out.print("LEER XML\nNombre de archivo -> ");
		rutaOrigen += keyboard.next();
		File archivoOrigen = new File(rutaOrigen);
		JAXBContext contexto = JAXBContext.newInstance(Club.class);
		Unmarshaller unmar = contexto.createUnmarshaller();
		sucioClub = (Club) unmar.unmarshal(archivoOrigen);
		mostrarSocios();
	}
	
	public static void escribirXML() throws JAXBException{
		System.out.print("ESCRIBIR XML\nNombre de archivo -> ");
		rutaDestino += keyboard.next();
		File archivoDestino = new File(rutaDestino);
		JAXBContext contexto = JAXBContext.newInstance(Club.class);
		Marshaller mars = contexto.createMarshaller();
		mars.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		mars.marshal(sucioClub, archivoDestino);
	}
	
	public static void crearSocio() {
		try {
		keyboard.nextLine();
		System.out.println("CREAR SOCIO\nNombre -> ");
		String nombre = keyboard.nextLine();
		System.out.println("Direccion -> ");
		String direccion = keyboard.nextLine();
		System.out.println("Fecha de alta -> ");
		String fechaAlta = keyboard.nextLine();
		Integer id = sucioClub.getSocio().size()+1;
		Socio sucio = new Socio(nombre, direccion, fechaAlta, id);
		sucioClub.getSocio().add(sucio);
		}
		catch (Exception e) {
			System.out.println("\nError -> "+e.getMessage());
		}
	}
	
	public static void mostrarSocios() {
		if(!sucioClub.getSocio().isEmpty()) {
		for (Socio so : sucioClub.getSocio()) {
			System.out.println(so.toString());
		}
		}
		else {
			System.err.println("\nError -> No hay socios que mostrar\n");
		}
	}
	
	public static void menu() {
		boolean salir = false;
		while (!salir) {
		System.out.println("\n-------------------");
		System.out.println("1. Cargar XML");
		System.out.println("2. Mostrar socios");		
		System.out.println("3. Crear socio");
		System.out.println("4. Guardar XML");
		System.out.println("\n0. Salir");
		System.out.println("\n-------------------");
		System.out.print("\nOpcion -> ");
		try {
		int opcion = keyboard.nextInt();
		switch (opcion) {
		case 1:
			leerXML();
			break;
		case 2:
			mostrarSocios();
			break;
		case 3:
			crearSocio();
			break;
		case 4:
			escribirXML();
			break;
		case 0:
			salir = true;
			break;
		default:
			System.err.println("Error -> Opcion no valida");
			break;
		}
		
		} catch (Exception e) {
			System.err.println("Error -> "+e.getMessage());
		}
		keyboard.nextLine();
		}
	}
	
	public static void saludo() {
		System.out.println("HAU\n");
	}
	
	public static void despedida() {
		System.out.println("\nPAZ");
	}
	public static void login() {
		try {
		System.out.println("\n--------------------");
		System.out.print("\tUsuario: ");
		String user = keyboard.next();
		System.out.print("\tContraseña: ");
		String contraseña = keyboard.next();
		System.out.println("--------------------\n");
		}
		catch (Exception e) {
			System.err.println("\nError -> "+e.getMessage());
		}
	}
	
	/*
	 * public static void checkLogin(String u, String pw) { try(BufferedReader f =
	 * new BufferedReader(new FileReader("acceso.txt"))){ String userData =
	 * f.readLine(); while (userData != (-1)) {
	 * 
	 * } } catch (Exception e) { System.err.println("\nError -> "+e.getMessage()); }
	 * }
	 */
}
