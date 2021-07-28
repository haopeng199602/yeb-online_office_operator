package com.xxxx.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
//import com.xxxx.mapper.MailLogMapper;
//import com.xxxx.pojo.MailLog;
import com.xxxx.server.mapper.MailLogMapper;
import com.xxxx.server.pojo.MailLog;
import com.xxxx.server.service.IMailLogService;
//import com.xxxx.service.IMailLogService;
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
public class MailLogServiceImpl extends ServiceImpl<MailLogMapper, MailLog> implements IMailLogService {

}
