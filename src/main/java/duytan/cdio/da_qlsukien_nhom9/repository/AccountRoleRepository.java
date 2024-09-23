package duytan.cdio.da_qlsukien_nhom9.repository;

import duytan.cdio.da_qlsukien_nhom9.models.AccountRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountRoleRepository extends JpaRepository<AccountRole, Long> {
    @Query("select ar.role.roleName from AccountRole ar where ar.account.accountName = :accountName")
    List<String> findAllRoleByUser(String accountName);
}
