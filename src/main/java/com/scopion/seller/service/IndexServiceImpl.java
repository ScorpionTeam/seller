package com.scopion.seller.service;


import com.scopion.seller.domain.Seller;
import com.scopion.seller.mapper.IndexMapper;
import com.scopion.seller.result.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ycj
 * @version V1.0 <测试>
 * @date 2017-12-07 11:16
 */
@Service
public class IndexServiceImpl implements IndexService {

    @Autowired
    IndexMapper indexMapper;

    @Override
    public BaseResult test() {
        List<Seller> seller = indexMapper.findAll();
        return BaseResult.success(seller);
    }
}
