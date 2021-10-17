package Proyecto.Ciclo324.Ciclo324.API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Proyecto.Ciclo324.Ciclo324.DAO.VentasDAO;
import Proyecto.Ciclo324.Ciclo324.model.Ventas;

@RestController
@RequestMapping ("ventas")
public class VentasAPI {
	
	@Autowired
	private VentasDAO ventasDAO;
	
	@PostMapping ("/guardar")
	public void guardar(@RequestBody Ventas ventas){
		ventasDAO.save(ventas);
	}
	
}
