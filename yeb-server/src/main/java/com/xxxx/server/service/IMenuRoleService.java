package com.xxxx.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
//import com.xxxx.pojo.MenuRole;
import com.xxxx.server.pojo.MenuRole;
import com.xxxx.server.pojo.RespBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author haopeng
 * @since 2021-07-25
 */
public interface IMenuRoleService extends IService<MenuRole> {

    RespBean updateMenuRole(Integer rid, Integer[] mids);
}
