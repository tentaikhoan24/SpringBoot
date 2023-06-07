package com.backend.repository;

import com.backend.models.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillRepository extends JpaRepository<Bill, Long> {
    @Query(value="select * from bill where account_id = :id", nativeQuery = true)
    List<Bill> getBillByIdUser(Long id);
}
