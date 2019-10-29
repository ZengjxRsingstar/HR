package org.sang.mapper;

import org.sang.bean.Menu;

import java.util.List;

/**
 * Created by sang on 2017/12/28.
 */
public interface MenuMapper {
    List<Menu> getAllMenu();//获取所有菜单

    List<Menu> getMenusByHrId(Long hrId);//通过hr  id  查询菜单

    List<Menu> menuTree();//

    List<Long> getMenusByRid(Long rid);
}
