package com.sh.techbank.repository;

import com.sh.techbank.entity.Board;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends CrudRepository<Board, Integer> {
}