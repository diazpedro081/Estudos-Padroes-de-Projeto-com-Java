package adapter;

import org.json.JSONException;
import org.json.JSONObject;

import domain.JSON;
import domain.JsonImpl;
import domain.XML;


public class AdapterXML implements JSON {

    private StringBuilder conteudo;

    public AdapterXML(XML xml) {
        try {

            JSONObject jsonObj = org.json.XML.toJsonObject(xml.toString());
            String json = jsonObj.toString(3);
            this.conteudo = new StringBuilder();
            this.conteudo.append(json);

        } catch (JSONException je) {
            System.out.println(je.toString());
        }
    }

    @Override
    public String toString() {
        return conteudo.toString();
    }

    

}
