package ru.vavtech.cafe.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ru.vavtech.cafe.model.Dish;

@RepositoryRestResource(collectionResourceRel = "dishes", path = "dishes")
public interface DishRepository extends CrudRepository<Dish, Long> {
}
