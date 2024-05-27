@Data
public class Account implements UserDetails {
    private Integer id;
    private String username;
    private String password;
    private Boolean enabled;
    private List<Role> roles;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        ArrayList<SimpleGrantedAuthority> authorities = new ArrayList<>();
        for (Role role : roles) {
            authorities.add(new SimpleGrantedAuthority("ROLE_" +
                    role.getName()));
        }
        return authorities;
    }
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    @Override
    public boolean isEnabled() {
        return enabled;
    }
}