<template>
  <div>
    这是 home 页面
    <p></p>
    <router-link to="/user">点击我进入用户管理页面</router-link>
    <p></p>
    <router-link to="/myUser">点击我进入新版用户管理页面</router-link>


  </div>
</template>



<template>
  <div>
    这是 home 页面
    <p></p>
    <router-link to="/user">点击我进入用户管理页面</router-link>
    <p></p>
    <router-link to="/myUser">点击我进入新版用户管理页面</router-link>
  </div>
</template>
<script>
export default {
  name: "Home"
}
</script>
<style scoped>
</style>



<script>


export default {
  // eslint-disable-next-line vue/multi-word-component-names
  name: "User",
  data(){
    return{
      users:null,
      queryId:null,
      userById:null,
      address:null,
      id:null,
      deleteId:null
    }
  }
}
</script>

<style scoped>


</style>
