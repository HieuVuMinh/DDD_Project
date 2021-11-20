package agentmanagement.agent.domain.model.valueobject;

import agentmanagement.agent.domain.share.ValueObject;

public class Phone implements ValueObject<Phone> {

    public String phoneNumber;

    @Override
    public boolean isEqualTo(Phone other) {

        return phoneNumber != null && phoneNumber.equals(other.phoneNumber);
    }
}
