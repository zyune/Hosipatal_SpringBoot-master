# Spring的依赖注入和自动装配
## Spring的依赖注入
  在Spring中，依赖注入具有Set注入和构造函数注入，通过xml进行配置注入，注入的参数具有普通的注入，对象注入，集合参数，map参数等注入方式。
## Spring的自动装配
  在Spring中，自动装配的类型具有byName, byType, constructor, autodetect，常用byName和byType,常用的注解为@Autowired\@Qualifier("user")
@Autowired是强制进行注入的，可以通过参数进行更改，同时为byType进行注入，@Qualifier是通过name属性进行注入，常常结合@Autowired使用，因为同一个接口会有
多个实现类，我们要区别具体的实现类就不能仅仅使用byType。
