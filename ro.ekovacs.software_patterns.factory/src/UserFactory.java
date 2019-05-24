public class UserFactory {
    static User makeUser(String type, int id, String name, float money){

        User user = null;

        if("admin".equals(type)){
            user  = new AdminUser(id, name, money);
        } else if ("it".equals(type)) {
            user = new ITUser(id, name, money);
        }

        return user;
    }
}
