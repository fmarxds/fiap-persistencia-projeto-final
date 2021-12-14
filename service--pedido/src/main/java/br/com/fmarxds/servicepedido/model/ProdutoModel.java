package br.com.fmarxds.servicepedido.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Field;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ProdutoModel {

    @Field("codigo")
    @EqualsAndHashCode.Include
    private String codigo;

    @Field("nome")
    private String nome;

    @Field("quantidade")
    private Integer quantidade;

}
