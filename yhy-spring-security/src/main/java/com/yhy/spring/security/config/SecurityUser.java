package com.yhy.spring.security.config;

import com.yhy.spring.security.domain.SysRole;
import com.yhy.spring.security.domain.SysUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/**
 * @author yhy
 * date : 2017/12/1
 */
public class SecurityUser extends SysUser implements UserDetails {
    private static final long serialVersionUID = 1L;
    public SecurityUser(SysUser suser) {
        if(suser != null)
        {
            this.setId(suser.getId());
            this.setName(suser.getName());
            this.setEmail(suser.getEmail());
            this.setPassword(suser.getPassword());
            this.setDob(suser.getDob());
            this.setSysRoles(suser.getSysRoles());
        }
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {

        Collection<GrantedAuthority> authorities = new ArrayList<>();
        Set<SysRole> userRoles = this.getSysRoles();

        if(userRoles != null)
        {
            for (SysRole role : userRoles) {
                SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role.getName());
                authorities.add(authority);
            }
        }
        return authorities;
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public String getUsername() {
        return super.getName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
