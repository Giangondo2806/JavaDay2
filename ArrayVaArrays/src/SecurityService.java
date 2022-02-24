
public class SecurityService {
	
	public void login(String username, String password) {
		UserService.getInstance().findUser(username);
		
	}

}
