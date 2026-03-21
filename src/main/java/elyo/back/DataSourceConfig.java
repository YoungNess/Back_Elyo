package elyo.back;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.net.URI;

@Configuration
public class DataSourceConfig {

    @Value("${INTERNAL_DB_URL}")
    private String internalDbUrl;

    @Bean
    public DataSource dataSource() {
        URI uri = URI.create(internalDbUrl);

        String host = uri.getHost();
        int port = uri.getPort() == -1 ? 5432 : uri.getPort();
        String database = uri.getPath().substring(1);
        String[] userInfo = uri.getUserInfo().split(":", 2);
        String username = userInfo[0];
        String password = userInfo[1];

        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:postgresql://" + host + ":" + port + "/" + database);
        config.setUsername(username);
        config.setPassword(password);
        config.setDriverClassName("org.postgresql.Driver");

        return new HikariDataSource(config);
    }
}
