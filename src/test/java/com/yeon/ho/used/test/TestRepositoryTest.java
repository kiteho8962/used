package com.yeon.ho.used.test;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
public class TestRepositoryTest {

    @Autowired
    private TestRepository testRepository;

    @Test
    public void testCreate() {
        TestEntity testEntity = TestEntity.builder()
                .testText("테스트중")
                .build();
        testRepository.save(testEntity);
    }

}
