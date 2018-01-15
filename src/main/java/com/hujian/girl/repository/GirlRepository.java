package com.hujian.girl.repository;

import com.hujian.girl.domain.Girl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GirlRepository extends JpaRepository<Girl, Integer> {
    public List<Girl> findByAge(Integer age);
}
