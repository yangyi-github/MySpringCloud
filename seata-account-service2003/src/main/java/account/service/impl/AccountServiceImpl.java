package account.service.impl;

import account.dao.AccountDao;
import account.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * 账户业务实现类
 **/
@Slf4j
@Service
public class AccountServiceImpl implements AccountService {
    @Resource
    private AccountDao accountDao;

    @Override
    public void decrease(Long userId, BigDecimal money) {
        log.info("*******->account-service中扣减账户余额开始");
        accountDao.decrease(userId, money);
        log.info("*******->account-service中扣减账户余额结束");
        //throw new RuntimeException("模拟异常，全局事务回滚");
    }
}
