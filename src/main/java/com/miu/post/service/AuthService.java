package com.miu.post.service;

import com.miu.post.entity.dtos.request.LoginRequest;
import com.miu.post.entity.dtos.request.RefreshTokenRequest;
import com.miu.post.entity.dtos.response.LoginResponse;

public interface AuthService {
    LoginResponse login(LoginRequest loginRequest);
    LoginResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}

