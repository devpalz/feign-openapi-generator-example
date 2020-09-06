package com.calling.localhost;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openapitools.model.Pet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = Application.class)
public class PetClientTest {

    private static final Logger logger = LoggerFactory.getLogger(PetClientTest.class);

    @Autowired
    private PetClient petClient;

    @Test
    public void test() {
        ResponseEntity<List<Pet>> pets = petClient.findPetsByStatus(List.of("available"));
        logger.info("Status code was '{}'", pets.getStatusCode());
        logger.info("Available pets are '{}'", pets.getBody());
    }
}
