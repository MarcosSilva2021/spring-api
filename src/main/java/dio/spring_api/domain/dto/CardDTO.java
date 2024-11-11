package dio.spring_api.domain.dto;

import dio.spring_api.domain.model.Card;

import java.math.BigDecimal;

public record CardDTO(Long id, String number, BigDecimal limit) {

    public Card toModel(){
        Card model = new Card();
        model.setId(this.id);
        model.setNumber(this.number);
        model.setLimit(this.limit);
        return model;
    }
}
