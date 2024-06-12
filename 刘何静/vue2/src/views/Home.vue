<template>
<div>
  这是Home页面
  <p></p>
  <router-link to="/user">点击我进入用户管理页面</router-link>
  <p></p>
  <router-link to="/myUser">点击我进入新版用户管理页面</router-link>
  <p></p>
  <div>
    <el-upload
      drag
      :with-credentials="true"
      action="http://localhost:8084/file/upload"
      multiple>
      <i class="el-icon--upload"></i>
      <div class="el-icon--upload__text">将文件拖到此处，或<em>点击上传</em></div>
    </el-upload>
  </div>
</div>
</template>

<script lang="js">
export default {
  name: `Home`
}
</script>

<style scoped>

</style>

