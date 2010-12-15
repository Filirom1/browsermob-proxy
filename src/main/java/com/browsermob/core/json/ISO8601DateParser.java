package com.browsermob.core.json;

import java.io.IOException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.deser.DateDeserializer;

public class ISO8601DateParser extends DateDeserializer {

    @Override
    public java.util.Date deserialize(JsonParser jp, DeserializationContext ctxt)
            throws IOException, JsonProcessingException {
        String str = jp.getText().trim();
        if (str.contains("NaN")) {
            return null;
        } else {
            return _parseDate(jp, ctxt);
        }
    }
}
