package com.backend.repository;

import com.backend.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import  org.springframework.data.repository.CrudRepository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{

    @Query(value = "SELECT count(*) FROM account c WHERE c.user_name = :user_name and c.pass = :pass", nativeQuery=true)
    Integer isExitsAccount(@Param("user_name")String user_name, @Param("pass") String pass );
}
