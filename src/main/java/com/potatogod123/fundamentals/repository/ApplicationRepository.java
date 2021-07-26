package com.potatogod123.fundamentals.repository;

import com.potatogod123.fundamentals.entity.Application;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationRepository extends CrudRepository<Application, Long> {
}
