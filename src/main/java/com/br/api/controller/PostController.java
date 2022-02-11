package com.br.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.api.Interface.PacientePost;
import com.br.api.model.PostModel;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("posts")
public class PostController {

	private PacientePost pacientePost;
	
	@GetMapping
	public List<PostModel> getAllPosts(){
		return pacientePost.getAllPost();
	}
}
