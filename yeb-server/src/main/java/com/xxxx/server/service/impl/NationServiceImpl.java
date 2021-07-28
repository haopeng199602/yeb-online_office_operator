package com.xxxx.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
//import com.xxxx.mapper.NationMapper;
//import com.xxxx.pojo.Nation;
import com.xxxx.server.mapper.NationMapper;
import com.xxxx.server.pojo.Nation;
import com.xxxx.server.service.INationService;
//import com.xxxx.service.INationService;
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
public class NationServiceImpl extends ServiceImpl<NationMapper, Nation> implements INationService {

}
