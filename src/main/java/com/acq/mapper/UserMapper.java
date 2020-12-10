package com.acq.mapper;

import com.acq.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User queryUserById(int id);
}
