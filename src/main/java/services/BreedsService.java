package services;

import api.model.Breed;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class BreedsService extends MethodsService {

    public static Response get(String jsonName) {
        return get(jsonName, Breed.class);
    }
}
