package taxi.service;

import taxi.exception.InputDataWrongException;
import taxi.exception.RegisterException;
import taxi.model.Address;
import taxi.model.UserIdentifier;

public interface Validator {

    boolean validateLogin(String phone, String password) throws Exception;
    boolean validateRegistration(String phone) throws RegisterException;
    boolean validateAddress(Address address) throws InputDataWrongException;
    boolean validateChangeRegistration(UserIdentifier identifier, int id, String phone) throws RegisterException;
}
