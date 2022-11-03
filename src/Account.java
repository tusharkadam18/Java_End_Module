public class Account {
    String account_type;
    long account_no;
    int minimum_b;
    int current_b;

    public Account() {
    }

    public Account(String account_type, long account_no, int minimum_b, int current_b) {
        this.account_type = account_type;
        this.account_no = account_no;
        this.minimum_b = minimum_b;
        this.current_b = current_b;
    }

    public String getAccount_type() {
        return account_type;
    }

    public long getAccount_no() {
        return account_no;
    }

    public int getMinimum_b() {
        return minimum_b;
    }

    public int getCurrent_b() {
        return current_b;
    }
}
