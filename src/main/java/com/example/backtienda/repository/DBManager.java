package com.example.backtienda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
@NoRepositoryBean
public interface DBManager<T, ID> extends JpaRepository<T, ID>{

}
