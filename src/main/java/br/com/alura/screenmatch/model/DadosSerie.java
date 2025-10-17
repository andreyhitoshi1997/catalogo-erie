package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*Ignora o que ele não encontrar*/
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosSerie (
        @JsonAlias("Title") String titulo,
        @JsonAlias("totalSeasons") Integer totalTemporadas,
        @JsonAlias("imdbRating") String avaliacao
        /*@JsonProperty: Mapeia nome lógico de propriedade para JSON em serialização e desserialização.
        * @JsonProperty("nomeCompleto")
          private String nome;*/
){
}
