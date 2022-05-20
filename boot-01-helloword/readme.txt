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

