package myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName:Rule
 * Package:myrule
 * Description:
 *
 * @author : bxy
 * @ date: 2020/5/2  23:46
 */
@Configuration
public class Rule {

    @Bean
    public IRule randomRule() {
        return new RandomRule();
    }


}
