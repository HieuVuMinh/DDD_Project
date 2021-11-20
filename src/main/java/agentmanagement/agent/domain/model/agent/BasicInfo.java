package agentmanagement.agent.domain.model.agent;

import agentmanagement.agent.domain.model.valueobject.Email;
import agentmanagement.agent.domain.model.valueobject.Name;
import agentmanagement.agent.domain.model.valueobject.Phone;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Getter
public class BasicInfo {
    public Name name;
    public Email email;
    private Phone phone;


}
