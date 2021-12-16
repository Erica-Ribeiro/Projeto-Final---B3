package br.com.b3final.projeto.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.b3final.projeto.dao.ContaDao;
import br.com.b3final.projeto.model.Conta;

@RestController
public class ContaController {

@Autowired
private ContaDao dao;

@GetMapping("/contas")

// vamos agora criar um método

public ArrayList<Conta> recuperarTudo(){
ArrayList<Conta> lista;
lista = (ArrayList<Conta>)dao.findAll();
return lista;
}
}