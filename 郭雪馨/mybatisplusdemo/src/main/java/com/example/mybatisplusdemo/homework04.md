# SpringBoot学习心得


## SpringBoot编程就是面向注解编程，在java开发过程中解决了繁琐的xml配置问题,starter则是SpringBoot中非常重要的机制
## 在特定的类上加 @Component：标注普通组件； @Repository：标注数据层组件； @Service：标注业务层组件； @Controller：标注表示层组件。让Spring通过IOC容器(Spring框架的核心)来进行对象管理
## 使用@Autowired 注解进行依赖注入
## SpringBoot中的配置文件分为properties,yaml两种格式(yaml/yml格式比properties格式更简单)

## SpringBoot的常用注解有：

### 1.启动类上的注解@SpringBootApplicaation;
### 2.在service层用于事务管理的注解@Transactional;
### 3.@PathVariable:接受请求路径中占位符的值;
### 4.用于跨域访问支持的注解@CrossOrigin,它有origins和maxAge两个参数;
### 5.@RequestBody(用在形参列表上),@ResponseBody(用在方法上);
### 6.由Lombok提供的注解@Data(运行时动态生成getter和setter方法);
### 7.来自于lombok依赖的注解@Slf4j;
### 8.@Configuration(代替Spring中applicationContext.xml);
### 9.@Service(将一个类自动注册到Spring容器中);
### 10.@ComponentScan(指定要扫描的包);
### 11.@Autowired(对象注入,一个对象只有一个实例),自动扫描的对象注入还有@Resources(一个对象有多个实例)和@Injected;
### 12.@RequestMapping(用来标记一个请求URL，还可以用于请求窄化（给请求添加一个前缀）);
### 13.@GetMapping,用于将HTTP get请求映射到特定处理程序;
### 14.@RestController;
### 15. @RequestParam用于解决服务端的接口变量名和前端不一致

## 一个 SpringBoot项目代码一般分为了model层、mapper层(Dao层)、service层(业务逻辑层)、controller层(控制器层)四层

## 总结：经过这节课，我对SpringBoot有了更深入的了解，它的自动配置功能让我们能更简洁方便的开发项目，解决了开发时繁琐的配置问题

