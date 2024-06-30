@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    AccountService accountService;
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception
    {
        auth.userDetailsService(accountService);
    }
    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().anyRequest().authenticated()
                .and()
                .formLogin()
                .loginProcessingUrl("/login")
                .loginPage("/login")
                .successHandler(new AuthenticationSuccessHandler() {
                    @Override
                    public void onAuthenticationSuccess(HttpServletRequest
                                                                httpServletRequest, HttpServletResponse httpServletResponse, Authentication
                                                                authentication) throws IOException, ServletException {
                        httpServletResponse.setContentType("application/json;charset=utf-8");
                        PrintWriter writer = httpServletResponse.getWriter();
                        Account account = (Account)
                                authentication.getPrincipal();
                        account.setPassword(null);
                        Result ok = Result.success("登录成功！", account);
                        String string = new
                                ObjectMapper().writeValueAsString(ok);
                        writer.write(string);
                        writer.flush();
                        writer.close();
                    }
                })
                .failureHandler(new AuthenticationFailureHandler() {
                    @Override
                    public void onAuthenticationFailure(HttpServletRequest
                                                                httpServletRequest, HttpServletResponse httpServletResponse,
                                                        AuthenticationException e) throws IOException, ServletException {
                        httpServletResponse.setContentType("application/json;charset=utf-8");
                        PrintWriter writer = httpServletResponse.getWriter();
                        Result result = Result.error("登录失败！");
                        if (httpServletResponse instanceof LockedException){
                            result.setMsg("账户被锁定，请联系管理员！");
                        }else if (httpServletResponse instanceof
                                BadCredentialsException){
                            result.setMsg("用户名或密码输入错误！");
                        }else if (httpServletResponse instanceof
                                DisabledException){
                            result.setMsg("账户被禁用，请联系管理员！");
                        }else if (httpServletResponse instanceof
                                AccountExpiredException){
                            result.setMsg("账户过期，请联系管理员！");
                        }else if (httpServletResponse instanceof
                                CredentialsExpiredException){
                            result.setMsg("密码过期，请联系管理员！");
                        }else {
                            result.setMsg("登录失败！");
                        }
                        String string = new
                                ObjectMapper().writeValueAsString(result);
                        writer.write(string);
                        writer.flush();
                        writer.close();
                    }
                })
                .permitAll()
                .and()
                .logout()
                .logoutSuccessHandler(new LogoutSuccessHandler() {
                    @Override
                    public void onLogoutSuccess(HttpServletRequest
                                                        httpServletRequest, HttpServletResponse httpServletResponse, Authentication
                                                        authentication) throws IOException, ServletException {
                        httpServletResponse.setContentType("application/json;charset=utf-8");
                        PrintWriter writer = httpServletResponse.getWriter();
                        writer.write(new
                                ObjectMapper().writeValueAsString(Result.success("注销登录")));
                        writer.flush();
                        writer.close();
                    }
                })
                .permitAll()
                .and()
                .cors()
                .and()
                .csrf()
                .disable();
    }
}
