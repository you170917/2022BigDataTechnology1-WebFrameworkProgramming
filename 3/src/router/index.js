import Vue from "vue";  //导入 Vue 模块
import VueRouter from "vue-router";
import NotFound from "@/views/NotFound.vue";
import Home from "@/views/Home.vue";
import User from "@/views/User.vue"; // 第二步：导入 VueRouter 模块
Vue.use(VueRouter); //第三步：Vue.use 安装注册

const routes = [
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
    },
    {
        path: "/",
        component: Home
    }
]
const router = new VueRouter({  //第四步：创建 VueRouter 对象
    routes : routes
});
export default router;  //导出此模块