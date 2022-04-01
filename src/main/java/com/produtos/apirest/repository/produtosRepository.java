/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.produtos.apirest.repository;

import com.produtos.apirest.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;//Nesse pacote JpaRepository tem varios metodos prontos  persitencias no banco de Dados

/**
 *
 * @author Gestão Tech
 */
public interface produtosRepository extends JpaRepository<Produto, Long>{
   Produto findById(long id); 
}
