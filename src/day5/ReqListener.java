package day5;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class ReqListener implements ServletRequestListener {

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {

		System.out.println("request对象被销毁");
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("request对象被创建");

	}

}
