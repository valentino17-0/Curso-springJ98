package com.certus.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.certus.spring.models.Personaje;
import com.certus.spring.models.Response;
import com.certus.spring.repository.IPersonajeDAO;

@Component("servicio1")
public class PersonajeService implements IPersonajeService {
	
	@Autowired
	IPersonajeDAO personajeRepository;
	
	@Override
	//enviando personaje
	public Response<Personaje> crearPersonaje(Personaje p) {
		
		Response<Personaje> response = new Response<>();
		
		try {
			Personaje personaje = personajeRepository.save(p);
			response.setEstado(true);
			
			response.setMensaje("Personaje "+personaje.getNombres()+" creado Correctamente");
			
		} catch (Exception e) {
			response.setEstado(false);
			response.setMensaje("Error al crear personaje "+p.getNombres()); //enviando el mensaje que se generó al guardar
			response.setMensajeError(e.getStackTrace().toString());
		}
		
		return response;
	}
	
	@Override
	public Response<Personaje>  editarPersonaje(Integer ID) {
		
		Response<Personaje> response = new Response<>();
		
		try {
			Optional<Personaje> p = personajeRepository.findById(ID);
			response.setEstado(true);
			response.setData(p.get());
			
		} catch (Exception e) {
			response.setEstado(false);
			response.setMensajeError(e.getStackTrace().toString());
		}
		
		
		return response;
	}


	@Override
	public Response<Personaje> listarPersonaje() {
		
		Response<Personaje> response = new Response<>();	
		
		try {
			response.setListData((List<Personaje>) personajeRepository.findAll());
			response.setEstado(true);
			response.setMensaje("Personajes obtenidos correctamente");
			
		} catch (Exception e) {
			
			response.setEstado(false);
			response.setMensaje("Error al obtener personajes");
			response.setMensajeError(e.getStackTrace().toString());
		}
		
		
		return response;
	}


	@Override
	public Response<Personaje> eliminarPersonaje(Integer ID) {
		
		Response<Personaje> response = new Response<>();
		
		
		try {
			Optional<Personaje> p = personajeRepository.findById(ID);
			
			personajeRepository.deleteById(ID);
			response.setEstado(true);
			response.setMensaje("El personaje "+p.get().getNombres()+ "ha sido eliminado");

			
		} catch (Exception e) {
			response.setEstado(false);
			response.setMensaje("Error al eliminar personaje");
			response.setMensajeError(e.getStackTrace().toString());
		}
		
		return response;
	}

	

}