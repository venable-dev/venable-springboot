package com.venable.boot.modules.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.venable.boot.modules.system.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * SysUserMapper
 *
 * @author xc.chen
 * @date 2022/10/27 13:55
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {
}
