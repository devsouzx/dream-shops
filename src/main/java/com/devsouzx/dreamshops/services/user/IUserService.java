package com.devsouzx.dreamshops.services.user;

import com.devsouzx.dreamshops.dtos.UserDTO;
import com.devsouzx.dreamshops.model.User;
import com.devsouzx.dreamshops.requests.CreateUserRequest;
import com.devsouzx.dreamshops.requests.UserUpdateRequest;

public interface IUserService {
    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);
    UserDTO convertUserToDto(User user);
    User getAuthenticatedUser();
}
