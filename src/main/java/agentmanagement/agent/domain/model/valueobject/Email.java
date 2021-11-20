package agentmanagement.agent.domain.model.valueobject;

import agentmanagement.agent.domain.exception.ArgumentException;
import agentmanagement.agent.domain.model.response.ErrorResponse;
import agentmanagement.agent.domain.share.ValueObject;
import agentmanagement.agent.domain.validation.Validation;
import org.springframework.http.HttpStatus;

import java.util.Collections;

public class Email implements ValueObject<Email> {

    public String email;

    public Email(String email) {
        if (!Validation.validateEmail(email)){
//            throw new ArgumentException(HttpStatus.BAD_REQUEST, Collections.singletonList(new ErrorResponse("Email is not valid")));
        }
        this.email = email;
    }

    @Override
    public boolean isEqualTo(Email other) {

        return other.email != null && other.email.equals(this.email);
    }
}
