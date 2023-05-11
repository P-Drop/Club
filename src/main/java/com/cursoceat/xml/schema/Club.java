//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2023.05.10 a las 09:15:15 AM CEST 
//


package com.cursoceat.xml.schema;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="socio" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="nombreSocio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="fechaAlta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="idSocio" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "socio"
})
@XmlRootElement(name = "club")
public class Club implements funcionesSocios {

    @XmlElement(required = true)
    protected List<Club.Socio> socio;

    /**
     * Gets the value of the socio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the socio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSocio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Club.Socio }
     * 
     * 
     */
    public List<Club.Socio> getSocio() {
        if (socio == null) {
            socio = new ArrayList<Club.Socio>();
        }
        return socio;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="nombreSocio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="fechaAlta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="idSocio" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nombreSocio",
        "direccion",
        "fechaAlta"
    })
    public static class Socio {


		@XmlElement(required = true)
        protected String nombreSocio;
        @XmlElement(required = true)
        protected String direccion;
        @XmlElement(required = true)
        protected String fechaAlta;
        @XmlAttribute(name = "idSocio")
        protected Integer idSocio;
        
        public Socio() {
        	
        }

        public Socio(String nombreSocio, String direccion, String fechaAlta, Integer idSocio) {
        	this.nombreSocio = nombreSocio;
        	this.direccion = direccion;
        	this.fechaAlta = fechaAlta;
        	this.idSocio = idSocio;
        }
        /**
         * Obtiene el valor de la propiedad nombreSocio.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombreSocio() {
            return nombreSocio;
        }

        /**
         * Define el valor de la propiedad nombreSocio.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombreSocio(String value) {
            this.nombreSocio = value;
        }

        /**
         * Obtiene el valor de la propiedad direccion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDireccion() {
            return direccion;
        }

        /**
         * Define el valor de la propiedad direccion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDireccion(String value) {
            this.direccion = value;
        }

        /**
         * Obtiene el valor de la propiedad fechaAlta.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFechaAlta() {
            return fechaAlta;
        }

        /**
         * Define el valor de la propiedad fechaAlta.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFechaAlta(String value) {
            this.fechaAlta = value;
        }

        /**
         * Obtiene el valor de la propiedad idSocio.
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getIdSocio() {
            return idSocio;
        }

        /**
         * Define el valor de la propiedad idSocio.
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setIdSocio(Integer value) {
            this.idSocio = value;
        }

        @Override
		public String toString() {
			return "Socio [nombreSocio=" + nombreSocio + ", direccion=" + direccion + ", fechaAlta=" + fechaAlta
					+ ", idSocio=" + idSocio + "]";
		}
    }

}
