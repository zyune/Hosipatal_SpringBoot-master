
## 问题
* post\get\postj\head\put等请求方式有什么用途？
* 跨域请求问题(已经解决）
## 实现restful 请求
* 第一步，在main.js中导入需要的组件，并且vue注册
* 第二步，编写对应的component,然后在appvue中使用router和axios进行处理，然后显示数据
## npm常用的命令介绍
npm/cnpm install axios (-s)(-s / -g 表明是安装到该项目还是全局，如果安装在全局中，那么直接在package.json中写入依赖即可）该命令是安装对应的组件
"axios": "^0.19.0" 如果依赖中没有这个 ，那么-g安装下 加下这个依赖即可
## 本次操作是要实现一种restful 风格的crud
要使用的额外组件为：element-ui ui组件
axios ajax pormist的异步请求的ajax方法，然后我们进行get/post(但是不能解决跨域访问，所以统一使用JSONP请求方式，并且post
post请求需要设置为一般的表单请求方式。
使用router 路由机制使用单页面跳转，并且跳转的方式是RestFUl 形式。
vuex是一种全局处理共享数据的一个组件，通常使用在二个不同的组件中进行数据绑定，数据可以进行同步
filter 是method的一种过滤，常常可以结合管道进行使用，用来处理变量属性
watch . create  method watch是一种监听器，可以用来监听组件的改变，create是一个vue中一个生命周期的一个方法，是已经说明
vue中的data和method已经被加载成功，这个时候我们就可以使用你axios进行异步请求数据，并且绑定到数据中的变量中即可。
computed computed是一种计算属性的一种方法，是一种计算data中的属性的一种方法，并且是返回一个value值，html中直接使用v-mode进行绑定
只要计算属性，这个function内部中的数据发生了变化，就会直接进行触发，并且直接更新数据。
//总结
webpack是一种处理工具，能够把js不同的文件格式进行转换为js文件，并且可以使用ES6表达式，通过webpack进行编译，成为一个bulid.js,而且还能实现图片压缩等功能，使得一次请求全部加载，
传统的<script>是会进行多次请求。

//APP.vue是程序的界面展示的主界面
//main.js主要是用来Vue注册其他组件，使得能够可以在Vue中显示，并且实例化一个vue对象
//在vue ES6表达式中 对象的定义为 new  Object({})  在{}中可以定义方法和属性
//vue组件模块式开发中，我们必须得 export default 对外进行暴露，并且组件中的data要为一个对象return返回格式
// 需要在app.vue中import xxx from  "xxxx.vue"导入进来，而且需要在export default 组件对象中定义components


1. 定义一个组件 ，需要使用template <div>进行包裹
