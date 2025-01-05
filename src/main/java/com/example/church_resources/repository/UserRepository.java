package com.example.church_resources.repository;

import com.example.church_resources.entity.Subscribe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<Subscribe,Long> {
}
