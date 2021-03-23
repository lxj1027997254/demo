package com.example.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Set;

/**
 * Created by LXJ on 2021-03-19.
 */
@Data
@AllArgsConstructor
public class User {
    private String id;
    private String userName;
    private String password;
    /**
     * 用户对应的角色集合
     */
    private Set<Role> roles;
}
