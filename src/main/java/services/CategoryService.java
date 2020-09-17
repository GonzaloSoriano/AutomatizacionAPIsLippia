package services;

import api.model.Category;
import com.crowdar.api.rest.MethodsService;
import com.crowdar.api.rest.Response;

public class CategoryService extends MethodsService {

    public static Response get(String jsonName) {
        return get(jsonName, Category[].class);
    }
}
