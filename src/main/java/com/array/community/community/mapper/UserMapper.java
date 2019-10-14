package com.array.community.community.mapper;

import com.array.community.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO user(NAME,ACCOUNT_ID,TOKEN,GMT_CREATE,GMT_MODIFIED) " +
            "VALUES (#{name},#{accountId}," +
            "#{token},#{gmtCreate},#{gmtModified})")
    void insert(User user);

}
