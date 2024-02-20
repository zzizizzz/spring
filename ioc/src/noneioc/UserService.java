package noneioc;

public class UserService {

	// 제어역전을 사용하지 않은경우에는 확장성이 떨어진다.
	// UserService는 자신이 사용할 객체(의존하는 객체)를 직접생성했다(직접결정했다) 제어역전x
	// UserJdbcDao dao = new UserJdbcDao();
	
	UserMybatisDao dao = new UserMybatisDao();
	
	public void 회원가입기능() {
//		dao.insert();
		dao.insertUser();
	}
	public void 내정보조회기능() {
//		dao.select();
		dao.getUser();
	}
}
