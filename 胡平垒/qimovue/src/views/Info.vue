<script setup>

</script>

<template>
  <div>
    请输入要添加的用户信息：
    <div>
      username
      <input v-model="addUserParams.username">
    </div>
    <div>
      address
      <input v-model="addUserParams.address">
    </div>
  </div>
  <button v-on:click="addUser">添加用户</button>
  <div>
    id
    <input v-model="updateUserParams.id">
  </div>
  <div>
    username
    <input v-model="updateUserParams.username">
  </div>
  <div>
    address
    <input v-model="updateUserParams.address">
  </div>
  <button v-on:click="updateUser">修改用户</button>
</template>

<style scoped>

</style>