import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource

// Place your Spring DSL code here
beans = {

    // Configuring Hikari Connection Pool for all data sources
    grailsApplication.config.dataSources.each { key, value ->
        Map conf = value
        Map properties = value.cpProperties
        String beanName = (key =='dataSource') ? 'dataSource' : "dataSource_$key"
        "${beanName}"(HikariDataSource) { bean->
            HikariConfig config = new HikariConfig()
            properties.each {Map.Entry entry->
                config."set${entry.key.capitalize()}"(entry.value)
            }
            config.setUsername(conf.username)
            config.setPassword(conf.password)
            config.setJdbcUrl(conf.url)
            config.setDriverClassName(conf.driverClassName)
            bean.constructorArgs = [config]
        }
    }
}
