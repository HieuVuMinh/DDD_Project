package agentmanagement.agent.domain.share;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.UUID;

public abstract class RandomUUID implements ValueObject<RandomUUID> {

    @NotNull
    @Size(min = 16, max = 50)
    public String id;

    public RandomUUID() {
        this.id = UUID.randomUUID().toString();
    }

    public RandomUUID(String id){
        this.id = id;
    }

    @Override
    public boolean isEqualTo(RandomUUID other) {
        return other != null && this.id.equals(other.id);
    }
}
