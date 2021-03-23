package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

/**
 * Created by LXJ on 2021-03-19.
 */
@Data
@AllArgsConstructor
public class Role {
    private String id;
    private String roleName;
    /**
     * 角色对应权限集合
     */
    private Set<Permissions> permissions;
}
