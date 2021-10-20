package day17;

import org.springframework.stereotype.Component;

@Component
public class DogService implements IDogService {

	@Override
	public void m1() {

		System.out.println("狗方法1");

	}

	@Override
	public void m2() {

		System.out.println("狗方法2");

	}

}
