package com.xxxx.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
//import com.xxxx.pojo.Department;
import com.xxxx.server.pojo.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author haopeng
 * @since 2021-07-25
 */
@Mapper
public interface DepartmentMapper extends BaseMapper<Department> {

    List<Department> getAllDepartments();
}
