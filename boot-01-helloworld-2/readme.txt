yml
作用：类似application.properties，可以给属性赋值，
语法：
● key: value；kv之间有空格
● 大小写敏感
● 使用缩进表示层级关系
● 缩进不允许使用tab，只允许空格
● 缩进的空格数不重要，只要相同层级的元素左对齐即可
● '#'表示注释
● 字符串无需加引号，如果要加，''与""表示字符串内容 会被 转义/不转义

说明：
要先在javabean上标注
@ConfigurationProperties(prefix = "person")
@Component

然后在application.yml中设置属性默认值
person:
  k: v  #字面量写法
  k: {k1:v1,k2:v2,k3:v3}    #对象写法
  #或
  k:
  	k1: v1
    k2: v2
    k3: v3

  #行内写法：  k: [v1,v2,v3] #对象写法
  #或者
  k:
   - v1
   - v2
   - v3