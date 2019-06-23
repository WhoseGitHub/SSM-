package cn.yuanyinzhou.service;

import cn.yuanyinzhou.domain.Account;

import java.util.List;

public interface AccountService {
    //查询所有帐户
    public List<Account> findAll();

    //保存账户信息
    public void saveAccount(Account accont);

}
