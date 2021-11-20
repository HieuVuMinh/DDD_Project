package agentmanagement.agent.domain.model.agent.valueobject;

import agentmanagement.agent.domain.model.valueobject.Career;
import agentmanagement.agent.domain.model.valueobject.IdCard;
import agentmanagement.agent.domain.model.valueobject.Level;
import agentmanagement.agent.domain.model.valueobject.address.Address;
import lombok.Getter;

@Getter
public class DetailsInfo {

    private Address address;

    private Career career;

    private Level level;

    private IdCard idCard;
}
