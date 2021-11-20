package agentmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "agentmanagement.agent.*")
public class AgentManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgentManagementApplication.class, args);
	}

}
