package com.givemefive.customerservicesystem.service;

import com.givemefive.customerservicesystem.model.Constant.Result;

public interface AdminService {

    Result loginConfirm(String mail, String password);
}
