package com.jnote.service;

import com.jnote.model.JnoteRole;
import com.jnote.model.JnoteUser;
import com.jnote.mapper.JnoteRoleMapper;
import com.jnote.mapper.JnoteUserMapper;
import com.jnote.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import java.util.List;

@Service
@Transactional
public class UserService implements UserDetailsService{
	@Autowired
    JnoteUserMapper jnoteuserMapper;
    @Autowired
    JnoteRoleMapper jnoteroleMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        JnoteUser user = jnoteuserMapper.loadUserByUserName(s);
        if (user == null) {
            //避免返回null，这里返回一个不含有任何值的User对象，在后期的密码比对过程中一样会验证失败
            return new JnoteUser();
        }
        //查询用户的角色信息，并返回存入user中
        List<JnoteRole> roles = jnoteroleMapper.getRolesByUserid(user.getId());
        user.setRoles(roles);
        return user;
    }

}
