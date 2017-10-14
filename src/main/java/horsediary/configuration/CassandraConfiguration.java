package horsediary.configuration;

import horsediary.converter.DateConverter;
import horsediary.converter.LocalDateConverter;
import org.springframework.cassandra.config.CassandraCqlClusterFactoryBean;
import org.springframework.cassandra.config.CassandraCqlSessionFactoryBean;
import org.springframework.cassandra.core.keyspace.CreateKeyspaceSpecification;
import org.springframework.cassandra.core.keyspace.DropKeyspaceSpecification;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.config.java.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.convert.CustomConversions;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
@EnableCassandraRepositories(basePackages = "horsediary.model")
public class CassandraConfiguration extends AbstractCassandraConfiguration {

    public static final String KEYSPACE = "horsediaryspace";

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
        return KEYSPACE;
    }

    @Override
    public SchemaAction getSchemaAction() {
        return SchemaAction.CREATE_IF_NOT_EXISTS;
    }

    @Override
    protected List<CreateKeyspaceSpecification> getKeyspaceCreations() {
        CreateKeyspaceSpecification specification = CreateKeyspaceSpecification.createKeyspace(KEYSPACE);

        return Arrays.asList(specification);
    }

    @Override
    protected List<DropKeyspaceSpecification> getKeyspaceDrops() {
        return Arrays.asList(DropKeyspaceSpecification.dropKeyspace(KEYSPACE));
    }
}
