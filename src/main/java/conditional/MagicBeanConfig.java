package conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MagicBeanConfig {

    @Bean(name = "magic")
    @Conditional(MagicExistCondition.class)
    public IMagicBean magicBean(){
        return new MagicBean();
    }
}
