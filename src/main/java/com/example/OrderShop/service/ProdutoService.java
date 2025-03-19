package com.example.OrderShop.service;

import com.example.OrderShop.dto.produto.ProdutoDTO;
import com.example.OrderShop.dto.usuarios.UsuarioRequestDTO;
import com.example.OrderShop.dto.usuarios.UsuarioResponseDTO;
import com.example.OrderShop.entities.ProdutoEntity;
import com.example.OrderShop.entities.UsuarioEntity;
import com.example.OrderShop.mapper.ProdutoMapper;
import com.example.OrderShop.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoRepository produtoRepository;
    private final ProdutoMapper produtoMapper;

    public ProdutoDTO saveProduto(ProdutoDTO produtoDTO){
        return produtoMapper.produtoDTOToProdutoEntity(produtoRepository.save(produtoMapper.produtoEntityToProdutoDTO(produtoDTO)));
    }

    public List<ProdutoDTO> listAllProdutos(){
        return produtoMapper.listEntityToProdutoDTO(produtoRepository.findAll());
    }

    public ProdutoDTO uptadeProduto(Long id, ProdutoDTO produtoDTO){
        ProdutoEntity produto = produtoRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Produto não encontrado!"));
        produtoMapper.updateProduto(produtoDTO, produto);

        return produtoMapper.produtoDTOToProdutoEntity(produtoRepository.save(produto));
    }

    public void deleteProduto(Long id){
        produtoRepository.deleteById(id);
    }
}
