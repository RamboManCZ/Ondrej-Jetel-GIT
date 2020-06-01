package accountgenerator;

public class Employee {

	private String name, username, email, password;

	public Employee(String name) throws nullException, nameException {
		name = setName(name);
		username = setUserName(name);
		email = setMail(username);
		password = setPassword(username);

	}

	private String setName(String name) throws nullException, nameException {
		this.name = name;
		if (name == null) {
			throw new nullException("");
		}
		if (name.length() < 2) {
			throw new nameException("");
		}
		return name;
	}

	private String setUserName(String name) {
		return name.toLowerCase().replace(" ", ".");

	}

	private String setMail(String username) {

		int startIndex = 1;
		int endIndex = username.indexOf(".");
		String ToBeRemove = username.substring(startIndex, endIndex + 1);
		String x = username.replace(ToBeRemove, "");
		x = x + "@oracleacademy.Test";
		return x;

	}

	private String setPassword(String username) {

		String x = username.replace("a", "*");
		x = x.replace("e", "*");
		x = x.replace("i", "*");
		x = x.replace("o", "*");
		x = x.replace("u", "*");
		String toUpper = x.substring(0, 1 );
		toUpper = toUpper.toUpperCase();
		int y = x.indexOf(".");
		x=x.replace(x.substring(y,x.length()),".*");
		
		x=x.substring(1, x.length());
		return toUpper+x;
	}
	public String getName() {
		return name;
	}
	public String getUsername() {
		return username;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}

	public String toString() {
		return "Employee Details:  " + "\nName: " + name + "   \nUsername: " + username + "    \nEmail: " + email
				+ "     \nInitial Password: " + password;

	}

}
