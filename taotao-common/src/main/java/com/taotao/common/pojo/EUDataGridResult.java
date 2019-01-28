package com.taotao.common.pojo;

import java.util.List;

/**
 * author：  刘涛
 *
 * @create 2019-01-25 21:13
 */
public class EUDataGridResult {
    private long total;
    private List<?> rows;

    public long getTotal() {
        return total;
    }
    public void setTotal(long total) {
        this.total = total;
    }
    public List<?> getRows() {
        return rows;
    }
    public void setRows(List<?> rows) {
        this.rows = rows;
    }

}
