package top.chenjq.eurekaslave;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaSlaveApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaSlaveApplication.class, args);
    }

}
