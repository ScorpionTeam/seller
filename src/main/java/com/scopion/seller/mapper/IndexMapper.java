package com.scopion.seller.mapper;

import com.scopion.seller.domain.Seller;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author ycj
 * @version V1.0 <>
 * @date 2017-12-07 11:18
 */
@Mapper
public interface IndexMapper {

    /**sss
     * @return
     */
    List<Seller> findAll();
}
