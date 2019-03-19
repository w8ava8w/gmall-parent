package com.atguigu.gmall.ums.config;

import io.shardingjdbc.core.api.MasterSlaveDataSourceFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;

import javax.sql.DataSource;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author AVA
 * @date 2019/3/19 16:06
 */
@Configuration
public class GmallShardingJdbcConfig {

    public DataSource dataSource() throws IOException, SQLException{

    //

        DataSource dataSource = MasterSlaveDataSourceFactory
                .createDataSource(ResourceUtils.getFile
                        ("classpath:sharding.yml")
                );


        return null;
    }
}
