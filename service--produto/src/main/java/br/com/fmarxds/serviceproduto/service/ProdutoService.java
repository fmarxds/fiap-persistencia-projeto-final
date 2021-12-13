package br.com.fmarxds.serviceproduto.service;

import br.com.fmarxds.serviceproduto.model.ProdutoModel;
import br.com.fmarxds.serviceproduto.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProdutoService {

    private final ProdutoRepository produtoRepository;

    public List<ProdutoModel> buscarTodos() {
        return produtoRepository.findAll();
    }

    public Optional<ProdutoModel> buscarPorCodigo(String codigo) {
        return produtoRepository.findOneByCodigo(codigo);
    }

}
