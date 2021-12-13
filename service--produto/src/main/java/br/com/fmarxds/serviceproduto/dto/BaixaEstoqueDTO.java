package br.com.fmarxds.serviceproduto.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BaixaEstoqueDTO {

    @JsonProperty("quantidade")
    private Integer quantidade;

}
