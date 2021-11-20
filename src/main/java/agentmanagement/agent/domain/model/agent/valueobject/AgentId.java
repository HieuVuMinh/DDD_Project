package agentmanagement.agent.domain.model.agent.valueobject;

import agentmanagement.agent.domain.share.RandomUUID;

public class AgentId extends RandomUUID {

    public AgentId(){
        super();
    }

    public AgentId(String id) {
        super(id);
    }


}
