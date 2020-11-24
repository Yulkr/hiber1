import models.Auto;
import models.User;
import services.UserService;

import java.sql.SQLException;
public class main {

    public static void main(String[] args) throws SQLException {

        UserService userService = new UserService();
        User user = new User("Misha",26);
        userService.saveUser(user);
        Auto reno = new Auto("Reno", "red");
        reno.setUser(user);
        user.addAuto(reno);
        Auto ford = new Auto("Ford", "black");
        ford.setUser(user);
        user.addAuto(ford);
        userService.updateUser(user);

        System.out.println(userService.findUser(26).getAutos() + user.getName());
    }
}
