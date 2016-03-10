package am.gitc.service.model.convertor;

import am.gitc.service.model.dto.Token.TokenType;

import javax.persistence.AttributeConverter;

/**
 * Created by Zorik Zaqaryan on 08.03.2016.
 */
public class TokenTypeConverter implements AttributeConverter<TokenType, String> {


    @Override
    public String convertToDatabaseColumn(TokenType attribute) {
        return attribute.name();
    }

    @Override
    public TokenType convertToEntityAttribute(String name) {
        return TokenType.valueOf(name);
    }
}
