package br.com.padroes.projeto.java.structuralPatterns.adapter.src;

import br.com.padroes.projeto.java.structuralPatterns.adapter.src.adapter.AdapterXML;
import br.com.padroes.projeto.java.structuralPatterns.adapter.src.domain.JSON;
import br.com.padroes.projeto.java.structuralPatterns.adapter.src.domain.JsonImpl;
import br.com.padroes.projeto.java.structuralPatterns.adapter.src.domain.XML;
import br.com.padroes.projeto.java.structuralPatterns.adapter.src.domain.XmlImpl;
import br.com.padroes.projeto.java.structuralPatterns.adapter.src.service.ConteudoService;

public class AppCliente {
    public static void main(String[] args) {
        
        ConteudoService service = new ConteudoService();

        JSON json = new JsonImpl();
        XML xml = new XmlImpl();
        AdapterXML adapter = new AdapterXML(xml);

        System.out.println(xml);
        System.out.println();

        service.set(json);
        System.out.println(service.get());
        System.out.println();

        service.set(adapter);
        System.out.println(service.get());
    }
}
