package com.xxxx.service.impl;

import com.xxxx.pojo.Admin;
import com.xxxx.mapper.AdminMapper;
import com.xxxx.service.IAdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author haopeng
 * @since 2021-07-26
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements IAdminService {

}
