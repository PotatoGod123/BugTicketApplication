package com.potatogod123.fundamentals.repository;


import com.potatogod123.fundamentals.entity.Release;
import org.springframework.data.repository.CrudRepository;

public interface ReleaseRepository extends CrudRepository<Release, Long> {
}