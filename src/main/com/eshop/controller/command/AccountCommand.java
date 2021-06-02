package com.eshop.controller.command;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.eshop.model.dao.DBException;
import com.eshop.model.service.UsersService;
import com.eshop.model.entity.User;

public class AccountCommand implements Command {
	@Override
	public CommandOutput execute (HttpServletRequest req) {
		try {
			User user = (User) req.getSession().getAttribute("user");
			user = new UsersService().getUser(user.getId());
			req.getSession().setAttribute("user", user);
			return new CommandOutput ("/user-account.jsp");
		}
		catch (DBException e) {
			e.printStackTrace();
			req.getSession().setAttribute("exception", e);
			return new CommandOutput ("/error.jsp");
		}
	}
}
