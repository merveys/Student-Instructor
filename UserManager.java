public class UserManager {
    
    public void add(User user)
    {
        System.out.println("Kullanıcı eklendi :" + " "+ user.getName() +" " + user.getLastName());
    }

    public void delete(User user)
    {
        System.out.println("Kullanıcı silindi :"+ " " + user.getName() + " " + user.getLastName());
    }
}
