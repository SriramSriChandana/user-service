package com.sr.user_service.Secure.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sr.user_service.Secure.model.AdminDump;

public interface AdminDumpRepo extends JpaRepository<AdminDump,Long> {

}
