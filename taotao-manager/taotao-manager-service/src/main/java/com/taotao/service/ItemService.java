package com.taotao.service;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.pojo.TbItem;

/**
 * author：  刘涛
 *
 * @create 2019-01-25 19:06
 */
public interface ItemService {

    //整合测试：按照id查询商品信息
    public TbItem getItemById(long itemId);

    //分页查询商品列表
    public EUDataGridResult findItemList(int page,int rows);
}
