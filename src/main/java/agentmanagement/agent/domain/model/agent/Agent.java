package agentmanagement.agent.domain.model.agent;

import agentmanagement.agent.domain.model.agent.valueobject.AgentId;
import agentmanagement.agent.domain.model.agent.valueobject.DetailsInfo;
import agentmanagement.agent.domain.share.AggregateRoot;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Agent extends AggregateRoot<Agent, AgentId> {

    public BasicInfo basicInfo;

    public DetailsInfo detailsInfo;

    public Agent(AgentId entityId) {
        super(entityId);
    }

    public Agent() {
        super(new AgentId());
    }

}
