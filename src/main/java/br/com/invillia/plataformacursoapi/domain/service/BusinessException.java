package br.com.invillia.plataformacursoapi.domain.service;

public class BusinessException extends RuntimeException{
    public BusinessException(String message){
        super(message);
    }
}
