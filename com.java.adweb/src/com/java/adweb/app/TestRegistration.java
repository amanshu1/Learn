package com.java.adweb.app;


public class TestRegistration {
	public static void main(String[] args) throws Exception {
		//testAdd();
		testAuth();
		
	}
	public static void testAdd() throws Exception {
		RegistrationBean bean = new RegistrationBean();
		
		bean.setFirstName("drishti");
		bean.setLastName("dhami");
		bean.setEmail("drashti@gmail.com");
		bean.setPassword("damn");
		bean.setGender("female");
		RegistrationModal m = new RegistrationModal();
		m.add(bean);
	}
	public static void testAuth() throws Exception {
		RegistrationBean bean = new RegistrationBean();
			RegistrationModal m = new RegistrationModal();
			bean.setEmail("amans@gmail.com");
			bean.setPassword("amanshu123");
		bean = m.authenticate(bean.getEmail(),bean.getPassword());
		if(bean== null) {
			System.out.println("Check 7");
		}else {
		System.out.println(" check 9");
	}}
	
	
}
