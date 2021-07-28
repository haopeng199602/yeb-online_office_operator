package com.xxxx.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
//import com.xxxx.pojo.Department;
import com.xxxx.server.pojo.Department;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author haopeng
 * @since 2021-07-25
 */
public interface IDepartmentService extends IService<Department> {

    List<Department> getAllDepartments();
}
