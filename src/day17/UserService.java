package day17;

import org.springframework.stereotype.Component;

@Component
public class UserService implements IUserService {

	@Override
	public void show() {


		
		
		System.out.println("显示功能");
		
		
		
	}

	@Override
	public void show2() {
		System.out.println("显示功能2");
	}

}
