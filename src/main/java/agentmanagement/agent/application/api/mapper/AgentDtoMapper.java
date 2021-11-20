package agentmanagement.agent.application.api.mapper;

import agentmanagement.agent.application.api.response.dto.AgentResponseDto;
import agentmanagement.agent.domain.model.agent.Agent;
import agentmanagement.agent.domain.model.agent.AgentResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface AgentDtoMapper {

    @Mapping(source = "agent.entityId.id", target = "agentId")
    @Mapping(source = "agent.basicInfo.name.firstName", target = "firstName")
    @Mapping(source = "agent.basicInfo.name.lastName", target = "lastName")
    @Mapping(source = "agent.basicInfo.email.email", target = "email")
    AgentResponseDto to(Agent agent);

    @Mapping(source = "agentResponse.agentId", target = "agentId")
    @Mapping(source = "agentResponse.basicInfo.name.firstName", target = "firstName")
    @Mapping(source = "agentResponse.basicInfo.name.lastName", target = "lastName")
    @Mapping(source = "agentResponse.basicInfo.email.email", target = "email")
    AgentResponseDto to(AgentResponse agentResponse);

}
