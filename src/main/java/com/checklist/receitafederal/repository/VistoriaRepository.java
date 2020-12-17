package com.checklist.receitafederal.repository;

import org.springframework.data.repository.CrudRepository;

import com.checklist.receitafederal.model.Vistoria;

//Usar Long no segundo generic já que seu código identificador é desse tipo
public interface VistoriaRepository extends CrudRepository<Vistoria, Long>{

}
