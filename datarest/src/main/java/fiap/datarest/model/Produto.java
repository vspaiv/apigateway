package fiap.datarest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data; // gera automaticamente: getters, setters, toString(), hashCode()

@Data
@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @JsonProperty("nome_produto")   
    private String nome;

    @JsonProperty("descricao_produto") 
    private String descricao;

    @JsonProperty("preco_produto") 
    private float preco;
}
