package com.taotao.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author：  刘涛
 *
 * @create 2019-01-25 19:07
 */
@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private TbItemMapper itemMapper;

    @Override
    public TbItem getItemById(long itemId) {
        TbItemExample example=new TbItemExample();
        //创建查询条件
        TbItemExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(itemId);
        List<TbItem> list = itemMapper.selectByExample(example);
        if (list!=null && list.size()>0){
            TbItem tbItem = list.get(0);
            return tbItem;
        }
        return null;
    }

    //
    @Override
    public EUDataGridResult findItemList(int page, int rows) {
        TbItemExample example=new TbItemExample();
        PageHelper.startPage(page,rows);
        List<TbItem> list = itemMapper.selectByExample(example);
        PageInfo<TbItem> itemList=new PageInfo<TbItem>(list);
        EUDataGridResult euDataGridResult=new EUDataGridResult();
        euDataGridResult.setTotal(itemList.getTotal());
        euDataGridResult.setRows(list);
        return euDataGridResult;
    }
}
