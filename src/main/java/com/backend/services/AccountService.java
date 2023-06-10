package com.backend.services;

import com.backend.models.Account;

import java.util.List;

public interface AccountService {

    public void createOrUpdateAccount(Account account);

    public List<Account> getAllAccount();

    public void deleteAccount(Long id);

    public Account getAccount(Long id);

    public Account editAccount(Long id);

    public Integer isExitsAccount(String uer_name, String pass);

    public Integer idAccount(String user_name, String pass);
}
