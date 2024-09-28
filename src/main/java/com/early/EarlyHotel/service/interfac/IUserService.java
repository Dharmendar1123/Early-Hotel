package com.early.EarlyHotel.service.interfac;

import com.early.EarlyHotel.dto.LoginRequest;
import com.early.EarlyHotel.dto.Response;
import com.early.EarlyHotel.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);

}
