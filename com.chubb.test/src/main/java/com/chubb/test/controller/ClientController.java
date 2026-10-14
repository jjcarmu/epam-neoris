package com.chubb.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chubb.test.model.dtos.ClientDto;
import com.chubb.test.model.dtos.ServiceResponse;
import com.chubb.test.service.IClientService;



/**
 * Controlador REST para operaciones de consulta relacionadas con los Clientes.
 * <p>
 * Facilita la exposición de datos maestros de los clientes, como listados guardar o borrar.
 * </p>
 *
 * @author Jhon Javier Cardona Muñoz <jhonjcm2@gmail.com>
 * @version 1.0
 */
@RestController
@CrossOrigin(origins = { "http://localhost:8080" })
@RequestMapping("/api")
public class ClientController {
	@Autowired
	private IClientService clientService;

	/**
	 * Endpoint para obtener un listado de todos los clientes registrados.
	 * <p>
	 * Retorna la información completa de estado de cada cliente.
	 * </p>
	 *
	 * @return Una respuesta con la lista completa de {@link ClientDto}.
	 */
	@CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/clients")
    public ResponseEntity<List<ClientDto>> getClients() {
    	return ResponseEntity.ok(clientService.findAll());
    	
    }


	/**
	 * Endpoint para guardar un cliente.
	 * <p>
	 * Retorna un ServiceResponse.
	 * </p>
	 *
	 * @return Una respuesta HTTP 200 OK con la lista completa de {@link ClientDto}.
	 */
	@CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/client")
    public ResponseEntity<ServiceResponse> saveClient(@RequestBody ClientDto client) {
    	ServiceResponse serviceReponse = new ServiceResponse();
    	int result = clientService.save(client);
    	if (result == 1) {
    		serviceReponse.setSuccess(true);
	    	serviceReponse.setMessage("Client saved with sucesss");
    	}
    	
    	return new ResponseEntity<>(serviceReponse, HttpStatus.OK);
    	
    }
	
}
