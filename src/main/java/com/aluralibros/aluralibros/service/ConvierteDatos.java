package com.aluralibros.aluralibros.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

@Service
public class ConvierteDatos implements IConvierteDatos{
    private ObjectMapper objectMapper = new ObjectMapper();
    @Override
    public <T> T obtenerDatos(String json, Class<T> clase) {
        try{
            return objectMapper.readValue(json, clase);
        }catch (JsonProcessingException ex){
            throw new RuntimeException(ex);
        }
    }
}
