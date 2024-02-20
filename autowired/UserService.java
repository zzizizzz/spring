package autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//@service 자동스캔 <Bean> 작성이 필요없다
@Service
public class UserService {
	// 조립되는 멤버변수지정
	@Autowired
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void 회원가입() {
		userDao.getUser();
		userDao.insertUser();
	}
}
