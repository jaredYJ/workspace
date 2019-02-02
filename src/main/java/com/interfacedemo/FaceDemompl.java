package com.interfacedemo;

import com.workspace.TestUser;

import java.util.List;

public class FaceDemompl implements FaceDemo,ClassDemo{
    @Override
    public String getName(Integer id) {
        return null;  //业务层，调取DIO
    }

    @Override
    public List<TestUser> getUsers(Integer id) {
        return null;
    }
}
