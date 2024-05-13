import Vue from "vue"; //导入 Vue 模块
import VueRouter from "vue-router";
import User from "@/views/User.vue";
import NotFound from "@/views/NotFound.vue";
import MyUser from "@/views/MyUser.vue";
import Home from "@/views/Home.vue"; // 第二步：导入 VueRouter 模块

Vue.use(VueRouter); //第三步：Vue.use 安装注册

const routes=[
    {
        path:"/user",
        component:User
    },
    {
        path: "/",
        redirect:"/home"
    },
    {
        path: "*",
        component: NotFound
    },
    {
        path: "/myUser",
        component:MyUser
    },
    {
        path: "/home",
        component: Home
    }
]

const router = new VueRouter({ //第四步：创建 VueRouter 对象
    routes:routes
});

export default router; //导出此模块