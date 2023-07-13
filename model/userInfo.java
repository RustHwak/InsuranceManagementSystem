package model;

public class userInfo {
	private int userId;
	private String firstName;
	private String lastName;
	private String email;
	private String passWord;
	private String policy;
	private String status;
	
	
	
	

	public userInfo(int userId, String firstName, String lastName, String email, String passWord, String policy,
			String status) {
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.passWord = passWord;
		this.policy = policy;
		this.status = status;
	}


	public userInfo(int userId, String firstName, String lastName, String email, String passWord) {
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.passWord = passWord;
	}


	public userInfo(int userId, String firstName, String lastName, String email, String passWord, String policy) {
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.passWord = passWord;
		this.policy = policy;
	}
	

	public userInfo(int userId, String email, String policy) {
		this.userId = userId;
		this.email = email;
		this.policy = policy;
	}


	public int getUserId() {
		return userId;
	}


	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public String getEmail() {
		return email;
	}


	public String getPassWord() {
		return passWord;
	}


	public String getPolicy() {
		return policy;
	}


	public String getStatus() {
		return status;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}


	public void setPolicy(String policy) {
		this.policy = policy;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	

}
