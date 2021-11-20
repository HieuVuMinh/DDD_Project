package agentmanagement.agent.infrastructure.repo.jpa;

import agentmanagement.agent.domain.model.agent.valueobject.AgentId;
import agentmanagement.agent.infrastructure.repo.model.JpaAgent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IAgentRepository extends JpaRepository<JpaAgent, String> {

    @Override
    Optional<JpaAgent> findById(String s);
}
