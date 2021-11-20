package agentmanagement.agent.domain.repositories;

import agentmanagement.agent.domain.model.agent.Agent;
import agentmanagement.agent.domain.model.agent.AgentResponse;
import agentmanagement.agent.domain.model.agent.valueobject.AgentId;
import agentmanagement.agent.infrastructure.repo.model.JpaAgent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AgentRepository {

    Agent createAgent(Agent agent);

    Agent updateAgent(Agent agent);

    List<Agent> getAgentList();

    AgentResponse getAgentById(AgentId agentId);

    void deleteAgent(AgentId agentId);
}
