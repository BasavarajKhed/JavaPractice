package day12;

public class AccountMain {
	public static void main(String[] args) {
		Account ac=new Account();
		ac.setAccno(101);
		ac.setAmount(15000);
		ac.setName("Basavaraj");
		System.out.println(ac.getAccno());
		System.out.println(ac.getAmount());
		System.out.println(ac.getName());
}}
