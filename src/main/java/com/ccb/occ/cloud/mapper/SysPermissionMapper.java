package com.ccb.occ.cloud.mapper;

import com.ccb.occ.cloud.entity.SysPermission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Mr.hua
 * @version v1.0.0
 * @description
 * @date Created in 2019/8/30 17:19
 */

@Mapper
public interface SysPermissionMapper {
    @Select("SELECT * FROM sys_permission WHERE role_id=#{roleId}")
    List<SysPermission> listByRoleId(Integer roleId);
}