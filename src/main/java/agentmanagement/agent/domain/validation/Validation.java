package agentmanagement.agent.domain.validation;

import agentmanagement.agent.domain.model.valueobject.Email;
import agentmanagement.agent.domain.model.valueobject.Phone;

public class Validation {
    public static boolean validateEmail(String email) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }

    public static boolean validatePhone(String phoneNumber) {
        String regex = "^(\\+\\d{1,3}( )?)?((\\(\\d{1,3}\\))|\\d{1,3})[- .]?\\d{3,4}[- .]?\\d{4}$";
        return phoneNumber.matches(regex);
    }
}
