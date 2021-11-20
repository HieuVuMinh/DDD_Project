package agentmanagement.agent.domain.service;

import agentmanagement.agent.domain.model.agent.Agent;
import agentmanagement.agent.domain.model.agent.AgentResponse;
import agentmanagement.agent.domain.model.agent.valueobject.AgentId;

import java.util.List;

public interface IAgentService {
    Agent createAgent(Agent agent);

    Agent updateAgent(Agent agent);

    List<Agent> getAllAgent();

    AgentResponse getAgentById(AgentId agentId);

    void deleteAgent(AgentId agentId);
}
