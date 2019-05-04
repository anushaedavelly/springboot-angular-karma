package com.karma.springbootkarma;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KarmaRepository extends JpaRepository<Employee, Integer> {

}
