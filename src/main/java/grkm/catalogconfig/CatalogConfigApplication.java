package grkm.catalogconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CatalogConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(CatalogConfigApplication.class, args);
    }

}
