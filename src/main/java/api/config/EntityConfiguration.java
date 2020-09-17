package api.config;

import services.BreedsService;
import services.CategoryService;

public enum EntityConfiguration {

    CATEGORY {
        @Override
        public Class<?> getEntityService() {
            return CategoryService.class;
        }
    },
    BREED {
        @Override
        public Class<?> getEntityService() {
            return BreedsService.class;
        }
    };

    public abstract Class<?> getEntityService();
}
