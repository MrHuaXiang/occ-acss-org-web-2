package com.ccb.occ.cloud.service;

import com.ccb.occ.cloud.entity.SysPermission;
import com.ccb.occ.cloud.mapper.SysPermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mr.hua
 * @version v1.0.0
 * @description
 * @date Created in 2019/8/30 17:21
 */

@Service
public class SysPermissionService {
    @Autowired
    private SysPermissionMapper permissionMapper;

    /**
     * 获取指定角色所有权限
     */
    public List<SysPermission> listByRoleId(Integer roleId) {
        return permissionMapper.listByRoleId(roleId);
    }
}
