package ufv.dis.final2021.SLG;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudWithVaadinApplication {

    private static final Logger log = LoggerFactory.getLogger(CrudWithVaadinApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CrudWithVaadinApplication.class);
    }

    @Bean
    public CommandLineRunner loadData(ipRepository repository) {
        return (args) -> {
            // save customers
            repository.save(new IP("Diego", "Abad", "Abad", "Abad", "Abad", "Abad", "Abad", "Abad", "Abad", "Abad"));


            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (IP direccion : repository.findAll()) {
                log.info(direccion.toString());
            }
            log.info("");

            // fetch an individual customer by ID
            IP direccion = repository.findById(1L).get();
            log.info("Customer found with findOne(1L):");
            log.info("--------------------------------");
            log.info(direccion.toString());
            log.info("");

            // fetch customers by last name
            log.info("Customer found with findByLastNameStartsWithIgnoreCase('Abad'):");
            log.info("--------------------------------------------");
            /*for (IP bauer : repository
                    .findByIp_from("2532573184")) {
                log.info(bauer.toString());
            }
            */

            log.info("");
        };
    }

}