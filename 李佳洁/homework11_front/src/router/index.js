import Vue from "vue"; //导入 Vue 模块

import VueRouter from "vue-router";
import User from "@/views/User.vue";
import NotFound from "@/views/NotFound.vue";
import Home from "@/views/Home.vue";
import MyUser from "@/views/MyUser.vue";
import Login from "@/views/Login.vue"; // 第二步：导入 VueRouter 模块

Vue.use(VueRouter); //第三步：Vue.use 安装注册
const routes = [
    {
        path: "/myUser",
        component: MyUser
    },
    {
        path: "/home",
        component: Home
    },
    {
        path: "/",
        component: Login
    },

    {
        path: "/",
        redirect:"/user"
    },

    {
        path: "/user",
        component: User
    },
    {
        path: "*",
        component: NotFound
    }

]
const router = new VueRouter({ //第四步：创建 VueRouter 对象
    routes: routes //在 VueRouter 实例中使用该路由规则数组
});
export default router; //导出此模块