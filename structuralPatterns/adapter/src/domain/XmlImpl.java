package domain;

public class XmlImpl implements XML{
    
    @Override
    public String toString() {
        StringBuilder builderXml = new StringBuilder();
        builderXml.append("<?xml version=\"1.0\" ?>\n");
        builderXml.append("<pessoa>\n");
        builderXml.append("  <peso>55kg</peso>\n");
        builderXml.append("  <nome>Ana</nome>\n");
        builderXml.append("  <id>2</id>\n");
        builderXml.append("</pessoa>");
        return super.toString();
    }
}
