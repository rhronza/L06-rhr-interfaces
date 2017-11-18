package cz.expertkom.ju.interfaces;

import cz.expertkom.ju.entity.User;

public interface UserRepository {

	User getUser(String username);
	
}
