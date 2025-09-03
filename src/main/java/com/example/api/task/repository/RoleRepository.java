package com.example.api.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.task.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}