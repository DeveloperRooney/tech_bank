package com.sh.techbank.repository;

import com.sh.techbank.entity.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, String> {

    public Member findByUserid(String userid);

    public Member findByUseridAndUserpwd(String userid, String userpwd);
}
