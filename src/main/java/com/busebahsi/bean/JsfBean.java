package com.busebahsi.bean;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Named(value = "cdiBean")
@ApplicationScoped
@Getter @Setter

public class JsfBean {
    private String patika;

    public JsfBean(String patika) {
        this.patika = "Spring eğitimine hoşgeldiniz";
    }

}
