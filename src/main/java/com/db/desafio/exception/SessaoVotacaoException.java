package com.db.desafio.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class SessaoVotacaoException extends RuntimeException{
    public SessaoVotacaoException(String message) {
        super(message);
    }
}