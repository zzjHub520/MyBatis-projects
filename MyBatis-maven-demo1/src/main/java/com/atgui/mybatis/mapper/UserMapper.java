package com.atgui.mybatis.mapper;

public interface UserMapper {
    /**
     * 添加用户信息
     */
    int insertUser();

    /**
     * 增删改的返回值是固定的，int或void
     */
    void updateUser();

    void deleteUser();
}
