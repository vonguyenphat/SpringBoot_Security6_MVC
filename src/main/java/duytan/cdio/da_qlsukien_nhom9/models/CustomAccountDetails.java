package duytan.cdio.da_qlsukien_nhom9.models;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class CustomAccountDetails implements UserDetails {
    private Collection<? extends GrantedAuthority> authorities;
    private String email;
    private String fullName;
    private String password;
    private String username;
    private Boolean gender;
    private String address;
    private String telephone;
    private Boolean enabled;
    private Boolean accountNonExpired;
    private Boolean accountNonLocked;
    private boolean credentialsNonExpired;

    public CustomAccountDetails() {
        super();
    }
    public CustomAccountDetails(Collection<? extends GrantedAuthority> authorities, String email, String fullName,
                                String password, String username, Boolean gender, String address, String telephone, Boolean enabled,
                                Boolean accountNonExpired, Boolean accountNonLocked, boolean credentialsNonExpired) {
        super();
        this.authorities = authorities;
        this.email = email;
        this.fullName = fullName;
        this.password = password;
        this.username = username;
        this.gender = gender;
        this.address = address;
        this.telephone = telephone;
        this.enabled = enabled;
        this.accountNonExpired = accountNonExpired;
        this.accountNonLocked = accountNonLocked;
        this.credentialsNonExpired = credentialsNonExpired;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

    public void eraseCredentials() {
        this.password = null;
    }
}
