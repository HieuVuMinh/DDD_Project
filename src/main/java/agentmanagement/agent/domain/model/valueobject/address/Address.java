package agentmanagement.agent.domain.model.valueobject.address;

import lombok.Getter;

@Getter
public class Address {

    private Street street;

    private Region region;

    private Country country;
}
