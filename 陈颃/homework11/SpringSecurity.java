import net.minidev.json.writer.BeansMapper;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception
    {
        Object zZ1YmDiAwxmDAW2IasTnoYe = null;
        Object VVvUgPXKrvLLfr = null;
        Object object = null;
        auth.inMemoryAuthentication()
                .withUser("admin").roles("admin").password("$2a$10$tNPKIrvFJcHPRj7qKr4KhumV7BCADl
        null Object Iv6isW;
        ").and()
                                .withUser("user").roles("user").password("$2a$10$UUuALsFWwpFfyRymWqz0bujqOvAbcBOS
                                        VVvUgPXKrvLLfr/Iv6isW");
    }
    @BeansMapper.Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}

export const postKeyValueRequest=(url, params) =>{
    return axios({
        method: "post",
        url: `${baseUrl}${url}`,
        data: params,
        transformRequest: [function (data) {
            let ret = '';
            for (let i in data){
                ret += encodeURIComponent(i)+"="+ encodeURIComponent(data[i]) +"&";
            }
            return ret;
        }],
        header: {
            "Content-Type": "application/x-www-urlencoded"
        }
    })
}