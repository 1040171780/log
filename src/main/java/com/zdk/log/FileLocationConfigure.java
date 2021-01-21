package com.zdk.log;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.ConfigurationSource;
import org.apache.logging.log4j.core.config.Configurator;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * log4j2默认在classpath下查找配置文件，可以修改配置文件的位置。在非web项目中：
 */
public class FileLocationConfigure {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/log4j2.xml");
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
        final ConfigurationSource source = new ConfigurationSource(in);
        Configurator.initialize(null, source);

        Logger logger = LogManager.getLogger("mylog");
    }
}
/*
如果是web项目，在web.xml中添加
	<context-param>
		<param-name>log4jConfiguration</param-name>
		<param-value>/WEB-INF/conf/log4j2.xml</param-value>
	</context-param>

	<listener>
		<listener-class>org.apache.logging.log4j.web.Log4jServletContextListener</listener-class>
	</listener>
*/