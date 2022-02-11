package com.br.api.Interface;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.br.api.model.PostModel;

@FeignClient(name = "post", url ="https://apirest-pacientes.herokuapp.com/api")
public interface PacientePost {
	
	//trazendo todos na api em Lista
	@GetMapping(value = "/pacientes")
	List<PostModel> getAllPost();

}
