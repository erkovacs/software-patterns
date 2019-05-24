public class AdminUser extends User {
    public AdminUser(int id, String name, float money) {
        super(id, name, money);
    }

    float applyPenalty(float sum, User user){
        return user.withdraw(sum);
    }
}
