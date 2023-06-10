package com.backend.services;

import com.backend.models.Account;
import com.backend.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountRepository accountRepository;
    @Override
    public void createOrUpdateAccount(Account account) {
        accountRepository.save(account);
    }

    @Override
    public List<Account> getAllAccount() {
        List<Account> list = accountRepository.findAll();
        return list;
    }

    @Override
    public void deleteAccount(Long id) {
        accountRepository.deleteById(id);
    }

    @Override
    public Account getAccount(Long id) {
        return accountRepository.findById(id).get();
    }

    @Override
    public Account editAccount(Long id) {
        return accountRepository.getOne(id);
    }

    @Override
    public Integer isExitsAccount(String user_name, String pass) {
        return accountRepository.isExitsAccount(user_name, pass);
    }

    @Override
    public Integer idAccount(String user_name, String pass) {
        return accountRepository.idAccount(user_name, pass);
    }
}
