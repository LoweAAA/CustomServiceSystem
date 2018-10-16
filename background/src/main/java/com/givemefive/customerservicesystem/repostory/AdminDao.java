package com.givemefive.customerservicesystem.repostory;

import com.givemefive.customerservicesystem.model.bean.Admin;

public interface AdminDao {

    Admin queryByMail(String mail);

}
