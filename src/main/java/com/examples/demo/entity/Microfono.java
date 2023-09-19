package com.examples.demo.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Microfono {
    Long id;
    String name;
    String marca;
    double val1;
    double val2;
    double total;

    public void setTotal() {
        this.total = val1 + val2;
    }

}
