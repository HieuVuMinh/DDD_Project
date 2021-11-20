package agentmanagement.agent.domain.model.valueobject;

import agentmanagement.agent.domain.share.ValueObject;

import javax.validation.constraints.NotNull;


public class Name implements ValueObject<Name> {

    @NotNull
    public String firstName;
    @NotNull
    public String lastName;

    public Name() {
    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Name(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public boolean isEqualTo(Name other) {

        return other != null && this.firstName.equals(other.firstName)
                && this.lastName.equals(other.lastName);
    }
}
