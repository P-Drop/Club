package com.cursoceat.services;

import java.io.File;
import java.util.List;

import com.cursoceat.xml.schema.Club;
import com.cursoceat.xml.schema.Club.Socio;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;

public interface FuncionesXML {

	String rutaGuardar = "C:\\Users\\PROGRAMACION\\Desktop\\STERK BOX\\Java\\ClubDeSuciosSociosWeb\\sociosSave.xml";
	String rutaCargar = "C:\\Users\\PROGRAMACION\\Desktop\\STERK BOX\\Java\\ClubDeSuciosSociosWeb\\sociosSave.xml";
	File archivoGuardar = new File(rutaGuardar);
	File archivoCargar = new File(rutaCargar);
	
	
	public default void escribirXML(Object Cluba) throws JAXBException {
		Club tempClub = (Club) Cluba;
		JAXBContext contexto = JAXBContext.newInstance(Club.class);
		Marshaller mars = contexto.createMarshaller();
		mars.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		mars.marshal(tempClub, archivoGuardar);
	}
	
	public default List<Socio> cargarXML() throws JAXBException{
		JAXBContext contexto = JAXBContext.newInstance(Club.class);
		Unmarshaller unmars = contexto.createUnmarshaller();
		Club tempClub = (Club) unmars.unmarshal(archivoCargar);
		
		return tempClub.getSocio();
	}
}
