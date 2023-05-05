package nocoders.courseworkdb.enums;


public enum AccountType {
    ADMIN("admin"),
    USER("user");

    private final String accountType;

    private AccountType(String accountType){
        this.accountType=accountType;
    }

    public String getAccountType() {
        return accountType;
    }
}

