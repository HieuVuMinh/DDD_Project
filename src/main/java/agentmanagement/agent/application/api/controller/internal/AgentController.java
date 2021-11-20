package agentmanagement.agent.application.api.controller.internal;

import agentmanagement.agent.application.api.mapper.AgentDtoMapper;
import agentmanagement.agent.application.api.response.dto.AgentResponseDto;
import agentmanagement.agent.domain.model.agent.Agent;
import agentmanagement.agent.domain.model.agent.AgentResponse;
import agentmanagement.agent.domain.model.agent.valueobject.AgentId;
import agentmanagement.agent.domain.service.IAgentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/agent")
@RequiredArgsConstructor
public class AgentController {

    @Autowired
    IAgentService agentService;

    @Autowired
    AgentDtoMapper agentDtoMapper;

    @PostMapping
    public AgentResponseDto saveAgent(@RequestBody Agent agent){
        return agentDtoMapper.to(agentService.createAgent(agent));
    }

    @GetMapping
    public List<AgentResponseDto> getAllAgents() {
        List<AgentResponseDto> agents = new ArrayList<>();
        agentService.getAllAgent().forEach(agent -> {
            agents.add(agentDtoMapper.to(agent));
        });
        return agents;
    }

    @GetMapping("{id}")
    public AgentResponseDto findByAgentId(@PathVariable("id") AgentId agentId){
        AgentResponse agentResponse = agentService.getAgentById(agentId);
        return agentDtoMapper.to(agentResponse);
    }

    @DeleteMapping("{id}")
    public void deleteAgent(@PathVariable("id") AgentId agentId){
        agentService.deleteAgent(agentId);
    }
}
