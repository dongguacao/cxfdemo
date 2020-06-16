 ## 项目使用的是springboot2.3.1.RELEASE版本
 
 ### 项目分为两个module 
  * client 一个main函数调用service提供的webservice方法
  * service 提供webservice服务
  
#### service模块
包结构

    com.cnbg.service
        |----common   
            |----head    放的是共用消息头 ，无论哪个接口都会使用
        |----config      发布webservice的配置类
        |----systemname  可根据系统和业务自定义
             |----businessname   两层是系统名称 + 业务名称根据自己业务定义
                  |----bean      存储的是可自定义成员的类
                  |----intf      存储的是webservice的接口类

里面有使用到package-infos.json 主要是为了给对象参数的成员变量添加namespace

#### 相关注解
> ##### @XmlAccessorType( XmlAccessType.FIELD )  注解在类上可实现类成员在wsdl中有序
> ##### @SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE) 注解在webservice接口上，用于实现入参报文不带有方法名称

  
  

  