package agentmanagement.agent.domain.model.valueobject.address;


import agentmanagement.agent.domain.share.ValueObject;

import javax.validation.constraints.NotNull;

public class Region implements ValueObject<Region> {

    @NotNull
    public final String region;

    public Region(String region) {
        this.region = region;
    }

    @Override
    public boolean isEqualTo(Region other) {
        return false;
    }
}
