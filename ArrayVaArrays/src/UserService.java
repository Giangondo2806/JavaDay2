
public class UserService {
 private String name;
 private int age;
 private static UserService userService;
 // singleton object
 public static UserService getInstance() {
	 if(UserService.userService ==null ) {
		 UserService.userService = new UserService();
		 return UserService.userService;
	 } else {
		 return UserService.userService;
	 }
 }
 public static int count;

 public String  getName () {
	 return "Giang";
 }
 
 
 
// static cho phep tao method cho Class chu khong phai cho instance;
}





