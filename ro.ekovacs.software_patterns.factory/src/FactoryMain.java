public class FactoryMain {
    public static void main(String [] args){
        // Let the factory create two users of different types
        User admin  = UserFactory.makeUser("admin", 1, "Adam", 200);
        User it  = UserFactory.makeUser("it", 2, "Sam", 250);
        System.out.println("The Admin " + admin + " " + admin.getClass());
        System.out.println("IT User " + it + " " + it.getClass());

        // apply a penalty to IT User
        float penalty = ((AdminUser) admin).applyPenalty(102, it);
        System.out.println("Penalty applied: " + penalty);
        System.out.println("IT User " + it + " " + it.getClass());
    }
}
