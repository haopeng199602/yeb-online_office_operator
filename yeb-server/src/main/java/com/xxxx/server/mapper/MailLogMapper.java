package com.xxxx.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
//import com.xxxx.pojo.MailLog;
import com.xxxx.server.pojo.MailLog;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author haopeng
 * @since 2021-07-25
 */
@Mapper
public interface MailLogMapper extends BaseMapper<MailLog> {

}
