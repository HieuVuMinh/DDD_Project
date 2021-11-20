package agentmanagement.agent.infrastructure.repo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class JpaAgent {

    @Id
    public String agent_id;
    public String first_name;
    public String last_name;
    public String email;
//    private String  phone_number;
//    private String  street;
//    private String  region;
//    private String  country;
//    private Career career;


}
