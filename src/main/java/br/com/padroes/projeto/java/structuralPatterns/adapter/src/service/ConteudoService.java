package br.com.padroes.projeto.java.structuralPatterns.adapter.src.service;

import br.com.padroes.projeto.java.structuralPatterns.adapter.src.domain.JSON;

public class ConteudoService {

    private JSON json;

    public JSON get() {
        return json;
    }

    public void set(JSON json) {
        this.json = json;
    }    
}
