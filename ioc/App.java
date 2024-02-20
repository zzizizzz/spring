package ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		//ClassPathXmlApplicationContext("context.xml") 조립담당해준다
		ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
		ProductService productService = ctx.getBean(ProductService.class); // getBean 객체를 꺼내온다.(ProductService.class)설계도 정보를 안려준다.
		
		productService.신규상품등록();
		productService.상품상세정보조회();
		productService.상품정보수정();
	}
}
