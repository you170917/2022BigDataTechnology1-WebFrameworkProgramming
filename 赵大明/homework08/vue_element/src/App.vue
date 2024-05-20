<template>
  <div>
    <el-tabs type="card">
      <el-tab-pane label="查询用户">
        <el-table :data="tableData"
                  style="width: 90%;
                  margin: 0 auto;
                  margin-top: 20px;
                  margin-bottom: 20px;
                  background-color: #f2f2f2;
                  font-size: 14px;
                  font-family: Arial, sans-serif;"
        >
          <el-table-column prop="username" label="用户名"></el-table-column>
          <el-table-column prop="password" label="密码"></el-table-column>
          <el-table-column prop="address" label="地址"></el-table-column>
        </el-table>
      </el-tab-pane>
      <el-tab-pane label="新增用户">
        <el-form label-width="80px" style="width: 300px; float: left;">
          <el-form-item label="用户名">
            <el-input placeholder="请输入用户名"></el-input>
          </el-form-item>
          <el-form-item label="密码">
            <el-input type="password" placeholder="请输入密码"></el-input>
          </el-form-item>
          <el-form-item label="确认密码">
            <el-input type="password" placeholder="请确认密码"></el-input>
          </el-form-item>
          <el-form-item label="地址">
            <el-input placeholder="请输入地址"></el-input>
          </el-form-item>
          <el-form-item>
            <el-button type="primary">新增</el-button>
          </el-form-item>
        </el-form>
      </el-tab-pane>
      <el-tab-pane label="修改用户">
        <el-form label-width="80px" style="width: 300px; float: left;">
          <el-form-item label="用户名">
            <el-input placeholder="请输入用户名"></el-input>
          </el-form-item>
          <el-form-item label="密码">
            <el-input type="password" placeholder="请输入密码"></el-input>
          </el-form-item>
          <el-form-item label="确认密码">
            <el-input type="password" placeholder="请确认密码"></el-input>
          </el-form-item>
          <el-form-item label="地址">
            <el-input placeholder="请输入地址"></el-input>
          </el-form-item>
          <el-form-item>
            <el-button type="primary">修改</el-button>
          </el-form-item>
        </el-form>
      </el-tab-pane>
      <el-tab-pane label="删除用户">
        <el-form label-width="80px" style="width: 300px; float: left;">
          <el-form-item label="用户ID">
            <el-input placeholder="请输入用户ID"></el-input>
          </el-form-item>
          <el-form-item>
            <el-button type="primary">删除</el-button>
          </el-form-item>
        </el-form>
      </el-tab-pane>
    </el-tabs>
  </div>
</template>

<script>

export default {
  name: 'App',
  components: {},
  data() {
    return {
      tableData: [
        { username: '张三', password: '123456', address: '北京市' },
        { username: '李四', password: '123456', address: '北京市' },
        { username: '李四', password: '123456', address: '北京市' }
      ]
    }
  },
}
</script>

<style>

</style>
