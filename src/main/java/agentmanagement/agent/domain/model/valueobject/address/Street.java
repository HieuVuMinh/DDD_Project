package agentmanagement.agent.domain.model.valueobject.address;


import agentmanagement.agent.domain.share.ValueObject;

import javax.validation.constraints.NotNull;

public class Street implements ValueObject<Street> {

    @NotNull
    public final String streetName;

    public Street(String streetName) {
        this.streetName = streetName;
    }

    @Override
    public boolean isEqualTo(Street other) {
        return false;
    }
}
