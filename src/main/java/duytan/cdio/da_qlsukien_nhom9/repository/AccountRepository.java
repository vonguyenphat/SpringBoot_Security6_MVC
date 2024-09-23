package duytan.cdio.da_qlsukien_nhom9.repository;

import duytan.cdio.da_qlsukien_nhom9.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {
    Account findByAccountName(String accountName);
}
