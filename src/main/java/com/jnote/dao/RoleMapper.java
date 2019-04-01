package com.jnote.dao;

import com.jnote.model.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.jnote.model.Role;
import java.util.List;

@Mapper
public interface RoleMapper {
    int addRoles(@Param("roles") String[] roles, @Param("member_id") Long member_id);

    List<Role> getRolesByMemberid(Long member_id);
}