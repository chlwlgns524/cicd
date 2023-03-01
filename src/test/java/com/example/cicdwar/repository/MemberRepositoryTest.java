package com.example.cicdwar.repository;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import com.example.cicdwar.model.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class MemberRepositoryTest {

    MemberRepository memberRepository = new MemberRepository();

    @AfterEach
    void clear() {
        memberRepository.clear();
    }

    @Test
    void save() {
        Member member = Member.builder()
            .email("test@gmail.com")
            .password("1234")
            .build();

        Long id = memberRepository.save(member);

        Member memberEntity = memberRepository.findMemberById(id);

        assertThat(memberEntity).usingRecursiveComparison().isEqualTo(1);
    }

    @Test
    void findMemberById() {
    }

}