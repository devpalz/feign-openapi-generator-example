package com.calling.localhost;

import org.openapitools.api.PetApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(url = "https://petstore.swagger.io/v2", name = "PetClient")
public interface PetClient extends PetApi {

}