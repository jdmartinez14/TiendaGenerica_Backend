package Proyecto.Ciclo324.Ciclo324.API;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import Proyecto.Ciclo324.Ciclo324.DAO.Detalle_VentasDAO;
import Proyecto.Ciclo324.Ciclo324.model.Detalle_Ventas;

@RestController
@RequestMapping ("detalle_ventas")
public class Detalle_VentasAPI {
	
	@Autowired
	private Detalle_VentasDAO detalle_ventasDAO;
	
	@PostMapping ("/guardar")
	public void guardar(@RequestBody Detalle_Ventas detalle_ventas){
		detalle_ventasDAO.save(detalle_ventas);
	}

}
