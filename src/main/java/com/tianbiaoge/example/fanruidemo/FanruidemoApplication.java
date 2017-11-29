package com.tianbiaoge.example.fanruidemo;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.web.servlet.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;

/**
 * @Describe fanruidemo入口启动类
 * @Author lc
 * @CreateTime 2017/11/1
 */
@SpringBootApplication
public class FanruidemoApplication {

	/**
	 * @return
	 * @Describe 入口类的下面这个两个@Bean实现HTTP自动转向HTTPS
	 */
	@Bean
	public EmbeddedServletContainerFactory servletContainer() {
		TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory() {
			@Override
			protected void postProcessContext(Context context) {
				SecurityConstraint constraint = new SecurityConstraint();
				constraint.setUserConstraint("CONFIDENTIAL");
				SecurityCollection collection = new SecurityCollection();
				collection.addPattern("/*");
				constraint.addCollection(collection);
				context.addConstraint(constraint);
			}
		};
		tomcat.addAdditionalTomcatConnectors(httpConnector());
		return tomcat;
	}

	/**
	 * @Describe 实现特定的端口跳到特定的端口
	 * @return
	 */
	@Bean
	public Connector httpConnector() {
		Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
		connector.setScheme("http");
		//Connector监听的http的端口号
		connector.setPort(80);
		connector.setSecure(false);
		//监听到http的端口号后转向到的https的端口号
		connector.setRedirectPort(8443);
		return connector;
	}

//	/**
//	 * @Attention 如果这个以及接下来的Java7替代版本没有注释掉的话，那DefaultErrorController 就不会生效，
//	 * 错误界面会首先实现线面这个Bean的方法
//	 * @Describe 使用Java 8的lambda表达式来简化实现的方式，在代码中创建了三个ErrorPage实例来处理三个通用的HTTP错误状态码，并将他们添加到container当中。
//	 * ErrorPage类是一个封装了错误信息的类，它可以在Jetty和Tomcat环境下使用。
//	 * @Reference http://blog.csdn.net/github_32521685/article/details/50198467
//	 * @return
//	 */
//	@Bean
//	public EmbeddedServletContainerCustomizer containerCustomizer() {
//
//		return (container -> {
//			ErrorPage error401Page = new ErrorPage(HttpStatus.UNAUTHORIZED, "/401.html");
//			ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/404.html");
//			ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/500.html");
//
//			container.addErrorPages(error401Page, error404Page, error500Page);
//		});
//	}
//	/**
//	 * @Decribe 使用Java 7内部类的一个等价实现Spring Boot自定义错误页面
//	 * @return
//	 */
//	@Bean
//	public EmbeddedServletContainerCustomizer containerCustomizer() {
//
//		return new EmbeddedServletContainerCustomizer() {
//			@Override
//			public void customize(ConfigurableEmbeddedServletContainer container) {
//
//				ErrorPage error401Page = new ErrorPage(HttpStatus.UNAUTHORIZED, "/401.html");
//				ErrorPage error404Page = new ErrorPage(HttpStatus.NOT_FOUND, "/404.html");
//				ErrorPage error500Page = new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR, "/500.html");
//
//				container.addErrorPages(error401Page, error404Page, error500Page);
//			}
//		};
//	}

	public static void main(String[] args) {
		SpringApplication.run(FanruidemoApplication.class, args);
	}
}
