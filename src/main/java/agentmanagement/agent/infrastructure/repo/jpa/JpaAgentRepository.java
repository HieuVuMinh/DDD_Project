package agentmanagement.agent.infrastructure.repo.jpa;

import agentmanagement.agent.domain.model.agent.Agent;
import agentmanagement.agent.domain.model.agent.AgentResponse;
import agentmanagement.agent.domain.model.agent.valueobject.AgentId;
import agentmanagement.agent.domain.repositories.AgentRepository;
import agentmanagement.agent.infrastructure.repo.mapper.IAgentMapper;
import agentmanagement.agent.infrastructure.repo.model.JpaAgent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JpaAgentRepository implements AgentRepository {

    @Autowired
    private IAgentRepository agentRepository;

    @Autowired
    private IAgentMapper mapper;


    @Override
    public Agent createAgent(Agent agent) {
        JpaAgent jpaAgent = mapper.to(agent);
        return mapper.to(agentRepository.save(jpaAgent));
    }

    @Override
    public Agent updateAgent(Agent agent) {
        return null;
    }

    @Override
    public List<Agent> getAgentList() {
        List<Agent> agentList = new ArrayList<>();
        agentRepository.findAll().forEach(jpaAgent -> agentList.add(mapper.to(jpaAgent)));
        return agentList;
    }

    @Override
    public AgentResponse getAgentById(AgentId agentId) {

        JpaAgent jpaAgent = agentRepository.findById(agentId.id).orElse(null);
        AgentResponse agentResponse = mapper.toAgentResponse(jpaAgent);
        return agentResponse;
    }

    @Override
    public void deleteAgent(AgentId agentId) {
        JpaAgent jpaAgent = agentRepository.getById(agentId.id);
        if (jpaAgent != null){
            agentRepository.deleteById(agentId.id);
        }
    }
}
