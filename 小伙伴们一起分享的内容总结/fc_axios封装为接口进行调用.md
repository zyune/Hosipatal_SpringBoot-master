# 问题描述
----
重复的代码都需要进行封装，以及需要后期更改的代码也需要进行封装
# 问题解决
1. 下载群里分享的http.js，放置在src中config包下
2. 配置main.js一些信息，具体看main.js
3. 导入axios组件
4. 更改http.js中的baseUrl

>   this.$fetch('/getU') 
            .then((response) => {
              console.log(response);
              //这个是解析json数据
              this.patient = response.data;
            })
        }

5. 调用对应的方法，以及传入url和data数据，不同的方法对应不同的请求方式，put/fetch/post的
6. 应该方法是需要执行的，created方法是一个生命周期的一个方法，它会在程序vue组件加载成功之后执行，可以借这个方法进行实现一开界面就显示数据的功能
7. ``{
  "code": "123",
  "message": "success",
  "data": {
    "state": "就诊中",
    "medical_record": "234343434",
    "name": "fc",
    "sex": "男",
    "age": "35",
    "type": "自费"
  }
}``

# 当前缺点
-----
1. 未封装api方法，并且调用方法还是又重复的代码，比如.then()。
2. axios的回复处理还未完成

# 忠告
---
现在我们仅仅进行测试，对于json数据的话我们之后需要通过采用统一返回格式的，明白执行流程即可

# 网站
mock  easymock


