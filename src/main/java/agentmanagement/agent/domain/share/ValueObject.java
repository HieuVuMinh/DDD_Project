package agentmanagement.agent.domain.share;

import java.io.Serializable;

public interface ValueObject<T> extends Serializable {
    boolean isEqualTo(T other);
}
