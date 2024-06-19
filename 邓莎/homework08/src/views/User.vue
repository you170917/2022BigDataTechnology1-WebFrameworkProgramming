<template>
  <div>
    <div>用户管理界面</div>
    <button v-on:click="getAllUsers">获取所有用户信息</button>
    <div v-for="user in users" v-bind:key = user.id>
      {{user}}
    </div>

    <p></p>

    <div>
      请输入你需要查询的用户ID:
      <input v-model="queryId">
    </div>
    <button v-on:click="getUserById">通过id获取指定用户</button>
    <div>{{userById}}</div>

    <p></p>

    <div>
      请输入要添加的用户信息：
      <div>
        name
        <input v-model="addUserParams.username">
      </div>
      <div>
        age
        <input v-model="addUserParams.age">
      </div>
      <div>
        gender
        <input v-model="addUserParams.gender">
      </div>
    </div>
    <button v-on:click="addUser">添加用户</button>

    <p></p>

    <div>
      请输入要修改的用户信息：
      <div>
        id
        <input v-model="updateUserParams.id">
      </div>
      <div>
        name
        <input v-model="updateUserParams.username">
      </div>
      <div>
        age
        <input v-model="updateUserParams.age">
      </div>
      <div>
        gender
        <input v-model="updateUserParams.gender">
      </div>
    </div>
    <button v-on:click="updateUser">修改用户</button>

    <p></p>

    <div>
      请输入删除用户的id：
      <input v-model = "deleteId">
      <div>
        <button v-on:click="deleteUser">删除用户</button>
      </div>
    </div>

  </div>
</template>

<script>


import user from "@/views/User.vue";

export default {
  name: "User",
  computed: {
    user() {
      return user
    }
  },
  data(){
    return{
      addUserParams: {
        username: null,
        age: null,
        gender:null,
      },
      updateUserParams: {
        id: null,
        username: null,
        age: null,
        gender:null,
      },
      users:null,
      queryId:null,
      userById:null,
      username:null,
      age:null,
      gender:null,
      id:null,
      deleteId:null,
    }
  },
  methods: {
    getAllUsers() {
      // axios.get("http://localhost:8081/AllUsers")
      //     .then(resp => {
      //       console.log(resp);
      //       this.users = resp.data;
      //     })
      this.getRequest("/AllUsers").then(resp => {
        console.log(resp);
        if(resp.status == 200){
          this.users = resp.data.data;
        }else {
          alert(resp.data.msg)
        }
      })
    },
    getUserById() {
      // axios.get('http://localhost:8081/user/${this.queryId}')
      //     .then(resp => {
      //       console.log(resp);
      //       this.userById = resp.data;
      //     })
        this.getRequest('/user/${this.queryId}').then(resp =>{
            console.log(resp);
            if(resp.status == 200){
              this.userById = resp.data.data;
            }else {
              alert(resp.data.msg);
            }
      })
    },
    addUser(){
      // axios.post("http://localhost:8081/user",
      //     {
      //       name: this.name,
      //       age: this.age,
      //       gender: this.gender
      //     })
      //     .then(resp => {
      //       console.log(resp);
      //     })
      this.postRequest("/user",{
          username: this.addUserParams.username,
          age: this.addUserParams.age,
          gender:this.addUserParams.gender
      }).then(resp => {
      console.log(resp)
      })
    },
    updateUser() {
      // axios.put("http://localhost:8081/user",
      //     {
      //       id: this.id,
      //       username: this.name,
      //       age: this.age,
      //       gender: this.gender
      //     })
      //     .then(resp => {
      //       console.log(resp);
      //     })
        this.putRequest("/user",{
          id: this.updateUserParams.id,
          username: this.updateUserParams.name,
          age: this.updateUserParams.age,
          gender: this.updateUserParams.gender
        }).then(resp => {
        console.log(resp);
        })
    },
    deleteUser() {
      // axios.delete("http://localhost:8081/user",
      //     {
      //       params: {
      //         id: this.deleteId
      //       }
      //     })
      //     .then(resp => {
      //       console.log(resp);
      //     })
          this.deleteRequest("/user",{
          id: this.deleteId
        }).then(resp => {
        console.log(resp);
        })
    }
  }
}
</script>

<style scoped>

</style>