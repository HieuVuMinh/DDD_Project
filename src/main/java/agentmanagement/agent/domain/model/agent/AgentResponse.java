package agentmanagement.agent.domain.model.agent;

import agentmanagement.agent.domain.model.agent.valueobject.DetailsInfo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AgentResponse {

    public String agentId;

    public BasicInfo basicInfo;

    public DetailsInfo detailsInfo;
}
