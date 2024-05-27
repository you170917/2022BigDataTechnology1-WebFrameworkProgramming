<script >
import { onMounted } from 'vue'
import axios from "axios";
export default {
  data(){
    return{
      req:{
        page: 1,
        limit: 10
      },
      DataList: [],
      TotalNums: 0,
    }
  },
  methods:{
    async GetUserList(){
      console.log('获取用户列表')
      await axios.post("/api/user/list",{...this.req}).then(res=>{
        if (res.status === 200) {
          for (let i = 0; i < res.data.data.length; i++) {
            this.DataList.push(JSON.parse(res.data.data[i]))
          }
          this.TotalNums = res.data.total
        }else{
          alert('获取用户列表失败')
        }
      }).catch(err=>{
        console.log(err)
      })
    }
  },
  onMounted(){
    console.log('mounted')
  }
}
</script>

<template>
  <header>
    <h2>用户页面</h2>
  </header>
  <main>
    <div>
      <ul>
        <li>id</li>
        <li>name</li>
        <li>age</li>
      </ul>
      <div v-for="idx in this.DataList">
        <ul>
          <li>{{idx.id}}</li>
          <li>{{idx.name}}</li>
          <li>{{idx.age}}</li>
        </ul>
      </div>
    </div>

  </main>
</template>

<style>
  header {
    position: fixed;
    left: 0;
    top: 0;
    width: 100%;
    min-width: 1024px;
    height: 70px;
    box-shadow: -1px 1px 1px 1px rgba(0, 0, 0, 0.1);
    h2{
      margin: 0;
      padding: 0;
      left: 5%;
      position: absolute;
      line-height: 70px;
      text-align: center;
    }
  }
  main {
    position: absolute;
    top: 70px;
  }
  ul {
    display: flex;
    justify-content: space-around;
    list-style: none;
    padding: 20px;
    margin: 0;
    li {
      width: 200px;
      text-align: center;
      border: 1px solid #000;
      border-radius: 10px;
    }
  }
</style>
