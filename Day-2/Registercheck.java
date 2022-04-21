class Register{
	public String checkCredentials(String email, String pass, String cpass) throws Exception {
		if(!email.contains("@") || !email.contains(".")) {
			throw new InvalidEmailExceptions("Invalid Email");
		}
		if(pass.length()<6) {
			throw new InvalidPasswordException("Invalid Password");
		}
		if (cpass!=pass) {
			throw new PasswordNotMatchException("Password not match");
		}
		return "Registered";
	}
}
@SuppressWarnings("serial")
class InvalidEmailExceptions extends Exception{

	public InvalidEmailExceptions(String message) {
		super(message);
		
	}
	
}
@SuppressWarnings("serial")
class InvalidPasswordException extends Exception{

	public InvalidPasswordException(String message) {
		super(message);
		
	}
	
}
@SuppressWarnings("serial")
class PasswordNotMatchException extends Exception{

	public PasswordNotMatchException(String message) {
		super(message);
		
	}
	
}
public class Registercheck {

	public static void main(String[] args) {
		Register user = new Register();
		try {
			user.checkCredentials("tushar@gmailcom","hiiiiii","hiiiiii");
		} catch (Exception e) {
			String name = e.getClass().getName();
			System.out.println( name.substring(name.indexOf('.')+1)+" : "+e.getMessage());
		}


	}

}
