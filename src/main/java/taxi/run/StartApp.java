package taxi.run;

import taxi.dao.AppDB;
import taxi.dao.OrderDaoInnerDbImpl;
import taxi.dao.UserDaoInnerDbImpl;
import taxi.service.UserService;
import taxi.service.UserServiceImpl;
import taxi.service.ValidatorImpl;
import taxi.view.UserLogin;

public class StartApp {


    public static void main(String[] args) {
        UserService userService = new UserServiceImpl(new UserDaoInnerDbImpl(new AppDB()),
                                            new OrderDaoInnerDbImpl(new AppDB()),
                                                    new ValidatorImpl(new AppDB()));
        new UserLogin(userService);

    }
}
