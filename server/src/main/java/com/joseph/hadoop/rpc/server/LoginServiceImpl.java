package com.joseph.hadoop.rpc.server;

import com.joseph.hadoop.rpc.common.LoginServiceInterface;

public class LoginServiceImpl implements LoginServiceInterface {

	@Override
	public String login(String username, String password) {
		return username + " logged in successfully!";
	}
}
