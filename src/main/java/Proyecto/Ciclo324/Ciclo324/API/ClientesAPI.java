package Proyecto.Ciclo324.Ciclo324.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Proyecto.Ciclo324.Ciclo324.DAO.ClientesDAO;
import Proyecto.Ciclo324.Ciclo324.model.Clientes;

@RestController
@RequestMapping ("clientes")
public class ClientesAPI {
	
	@Autowired
	private ClientesDAO clientesDAO;
	
	@PostMapping ("/guardar")
	public void guardar(@RequestBody Clientes clientes){
		clientesDAO.save(clientes);
	}
	
	@GetMapping ("/listar")
	public List<Clientes> listar(){
		return clientesDAO.findAll();
	}
	
	@DeleteMapping ("/eliminar/{id}")
	public void eliminar (@PathVariable("id") Long id) {
		clientesDAO.deleteById(id);		
	}
	
	@PutMapping ("/actualizar")
	public void actualizar(@RequestBody Clientes clientes){
		clientesDAO.save(clientes);
	}

}
