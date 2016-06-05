package taxi.dao;

import taxi.model.Order;
import taxi.model.OrderStatus;
import taxi.model.User;

import java.util.Collection;
import java.util.List;

public interface OrderDao {

    Order create(User user, Order order);
    Collection<Order> getAll();
    Order update(Order newOrder);
    Order delete(long id);

    Order find(long id);
    List<Order> getOrdersByStatus(OrderStatus status);
    Order addToDriver(User user, Order order);
}
