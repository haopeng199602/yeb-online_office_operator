package com.xxxx.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
//import com.xxxx.mapper.RoleMapper;
//import com.xxxx.pojo.Role;
import com.xxxx.server.mapper.RoleMapper;
import com.xxxx.server.pojo.Role;
import com.xxxx.server.service.IRoleService;
//import com.xxxx.service.IRoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author haopeng
 * @since 2021-07-25
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
