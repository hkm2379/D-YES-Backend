package com.dyes.backend.utility.redis;

import com.dyes.backend.domain.user.entity.User;

import java.time.Duration;

public interface RedisService {

    void setUserTokenAndUser (String UUID, String userId);
}
