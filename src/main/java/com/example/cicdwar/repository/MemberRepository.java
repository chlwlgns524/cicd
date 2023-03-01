package com.example.cicdwar.repository;

import com.example.cicdwar.model.Member;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

    private static Long sequence = 0L;
    private static Map<Long, Member> store = new HashMap<>();

    public Long save(Member member) {
        Long id = sequence;
        store.put(sequence++, member);
        return id;
    }

    public Member findMemberById(Long id) {
        return store.get(id);
    }

    public void clear() {
        store = new HashMap<>();
    }

}
