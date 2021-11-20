package agentmanagement.agent.domain.exception;

import agentmanagement.agent.domain.model.response.ErrorResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.List;

@AllArgsConstructor
public class ArgumentException extends RuntimeException {
    private HttpStatus statusCode;
    private List<ErrorResponse> errorResponses;
}
