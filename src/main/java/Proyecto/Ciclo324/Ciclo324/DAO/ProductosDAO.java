package Proyecto.Ciclo324.Ciclo324.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import Proyecto.Ciclo324.Ciclo324.model.Productos;

public interface ProductosDAO extends JpaRepository <Productos, Long> {

}
