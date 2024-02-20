package ioc;

/**
 * ProductService는 상품정보를 등록, 조회, 수정한다.
 * ProductService는 상품정보를 등록, 조회, 수정하기 위해서 ProductDao인터페이스를 구현한 객체가 필요하다.
 * 자기가 사용할 객체를 결정하지 않음 - > 컨테이너가 결정
 * @author jhta
 *
 */
public class ProductService {
	
	// 이런식으로 객체를 만들지 않는다.
	//ProductDao dao = ProductJdbcDao();
	
	// 담을 변수만 선언해놓은것(주입을 받기위함) 멤버 변수만 선언
	private ProductDao dao;
	
	// set 메소드를 만들어 놓는다.
	public void setDao(ProductDao dao) {
		System.out.println("조립되는 객체 : " + dao);
		this.dao = dao;
	}
	
	
	public void 신규상품등록() {
		dao.insertProduct();
	}
	public void 상품상세정보조회() {
		dao.getProduct();
		
	}
	public void 상품정보수정() {
		dao.updateProduct();
	}
}
