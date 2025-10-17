package br.com.alura.screenmatch.service;

public interface IConverteDados {
    /*Esse <T> é generico, quando eu não especifico um tipo escpecifico, e
    */
    <T> T obterDados(String json, Class<T> classe);
}
