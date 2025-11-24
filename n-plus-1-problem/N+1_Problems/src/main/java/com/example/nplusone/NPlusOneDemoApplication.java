package com.example.nplusone;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NPlusOneDemoApplication implements CommandLineRunner {

    private final NPlusOneService service;
    private final AdvancedService advancedService;

    public NPlusOneDemoApplication(NPlusOneService service, AdvancedService advancedService) {
        this.service = service;
        this.advancedService = advancedService;
    }

    public static void main(String[] args) {
        SpringApplication.run(NPlusOneDemoApplication.class, args);
    }

    @Override
    public void run(String... args) {
        // Basic: N+1 problem
        service.showNPlusOneProblem();

        // Intermediate: JOIN FETCH fix
        service.fixWithJoinFetch();

        // Advanced: Entity Graph
        advancedService.fixWithEntityGraph();

        // Pro: Batch fetching is enabled via config; observe logs for query counts
    }
}
