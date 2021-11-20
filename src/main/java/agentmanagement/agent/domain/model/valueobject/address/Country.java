package agentmanagement.agent.domain.model.valueobject.address;


import agentmanagement.agent.domain.share.ValueObject;

import javax.validation.constraints.NotNull;

public class Country implements ValueObject<Country> {

    @NotNull
    public final String country;

    public Country(String country) {
        this.country = country;
    }

    @Override
    public boolean isEqualTo(Country other) {
        return false;
    }
}
