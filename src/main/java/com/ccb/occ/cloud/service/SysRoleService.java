package com.ccb.occ.cloud.service;

import com.ccb.occ.cloud.entity.SysRole;
import com.ccb.occ.cloud.mapper.SysRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Mr.hua
 * @version v1.0.0
 * @description
 * @date Created in 2019/8/30 14:56
 */
@Service
public class SysRoleService {
    @Autowired
    private SysRoleMapper roleMapper;

    public SysRole selectById(Integer id) {
        return roleMapper.selectById(id);
    }

    public SysRole selectByName(String name) {
        return roleMapper.selectByName(name);
    }
}
