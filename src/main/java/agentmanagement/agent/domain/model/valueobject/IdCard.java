package agentmanagement.agent.domain.model.valueobject;

import agentmanagement.agent.domain.share.ValueObject;

import java.util.Date;

public class IdCard implements ValueObject<IdCard> {

    public final String idCard;
    public Date receivedDate;
    public Date expirationDate;

    public IdCard(String idCard) {
        this.idCard = idCard;
    }

    @Override
    public boolean isEqualTo(IdCard other) {
        return other.idCard != null && other.idCard.equals(idCard);
    }
}
