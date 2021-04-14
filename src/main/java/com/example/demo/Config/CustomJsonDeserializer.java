package com.example.demo.Config;

import org.springframework.kafka.support.serializer.JsonDeserializer;

public class CustomJsonDeserializer extends JsonDeserializer {
    public CustomJsonDeserializer() {
        super();
        this.addTrustedPackages("*");
    }
}
