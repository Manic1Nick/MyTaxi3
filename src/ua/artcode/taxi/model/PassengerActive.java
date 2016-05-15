package ua.artcode.taxi.model;

import java.util.Collection;
import java.util.List;

public interface PassengerActive {

    String getId();
    void setId(String id);

    String getPhone();
    void setPhone(String phone);

    String getPass();
    void setPass(String pass);

    String getName();
    void setName(String name);

    Address getHomeAddress();
    void setHomeAddress(Address homeAddress);

    Collection<Long> getOrderIds();
    void setOrderIds(List<Long> orderIds);

    String toString();
}
