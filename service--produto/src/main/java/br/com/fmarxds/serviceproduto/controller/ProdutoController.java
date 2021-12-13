package br.com.fmarxds.serviceproduto.controller;

import br.com.fmarxds.serviceproduto.model.ProdutoModel;
import br.com.fmarxds.serviceproduto.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService produtoService;

    @GetMapping
    public ResponseEntity<List<ProdutoModel>> buscarTodos() {
        return ResponseEntity.ok(produtoService.buscarTodos());
    }

    @GetMapping("/codigo/{codigo}")
    public ResponseEntity<ProdutoModel> buscarPorCodigo(@PathVariable("codigo") String codigo) {
        return ResponseEntity.of(produtoService.buscarPorCodigo(codigo));
    }

}
