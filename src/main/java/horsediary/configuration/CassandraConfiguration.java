package horsediary.configuration;

import horsediary.converter.DateConverter;
import horsediary.converter.LocalDateConverter;
import org.springframework.cassandra.config.CassandraCqlClusterFactoryBean;
import org.springframework.cassandra.config.CassandraCqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.cassandra.config.java.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.convert.CustomConversions;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class CassandraConfiguration extends AbstractCassandraConfiguration {
    @Override
    public String[] getEntityBasePackages() {
        return new String[] { "horsediary.model"};
    }

    @Override
    public CustomConversions customConversions() {
        List<Converter> converters = new ArrayList<>();

        converters.add(new DateConverter());
        converters.add(new LocalDateConverter());

        return new CustomConversions(converters);
    }

    /*
     * Provide a keyspace name to the configuration.
     */

    @Override
    protected String getKeyspaceName() {
        return "horsediaryspace";
    }
}
