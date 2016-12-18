package com.bucuoa.ucenter.api;

import com.bucuoa.ucenter.model.UlewoUser;

public interface UserRpcService {

	UlewoUser findUserByEmail(String value);
	
	UlewoUser findUserByUserId(String userId);
	
	UlewoUser findUserByUserName(String userName);
	
	void updateInfo(UlewoUser user);

}
