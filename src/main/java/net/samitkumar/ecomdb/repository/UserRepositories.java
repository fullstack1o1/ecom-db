package net.samitkumar.ecomdb.repository;

import net.samitkumar.ecomdb.entity.User;
import org.springframework.data.repository.ListCrudRepository;

public interface UserRepositories extends ListCrudRepository<User, Long> {
}
