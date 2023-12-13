package pojobeans;

public interface AccountRepsitory {
    void insert (Account account);
    void  update (Account account);
    Account find (long accountId);
}
