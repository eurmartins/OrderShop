package com.example.OrderShop.controller;

import com.example.OrderShop.dto.produto.ProdutoDTO;
import com.example.OrderShop.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoService produtoService;

    @PostMapping("/criarProduto")
    public ResponseEntity<ProdutoDTO> saveProduto(@RequestBody ProdutoDTO produtoDTO){
        return ResponseEntity.ok(produtoService.saveProduto(produtoDTO));
    }

    @GetMapping("/listarProdutos")
    public ResponseEntity<List<ProdutoDTO>> listAllProdutos(){
        return ResponseEntity.ok(produtoService.listAllProdutos());
    }

    @PutMapping("/attProduto/{id}")
    public ResponseEntity<ProdutoDTO> updateProduto(@PathVariable Long id, @RequestBody ProdutoDTO produtoDTO){
        return ResponseEntity.ok(produtoService.uptadeProduto(id, produtoDTO));
    }

    @DeleteMapping("/deleteProduto/{id}")
    public ResponseEntity<Void> deleteProduto(@PathVariable Long id){
        return ResponseEntity.ok().build();
    }
}
