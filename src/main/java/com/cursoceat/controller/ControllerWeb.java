package com.cursoceat.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cursoceat.dao.DatosClub;
import com.cursoceat.services.Funciones;
import com.cursoceat.xml.schema.Club.Socio;

import jakarta.xml.bind.JAXBException;

/**
 * Servlet implementation class ControllerWeb
 */
@WebServlet("/ControllerWeb")
public class ControllerWeb extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private DatosClub datos = new DatosClub();
    private Funciones funciones = new Funciones();
    /**
     * @see HttpServlet#HttpServlet()
     */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			for (Socio s : funciones.cargarXML()) {
			datos.miClub.getSocio().add(s);	
			}
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
		String nombreSocio = request.getParameter("nombreSocio");
		String direccionSocio = request.getParameter("direccionSocio");
		String fechaAlta = request.getParameter("fechaAlta");
		
		//funciones de validacion
		
		//crear objeto
		datos.crearSocio(nombreSocio, direccionSocio, fechaAlta);
		datos.mostarSocios();
		funciones.escribirXML(datos.miClub);
		request.setAttribute("msg", "Work on progress");
		request.getSession().setAttribute("misSocios", datos.miClub.getSocio());
		response.sendRedirect("index.jsp");
		
		}catch (Exception e) {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
