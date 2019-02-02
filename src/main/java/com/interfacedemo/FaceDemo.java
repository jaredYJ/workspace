package com.interfacedemo;

import com.workspace.TestUser;
import org.junit.Test;

import java.util.List;

public interface FaceDemo  {
    public String getName(Integer id);
    public List<TestUser> getUsers(Integer id);
}
