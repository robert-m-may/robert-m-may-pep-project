package Service;

import Model.Account;
import DAO.AccountDAO;

public class AccountService {

    AccountDAO accountDAO;

    public AccountService() {
        this.accountDAO = new AccountDAO();
    }

    public AccountService(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    public Account registerUser(Account account) {
        return this.accountDAO.registerUser(account);
    }

    public Account loginUser(Account account) {
        return this.accountDAO.loginUser(account);
    }
    
}
