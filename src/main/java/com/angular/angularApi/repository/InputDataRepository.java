package com.angular.angularApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.angular.angularApi.entity.InputEntity;

public interface InputDataRepository extends JpaRepository<InputEntity, Integer> {

}
