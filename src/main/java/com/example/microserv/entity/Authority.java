package com.example.microserv.entity;

import org.springframework.security.core.GrantedAuthority;

public class Authority implements GrantedAuthority{
    private String authority;

    @Override
    public String getAuthority(){
        return authority;
    }

    public void setAuthority(String authority){
        this.authority = authority;
    }

    public Authority(String pAuthority){
        this.authority = pAuthority;
    }
}
