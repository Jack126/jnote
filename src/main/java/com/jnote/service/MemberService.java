package com.jnote.service;

import com.jnote.model.Role;
import com.jnote.model.Member;
import com.jnote.dao.MemberMapper;
import com.jnote.dao.RoleMapper;
import com.jnote.utils.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;
import java.util.List;

/**
 * @author jack126 https://github.com/Jack126
 * @classname MemberService
 * @description TODO
 * @date 2019/4/1 21:52
 */

@Service
@Transactional
public class MemberService {
    @Autowired
    MemberMapper memberMapper;
    @Autowired
    RoleMapper roleMapper;

    public UserDetails loadMemberByName(String s) throws UsernameNotFoundException{
        Member member = memberMapper.loadMemberByName(s);
        if(member == null){
            return new Member();
        }
        List<Role> roles = roleMapper.getRolesByMemberid(member.getId());
        member.setRoles(roles);
        return member;
    }
}
