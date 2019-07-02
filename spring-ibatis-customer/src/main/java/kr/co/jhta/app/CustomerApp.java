package kr.co.jhta.app;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.jhta.dao.CustomerDao;
import kr.co.jhta.vo.Customer;

public class CustomerApp {

	public static void main(String[] args) {
		String resource = "classpath:/META-INF/spring/context.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(resource);

		CustomerDao customerDao = ctx.getBean(CustomerDao.class);
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("\n");
			System.out.println("------------------------------------------------------");
			System.out.println("1.전체조회 2.상세조회 3.등록 4.수정 5.삭제 6.고객검색 0.종료");
			System.out.println("------------------------------------------------------");
			
			System.out.print("메뉴선택> ");
			int menu = scanner.nextInt();
			
			if (menu == 1) {
				List<Customer> customerList = customerDao.getAllCustomers();
				for (Customer c : customerList) {
					System.out.println("고객번호: " + c.getNo());
					System.out.println("고객이름: " + c.getName());
					System.out.println("고객폰번호: " + c.getPhone());
				}
			} else if (menu == 2) {
				System.out.print("상세조회할 번호> " );
				int no = scanner.nextInt();
				
				Customer customer=customerDao.getCustomerByNo(no);
				System.out.println("고객번호: " + customer.getNo());
				System.out.println("고객이름: " + customer.getName());
				System.out.println("고객닉네임: " + customer.getNickname());
				System.out.println("고객주소: " + customer.getAddress());
				System.out.println("고객이메일: " + customer.getEmail());
				System.out.println("고객포인트: " + customer.getPoint());
				System.out.println("고객폰번호: " + customer.getPhone());
				System.out.println("고객등록일: " + customer.getCreateDate());
				
			} else if (menu == 3) {
				System.out.println("등록할 정보를 입력하세요");
				String name= scanner.next();
				String nickname= scanner.next();
				String phone= scanner.next();
				String email= scanner.next();
				String address= scanner.next();
				
				Customer customer = new Customer();
				customer.setName(name);
				customer.setNickname(nickname);
				customer.setPhone(phone);
				customer.setEmail(email);
				customer.setAddress(address);
				
				customerDao.insertCustomer(customer);
				
			} else if (menu == 4) {
				System.out.println("수정할 고객번호를 입력하세요");
				int no = scanner.nextInt();
				String name= scanner.next();
				String nickname= scanner.next();
				String phone= scanner.next();
				String email= scanner.next();
				String address= scanner.next();
				int point = scanner.nextInt();
				
				Customer customer = new Customer();
				customer.setName(name);
				customer.setNo(no);
				customer.setNickname(nickname);
				customer.setPhone(phone);
				customer.setEmail(email);
				customer.setAddress(address);
				customer.setPoint(point);
				
				customerDao.updateCustomer(customer);
		
			} else if (menu == 5) {
				
			} else if (menu == 6) {
				
			} else if (menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
		}
		
	}
}
