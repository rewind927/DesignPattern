package com.design.pattern.builder2;

public class User {
    private final String firstName; // required
    private final String lastName; // required
    private final int age; // optional
    private final String phone; // optional
    private final String address; // optional

	//TODO Refactor User constructor
	public User () {
		this.firstName = "";
		this.lastName = "";
		this.age = 0;
		this.phone = "";
		this.address = "";
	}

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public static class UserBuilder {
        private final String firstName;
        private final String lastName;
        private int age;
        private String phone;
        private String address;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age) {
           //TODO
	        return null;
        }

        public UserBuilder phone(String phone) {
            //TODO
	        return null;
        }

        public UserBuilder address(String address) {
            //TODO
	        return null;
        }

        public User build() {
           //TODO
	        return null;
        }
    }
}
