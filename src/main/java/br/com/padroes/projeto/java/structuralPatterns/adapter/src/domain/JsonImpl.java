package br.com.padroes.projeto.java.structuralPatterns.adapter.src.domain;

public class JsonImpl implements JSON{

    @Override
    public String toString() {
        StringBuilder builderJson = new StringBuilder();
        builderJson.append("{\"pessoa\": {\n");
        builderJson.append("  \"peso\": \"70g\" {\n");
        builderJson.append("  \"nome\": \"Paulo\" {\n");
        builderJson.append("  \"id\": 1/n");
        builderJson.append("}}");
        return builderJson.toString();
    }
}
