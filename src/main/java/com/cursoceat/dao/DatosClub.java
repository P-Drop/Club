package com.cursoceat.dao;

import com.cursoceat.xml.schema.Club;
import com.cursoceat.xml.schema.Club.Socio;

public class DatosClub{

	public Club miClub = new Club();
	
	public void crearSocio(String n, String d, String f) {
		int id = miClub.getSocio().size() +1;
		Socio s = new Socio(n, d, f, id);
		miClub.getSocio().add(s);
	}
	
	public void mostarSocios() {
		for (Socio s : miClub.getSocio()) {
			System.out.println(s.toString());
		}
	}
}
