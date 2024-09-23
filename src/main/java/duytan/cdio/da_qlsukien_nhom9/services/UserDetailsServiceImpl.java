package duytan.cdio.da_qlsukien_nhom9.services;

import duytan.cdio.da_qlsukien_nhom9.models.Account;
import duytan.cdio.da_qlsukien_nhom9.models.CustomAccountDetails;
import duytan.cdio.da_qlsukien_nhom9.repository.AccountRepository;
import duytan.cdio.da_qlsukien_nhom9.repository.AccountRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    AccountRepository accountRepository;
    @Autowired
    AccountRoleRepository accountRoleRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Account account = accountRepository.findByAccountName(username);
        if (account == null){
            throw new UsernameNotFoundException("User không tồn tại");
        }
        List<String> roles = accountRoleRepository.findAllRoleByUser(username);
        List<GrantedAuthority> authorityList = new ArrayList<>();
        for (String roleName: roles) {
            authorityList.add(new SimpleGrantedAuthority(roleName));
        }
        return new CustomAccountDetails(authorityList, account.getEmail(), account.getFullName(), account.getPassword(), account.getAccountName(), account.getGender(), account.getAddress(), account.getTelephone(), account.getEnabled(),true,true,true);
    }
}
