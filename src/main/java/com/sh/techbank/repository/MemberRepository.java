package com.sh.techbank.repository;

import com.sh.techbank.entity.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, String> {
}
