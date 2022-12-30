package service;

import domain.JSON;

public class ConteudoService {

    private JSON json;

    public JSON get() {
        return json;
    }

    public void set(JSON json) {
        this.json = json;
    }

    @Override
    public String toString() {
        return "ConteudoService [json=" + json + "]";
    }

    
}
