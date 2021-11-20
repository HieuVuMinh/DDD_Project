package agentmanagement.agent.domain.share;

import java.io.Serializable;

public interface Entity <E, ID extends Serializable> {

    ID id();

    boolean isEqualTo(E entity);
}
