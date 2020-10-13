# gmall2020
## 通用mapper配置
### 适合单表查询
#### 配置步骤：
    第一步： 导入依赖
      <!-- 通用mapper -->
            <dependency>
                <groupId>tk.mybatis</groupId>
                <artifactId>mapper-spring-boot-starter</artifactId>
                <version>1.2.3</version>
                <exclusions>
                    <exclusion>
                        <groupId>org.springframework.boot</groupId>
                        <artifactId>spring-boot-starter-jdbc</artifactId>
                    </exclusion>
                </exclusions>
            </dependency>
    第二步：将mapper包下面的接口继承tk包下的Mapper<T>,参数T是泛型，一般指返回的实体类型
    例如：  
    public interface UmsMemberMapper extends Mapper<UmsMember> {
       
    }  
    第三步：修改service层调用者，让他不在调用原来接口中的方法，而是通用mapper的方法
    第四步：修改主类的mapper扫描器。
    使用的是tk包下的MapperScan
    @MapperScan(basePackages = "com.tff.gmall.user.mapper")    