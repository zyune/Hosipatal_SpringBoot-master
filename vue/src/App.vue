<template>
  <div id="app">
    <!--1.加载find input表单内容进行查询数据-->
    <el-form :inline="true" :model="formInline" class="demo-form-inline">
      <el-form-item label="用户姓名">
        <el-input v-model="formInline.userName" placeholder="姓名"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="findUserByName_onSubmit">查询</el-button>
        <el-button type="success" @click="listUser_onClick">成功按钮</el-button>
      </el-form-item>
    </el-form>


    <!--加载一个table，进行显示数据，并且在table中使用delete图标进行删除数据-->
    <el-table :data="listUser" style="width: 100%">
      <!--组件实例的作用域是孤立的。这意味着不能(也不应该)在子组件的模板内直接引用父组件的数据。-->
      <!--要让子组件使用父组件的数据，我们需要通过子组件的props选项。-->
      <el-table-column prop="date" label="日期" width="180"></el-table-column>
      <el-table-column prop="name" label="姓名" width="180"></el-table-column>
      <el-table-column prop="adderst" label="地址"></el-table-column>
    </el-table>

    <el-button type="success" @click="loginUser_onClick">先进行登陆</el-button>
  </div>

</template>
<!--导入HelloWorld.vue-->
<script>

  //一个Vue文件加载多个Vue对象。只能export一个对象，而其他的作为该对象的模板，但是不建议这样做，可以创建一个新的vue进行
  //声明，当然你也可以使用这个匿名内部类
  /*import Vue from 'vue';
  Vue.component('button-counter',{
    data:function(){
      return{
        dat:'fdf'
      }
    },
    template:'<button>you clickme {{this.dat}}dd</button>'
  });*/

  export default {
  name: 'App',
    data() {
      return {
        formInline: {
          userName: ''
        },
        listUser:[]
      }
    },
    methods:{
      findUserByName_onSubmit() {
          //进行axios.get请求进行 find查询数据
          // 可选地，上面的请求可以这样做。
          // 强制使用params进行传入参数格式
          this.axios.get('/od/findUserByName', {
            params: {
              name: this.username
            }
          })
          // 执行异步回调，请注意回调协同操作
            .then(function (response) {
              // 在vue.resource中返回的数据应该为response.data ，并且不是json格式，
              // 但是在axios中是自动解析json格式的哦！
              // 加载到listUser数据中
            this.listUser = response.data.data;

            })
            // 这个是异常处理，没必要写的
            .catch(function (error) {
              console.log(error);
            });
        },
      listUser_onClick() {
        //使用axios.get请求在vue中create生命周期函数进行加载
        var _this = this;
        this.axios.get('/od/listUser')
        // 执行异步回调，请注意回调协同操作
          .then(function (response) {
            // 在vue.resource中返回的数据应该为response.data ，并且不是json格式，
            // 但是在axios中是自动解析json格式的哦！
            // 加载到

            console.log(response);
            _this.listUser = response.data.data;
            console.log(_this.listUser);
            console.log(response.data)

          })
          // 这个是异常处理，没必要写的
          .catch(function (error) {
            console.log(error);
          });
      },
      loginUser_onClick (){
        //使用axios.get请求在vue中create生命周期函数进行加载
        this.axios.get('/login',{
          params:{
            username:'fc',
            password:123456
          }

        })
        // 执行异步回调，请注意回调协同操作
          .then(function (response) {
            // 在vue.resource中返回的数据应该为response.data ，并且不是json格式，
            // 但是在axios中是自动解析json格式的哦！
            // 加载到
            console.log(response);
          })
          // 这个是异常处理，没必要写的
          .catch(function (error) {
            console.log(error);
          });
      }
    },
    created() {
      //这是遇到的第二个生命周期函数
      this.listUser_onClick();
      //在created中，data和methods都已经初始化好了
      //如果要调用methods中的方法，最早只能在created中操作
    }
  }
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
