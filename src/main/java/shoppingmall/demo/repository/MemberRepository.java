package shoppingmall.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import shoppingmall.demo.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Member findByEmail(String email);

}