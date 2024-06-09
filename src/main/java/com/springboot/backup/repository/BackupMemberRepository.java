package com.springboot.backup.repository;

import com.springboot.backup.entity.BackupMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BackupMemberRepository extends JpaRepository<BackupMember, Long> {
}
