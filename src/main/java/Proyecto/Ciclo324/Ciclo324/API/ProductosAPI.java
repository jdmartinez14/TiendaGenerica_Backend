package Proyecto.Ciclo324.Ciclo324.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Proyecto.Ciclo324.Ciclo324.DAO.ProductosDAO;
import Proyecto.Ciclo324.Ciclo324.model.Productos;

@RestController
@RequestMapping ("productos")
public class ProductosAPI {

	@Autowired
	private ProductosDAO productosDAO;
	
	@PostMapping ("/guardar")
	public void guardar(@RequestBody Productos productos){
		productosDAO.save(productos);
	}
	
	@GetMapping ("/listar")
	public List<Productos> listar(){
		return productosDAO.findAll();
	}
	
	@DeleteMapping ("/eliminar/{id}")
	public void eliminar (@PathVariable("id") Long id) {
		productosDAO.deleteById(id);		
	}
	
	@PutMapping ("/actualizar")
	public void actualizar(@RequestBody Productos productos){
		productosDAO.save(productos);
	}
	
}
