package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class UserFunctionalInterface {
    public static void main(String[] args) {


        System.out.println("----------------------------------------------------------------Supplier----------------------------------------------------------------");
//        Supplier<User> userSupplier = User::new;
//        User user  = userSupplier.get();

        Supplier<UserService> userCrudSupplier = UserService::new;
        UserService userService = userCrudSupplier.get();
        userService.getUsers().forEach(System.out::print);


        System.out.println("\n----FunctionalInterface------------------------------------------------------------Predicate----------------------------------------------------------------");
        Predicate<User> userRes  = u-> u.getSalary()>60000;
        userService.getUsers().forEach(u-> System.out.println(userRes.test(u)));


        System.out.println("\n----------------------------------------------------------------Function----------------------------------------------------------------");
        Function<User, User> userFunction = u->{
            u.setPosition(null);
            return u;
        };

//        userFunction = userFunction.andThen(u->{
//                    if(userRes.test(u)){ u.setPosition("Dev");}
//                    return u;
//        });

        Function<User, User> finalFunction = userFunction.andThen(u -> {
            if(userRes.test(u)){ u.setPosition("Dev");}
            return u;
        });

//        System.out.println(userFunction.apply(userCrud.getUsers().get(4)));
//        userCrud.getUsers().forEach(u-> System.out.println(userFunction.apply(u)));   //Not Allowed
        userService.getUsers().forEach(u-> System.out.println(finalFunction.apply(u)));


        System.out.println("----------------------------------------------------------------Consumer----------------------------------------------------------------");

//        Consumer<List<User>> userConsumer = list -> list.stream().forEach(u-> System.out.println(u));
        Consumer<List<User>> userConsumer = list -> list.forEach(System.out::println);
        userConsumer.accept(userService.getUsers());
    }
}


class UserService {

    private List<User> users = Arrays.asList(
            new User(1, "sambhaji", "Dev", 91234.54),
            new User(2, "Me", "QA", 76543),
            new User(3, "Pooja", "AWS", 54321),
            new User(4, "Savita", "PBI", 42332),
            new User(5, "Sagar", "SAP", 787634)
    );

    public List<User> getUsers(){
        return  this.users;
    }

    public Boolean createUser(User user){
        return this.users.add(user);
    }

    public User deleteUser(int id){
        return this.users.remove(id);
    }

}


class User{
    private int id;
    private String name;
    private String position;
    private double salary;

    public User() {
    }

    public User(int id, String name, String position, double salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "\n{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}