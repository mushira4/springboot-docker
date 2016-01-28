package br.com.spring.mvc.basics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring boot Initializer. All the children packages classess' will be scanned
 * from where this class is located.
 * 
 * @author mushira4
 *
 */
@SpringBootApplication //Enables the class auto-scanning
public class Boot {

	public static void main(String[] args) {
		SpringApplication.run(Boot.class, args);
	}

}
