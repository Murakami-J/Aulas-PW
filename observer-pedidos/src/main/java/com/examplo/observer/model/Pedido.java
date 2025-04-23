package com.examplo.observer.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pedido {
    private Long id;
    private String cliente;
    private String produto;
}
