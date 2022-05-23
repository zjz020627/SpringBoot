@SpringBootApplication
用在主程序所对应的类上，声明这是一个SpringBoot应用

@RestController
@ResponseBody和@Controller结合，既把这个类标为Controller又把方法的返回值作为内容返回而不是跳转页面

@Configuration(proxyBeanMethods = false)
proxyBeanMethods: 代理bean的方法
    Full(proxyBeanMethods = true)、
    Lite(proxyBeanMethods = false)
    组件依赖

用在配置类上
如果这个类里的方法没有依赖关系则使用false，会使启动更快
如果有则必须使用true，开启组件依赖

@Import({xxx.class})
用在配置类上，给容器中自动创建出这个类型的组件，默认组件名字就是全类名

@ConditionalOnBean(name = "name")
用方法上，当容器中有名为name的组件时这个方法才生效。
用在配置类上，当容器中有名为name的组件时这个类的所有方法才生效。

@ImportResource("classpath:beans.xml")
用在配置类上，把resource目录下的beans.xml重新解析

@Component
@ConfigurationProperties(prefix = "mycar")
用在javabean上，把该bean与配置文件结合，设置默认值。
或
@ConfigurationProperties(prefix = "mycar")
用在javabean上
@EnableConfigurationProperties(Car.class)
用在配置类上，1.开启Car属性配置绑定功能 2.把Car这个组件自动注册到容器中


lombok插件
注解创建javabean
@Data：自动创建getset方法
@AllArgsConstructor：自动创建全参构造器
@NoArgsConstructor：自动创建无参构造器
@ToString：自动创建toString方法


dev-tools
Ctrl+F9重新编译