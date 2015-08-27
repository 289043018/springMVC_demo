# springMVC_demo
这是一个简单的实现springMVC示例
注意：MVC项目的访问和重定向的URL都要根据controller的@RequestMapping("/hello")中的位置来，否则会直接访问源文件而没有经过控制器过滤。
导入依赖包的时候，core包要在asm包之前，否则会报错。
除了asm包之外，所有的包都要在4.0以上并且版本一致。

controller文件中的@RequestMapping(value = "/student", method = RequestMethod.GET)的student是打开项目的名称，即没有文件后缀。
web.xml文件中servlet-name做为另一个xml文件的名称<servlet-name>-servlet.xml
<servlet-name>-servlet.xml中<property name="prefix" value="/" />如果JSP文件在WEB-INF文件下，则使用“/”，如果是在WEB-INF中的JSP文件夹，则使用“/WEB-INF/jsp/”

由于spring包的版本兼容问题，建议先下载对应的spring包，在对应查找依赖
