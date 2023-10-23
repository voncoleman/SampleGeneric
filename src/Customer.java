public class Customer {
    private int id;
    private String name;
    private String userId;
    private String email;
    private String password;

    public Customer (int id, String name, String userId, String email, String password){
        this.id = id;
        this.name = name;
        this.userId = userId;
        this.email = email;
        this.email = password;
    }

    /**
     * Getters uploaded using Source Action.
     */
    public Customer() {
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getUserId() {
        return userId;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    
}
