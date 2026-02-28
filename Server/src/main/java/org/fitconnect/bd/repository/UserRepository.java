package org.fitconnect.bd.repository;

import org.fitconnect.bd.model.TUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<TUser, Long> {

}