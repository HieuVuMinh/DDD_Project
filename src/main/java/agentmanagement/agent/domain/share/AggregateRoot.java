package agentmanagement.agent.domain.share;

import java.io.Serializable;

public abstract class AggregateRoot<E, ID extends Serializable> {

    public ID entityId;

    protected AggregateRoot(ID entityId) {
        this.entityId = entityId;
    }
}
