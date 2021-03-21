package storage.service.impl;

import storage.dao.StorageDao;
import storage.service.StorageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StorageServiceImpl implements StorageService {

    @Resource
    private StorageDao storageDao;

    /**
     * 减库存
     */
    @Override
    public void decrease(Long productId, Integer count) {
        storageDao.decrease(productId, count);
    }
}
