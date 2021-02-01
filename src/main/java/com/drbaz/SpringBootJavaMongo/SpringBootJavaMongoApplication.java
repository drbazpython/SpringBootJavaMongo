package com.drbaz.SpringBootJavaMongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/* remember to run
 *systemctl start mongodb
 * *in Terminal
 */
@SpringBootApplication
public class SpringBootJavaMongoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootJavaMongoApplication.class, args);
	}

}
