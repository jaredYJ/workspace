package com.interfacedemo;

import com.workspace.TestUser;

import java.util.List;

public interface ClassDemo {
    public abstract String getName(Integer id);

    public List<TestUser> getUsers(Integer id);
}
