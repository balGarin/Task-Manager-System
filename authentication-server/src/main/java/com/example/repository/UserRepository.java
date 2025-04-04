package com.example.repository;

import com.example.model.SecurityUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<SecurityUser, Long> {
//    @Query( value =
//            """
//                     SELECT u.id,u.username, u.password, u.email, a.authority
//                    	FROM users as u
//                    	LEFT JOIN authorities a ON a.username=u.username
//                    	WHERE u.email=?1
//                    """)
    Optional<SecurityUser> findByEmail(String email);
}
