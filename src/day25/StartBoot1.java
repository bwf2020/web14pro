package day25;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication(scanBasePackages= {"com.bwf.controller","com.bwf.service"})
@MapperScan(basePackages="com.bwf.mapper")
public class StartBoot1 {

	public static void main(String[] args) {


		System.out.println("正在启动boot1服务");
		SpringApplication.run(StartBoot1.class);
		System.out.println("========成功启动===========");
		

	}

}
