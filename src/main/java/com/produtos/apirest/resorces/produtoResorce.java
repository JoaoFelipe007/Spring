    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.produtos.apirest.resorces;

import com.produtos.apirest.models.Produto;
import com.produtos.apirest.repository.produtosRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Gestão Tech
 */
@RestController //classe que irá receber as requisições  http 
@RequestMapping(value="/api") 
@Api(value = "Api Rest Produto")// Nome da Api
@CrossOrigin("*") // Aqui vc pode restringir um a dominio ou a qualquer dominio 
public class produtoResorce {
    
    @Autowired//vai usar para fazer o ponto de injeçõão com a repository
     produtosRepository produtoRepository;
    
    @GetMapping("/produto")// vai usar para fazer uma lista dos prosutos no banco
    @ApiOperation("Lista todos os Produtos ")
         public List<Produto> listaProduto(){// esse metodo vai retornar uma lista de produto cadastradono banco 
            return produtoRepository.findAll();
         }      
    @GetMapping("/produto/{id}")
    @ApiOperation("Lista um unico produto por Id")      
    public Produto produtoPorId(@PathVariable("id")long id){
            return produtoRepository.findById(id);
         }
          
   @PostMapping("/produto")// criar
   @ApiOperation("cria os Produtos")
        public Produto salvarProduto(@RequestBody Produto produto){
       return produtoRepository.save(produto);
   }
            
   @DeleteMapping("/produto")//deleta
   @ApiOperation("Delata Produto")
   public void deletaProduto(@RequestBody Produto produto){
       produtoRepository.delete(produto);
   }
   
   @PutMapping("/produto")// altera
   @ApiOperation("Altera Produto")
   public Produto alteraProduto(@RequestBody Produto produto){
       return produtoRepository.save(produto);
   }
 }
