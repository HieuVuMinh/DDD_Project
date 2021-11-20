package agentmanagement.agent.infrastructure.repo.mapper;

import agentmanagement.agent.domain.model.agent.Agent;
import agentmanagement.agent.domain.model.agent.AgentResponse;
import agentmanagement.agent.infrastructure.repo.model.JpaAgent;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IAgentMapper {

    @Mapping(source = "entityId.id", target = "agent_id")
    @Mapping(source = "basicInfo.name.firstName", target = "first_name")
    @Mapping(source = "basicInfo.name.lastName", target = "last_name")
    @Mapping(source = "basicInfo.email.email", target = "email")
    JpaAgent to(Agent agent);

//    @Mapping(source = "agent_id", target = "entityId.id")
    @Mapping(source = "first_name", target = "basicInfo.name.firstName")
    @Mapping( source = "last_name", target = "basicInfo.name.lastName")
    @Mapping(source = "email", target = "basicInfo.email.email")
    Agent to(JpaAgent jpaAgent);


    @Mapping(source = "agent_id", target = "agentId")
    @Mapping(source = "first_name", target = "basicInfo.name.firstName")
    @Mapping( source = "last_name", target = "basicInfo.name.lastName")
    @Mapping(source = "email", target = "basicInfo.email.email")
    AgentResponse toAgentResponse(JpaAgent jpaAgent);


//    default String uuidToString(String uuid);

//    default String agentIdToString(AgentId agentId){
//        return agentId.id;
//    }

}
