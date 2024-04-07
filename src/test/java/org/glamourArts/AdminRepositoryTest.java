package org.glamourArts.Data.Repositories;

import org.glamourArts.Data.Model.Admin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class AdminRepositoryTest {
    @Autowired
    private  AdminRepository adminRepository;
    @Test
    void testFindByAdminName(){
        Admin admin = adminRepository.findAdminByAdminName("Joy james");
        assertThat(admin).isNull();
    }

}