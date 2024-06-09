package com.springboot.backup;

import com.springboot.backup.entity.BackupMember;
import com.springboot.backup.repository.BackupMemberRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BackupMemberService {
    private final BackupMemberRepository backupMemberRepository;

    public BackupMemberService(BackupMemberRepository backupMemberRepository) {
        this.backupMemberRepository = backupMemberRepository;
    }

    @Transactional
    public void createBackupMember(BackupMember backupMember) {
        backupMemberRepository.save(backupMember);

        throw new RuntimeException("multi datasource rollback test");
    }
}
