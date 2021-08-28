package com.unmsm.weka.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.unmsm.weka.model.CanopyModel;
import com.unmsm.weka.model.WekaModel;

//@Repository
@Mapper
public interface CanopyRepository{

	//Select for one JSON
		@Select("SELECT DISTINCT\r\n"
				+ "	o.htitulo_cat,\r\n"
				+ "	o.htitulo,\r\n"
				+ "    vfun.descripcion_normalizada as funciones\r\n"
				+ "from webscraping w \r\n"
				+ "inner join oferta 		  o 	ON (w.id_webscraping=o.id_webscraping)\r\n"
				+ "left outer join v_funcion vfun  ON (o. id_oferta=vfun.id_oferta)\r\n"
				+ "WHERE \r\n"
				+ "	o.id_estado IS null\r\n"
				+ "ORDER BY 1,2,3  LIMIT #{id}")    	
		List<CanopyModel> getModel(@Param("id") Long id);
	
		
}
