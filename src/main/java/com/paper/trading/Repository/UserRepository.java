package com.paper.trading.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paper.trading.Entity.UserEntity;
@Repository 
public interface UserRepository extends JpaRepository<UserEntity, Long>{
    
}
