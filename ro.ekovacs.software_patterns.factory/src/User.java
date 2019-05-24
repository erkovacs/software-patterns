public abstract class User {

    private int id;
    private String name;
    private float money;

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

    public User(){
    }

    public User(int id, String name, float money){
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public float withdraw(float sum){
        money -= sum;
        return sum;
    }

    public float deposit(float sum){
        money += sum;
        return money;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
