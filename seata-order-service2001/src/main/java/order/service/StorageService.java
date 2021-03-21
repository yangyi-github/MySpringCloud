package order.service;

import order.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 库存服务
 **/
@FeignClient(value = "seata-storage-service")
public interface StorageService {
    /**
     * 减库存
     */
    @PostMapping(value = "storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
