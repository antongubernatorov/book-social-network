package com.gubern.book.user;

import java.util.Optional;

public interface UserRepository {// extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String username);
}
