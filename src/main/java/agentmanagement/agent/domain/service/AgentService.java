package agentmanagement.agent.domain.service;

import agentmanagement.agent.domain.model.agent.Agent;
import agentmanagement.agent.domain.model.agent.AgentResponse;
import agentmanagement.agent.domain.model.agent.valueobject.AgentId;
import agentmanagement.agent.domain.repositories.AgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AgentService implements IAgentService {

    @Autowired
    AgentRepository agentRepository;

    @Override
    public Agent createAgent(Agent agent) {
        return agentRepository.createAgent(agent);
    }

    @Override
    public Agent updateAgent(Agent agent) {
        return null;
    }

    @Override
    public List<Agent> getAllAgent() {
        return agentRepository.getAgentList();
    }

    @Override
    public AgentResponse getAgentById(AgentId agentId) {
        return agentRepository.getAgentById(agentId);
    }

    @Override
    public void deleteAgent(AgentId agentId) {
        agentRepository.deleteAgent(agentId);
    }
}
