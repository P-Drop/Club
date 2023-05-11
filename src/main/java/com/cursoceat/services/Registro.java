package com.cursoceat.services;

import com.cursoceat.xml.schema.Club;

public interface Registro {

	public default void crearSocio(Object Cluba) {
		Club tempClub = (Club) Cluba;
	}
}
