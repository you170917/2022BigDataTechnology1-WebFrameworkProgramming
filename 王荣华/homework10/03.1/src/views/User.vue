
<template>
  <div>
    <div>这是用户管理的页面~</div>
<!--    查询所有用户-->
    <button v-on:click="getAllUser">获取所有用户信息</button>
    <div v-for="user in users" v-bind:key ="user.id">
      {{user}}
    </div>
    <p></p>
<!--    通过id查询用户-->

      <div>
      请输入要查询用户的id：
      <input v-model="queryId">
      </div>

      <button v-on:click ="getUserById">通过id获得指定用户信息</button>

      <div>{{userById}}</div>
      <p></p>
<!--    添加用户-->
      <div>
          请输入要添加的用户信息
          <div>
            id:
            <input v-model="addUserParams.id">
          </div>
          <div>
            username:
            <input v-model="addUserParams.username">
          </div>
          <div>
            password:
            <input v-model="addUserParams.password">
          </div>

      </div>
      <button v-on:click="addUser">添加用户</button>
      <p></p>
<!--    修改用户-->
      <div>
        请输入要修改用户的信息：
        <div>
          id:
          <input v-model="updateUserParams.id">
        </div>
        <div>
          username:
          <input v-model="updateUserParams.username">
        </div>
        <div>
          password:
          <input v-model="updateUserParams.password">
        </div>
      </div>
    <button v-on:click="updateUser">修改用户</button>
    <p></p>
<!--    删除用户id-->
    <div>
      <input v-model="deleteId">
    </div>
    <button v-on:click="deleteUser">删除用户</button>
    </div>


</template>

<script>
import axios from "axios";

export default {
  name: "User",
  data(){
    return{
      users: null,
      queryId: null,
      userById: null,
      addUserParams:{
        id: null,
        username: null,
        password: null,
      },
      updateUserParams:{
        id: null,
        username: null,
        password: null,
      },
      deleteId: null
    }
  },
  // // 查询所有用户方法
  // methods:{
  //   getAllUser(){
  //     axios.get("http://localhost:8082/AllUser")
  //         .then(resp => {
  //           console.log(resp);
  //           this.users = resp.data;
  //         })
  //   },
  //   getUserById(){
  //     axios.get(`http://localhost:8082/Query/${this.queryId}`)
  //         .then(resp => {
  //           console.log(resp);
  //           this.userById = resp.data;
  //         })
  //   },
  //   addUser(){
  //     axios.post(`http://localhost:8082/UserAdd`,
  //     {
  //             id: this.id,
  //             username: this.username,
  //             password: this.password
  //
  //     }).then(resp => {
  //           console.log(resp);
  //         })
  //   },
  //   updateUser(){
  //     axios.put(`http://localhost:8082/UserUpdate`,
  //         {
  //           id: this.id,
  //           username: this.username,
  //           password: this.password
  //         }).then(resp => {
  //           console.log(resp);
  //     })
  //   },
  //   deleteUser(){
  //     axios.delete(`http://localhost:8082/UserDelete`,{
  //         params: {
  //           id: this.deleteId
  //         }
  //       }).then(resp => {
  //         console.log(resp);
  //     })
  //   }
  //
  // },

//由于前端的数据格式变化，所以
  methods: {
    // getAllUser(){
    //   this.getRequest("/AllUser").then(resp => {
    //     console.log(resp);
    //     this.users = resp.data;
    //   })
    // },
    // getUserById(){
    //   this.getRequest(`/Query/${this.queryId}`).then(resp => {
    //     console.log(resp);
    //     this.userById = resp.data;
    //   })
    // },
//由于后端数据格式的改变，前端接受方式也需要做出小改变
    getAllUser(){
      this.getRequest("/AllUser").then(resp => {
        console.log(resp);
        if (resp.status === 200){
          this.users = resp.data.data; //通过 resp.data.data 拿到返回数据
        }else {
          alert(resp.data.msg);
        }
      })
    },
    getUserById(){
      this.getRequest(`/Query/${this.queryId}`).then(resp => {
        console.log(resp);
        if (resp.status === 200){
this.userById = resp.data.data;
        }else {
          alert(resp.data.msg);
        }
      })
    },
    addUser(){
      this.postRequest("/UserAdd", {
        id: this.addUserParams.id,
        username: this.addUserParams.username,
        password: this.addUserParams.password,
      }).then(resp => {
        console.log(resp)
      })
    },
    updateUser(){
      this.putRequest("/UserUpdate", {
        id: this.updateUserParams.id,
        username: this.updateUserParams.username,
        password: this.updateUserParams.password,
      }).then(resp => {
        console.log(resp);
      })
    },
    deleteUser(){
      this.deleteRequest("/UserDelete", {
id: this.deleteId
    }).then(resp => {
        console.log(resp);
      })
    }
  }
//   如上所示，对 axios 网络请求方法进行封装有两个明显的好处：
// 1. 如果后端地址更改，只需要修改 api.js 文件即可；
// 2. 封装一次就可以多次使用，尤其是在网络接口很多的时候，精简了代码。

}
</script>

<style scoped>

</style>