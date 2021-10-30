/**
 * 导入组件
 * @Author 方聪
 * @Date 2019/06/07
 * vue.element-ui.css.app.vue.vue-router/axios
 */
import Vue from 'vue';
import ElementUI from 'element-ui';
import 'element-ui/lib/theme-chalk/index.css';
import App from './App.vue';
import VueRouter from 'vue-router';
import axios from 'axios';
//设置开启devtools
Vue.config.devtools = true;
Vue.use(VueRouter);
Vue.use(ElementUI);
// Vue.use(axios);

// axios 配置
axios.defaults.timeout = 5000;
//添加了一行注解用来测试github的功能，更改了端口号为8886
axios.defaults.baseURL = 'http://localhost:8886';
Vue.prototype.axios = axios;




// Vue.prototype.$axios = axios;

//导入自定义组件,是用来显示路由组件的界面，如果不参加路由界面，那么其他的自定义组件全部写到App.vue中
//od_components 采用这样的命令为了防止之后的整合进行命令冲突，当然前期还是可以使用component，然后整合的时候rename即可

//要求1. import xx 这个xx要与文件名一致(大小写也要一致，其实命名前面也要加上od 之后改吧

//addUser界面组件
// import AddUser from './components/AddUser.vue'
// 定义router ,add.delete find 也涉及一个add界面
// var router= new VueRouter({
//   routes: [
//     {
//       // 该页面是一个命名视图，用来显示界面中的经典布局，之后可以用到
//      /* path: '/', components: {
//         default: top,
//         a: centor,
//         b: button
//       } */
//     },
//     // 路由匹配
//     {path:'/',component:APP},
//     // {path:'/addUser',component:AddUser}
//   ]
// });
// // 配置axios全局定义变量
// var axios_instance = axios.create({
//   baseURL: 'http://localhost:6066/od/',
//   timeout: 1000
// });


// vues实例，也就是全局的实例对象
new Vue({
  el: '#app',
  render: h => h(App),
  // router, // 把router进行挂载
   axios
});
