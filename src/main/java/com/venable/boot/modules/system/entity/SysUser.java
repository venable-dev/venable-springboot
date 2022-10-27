package com.venable.boot.modules.system.entity;

import lombok.Data;

/**
 * user entity
 *
 * @author xc.chen
 * @date 2022/10/27 13:30
 */
@Data
public class SysUser {

    private Long id;

    private String username;

    private String password;

    private String email;
}
