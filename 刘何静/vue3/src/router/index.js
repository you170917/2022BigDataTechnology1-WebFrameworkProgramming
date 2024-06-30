import Vue from "vue"; //导入 Vue 模块
import VueRouter from "vue-router";
import NoFound from "@/views/NoFound.vue";
// 第二步：导入 VueRouter 模块

Vue.use(VueRouter); //第三步：Vue.use 安装注册

const routes = [//定义一个路由规则数组
    {
        path: "/",
        redirect:"/login"
    },
    {
        path: "*",
        component: NoFound
    },
    {
        path: "/login",
        component: () => import("@/views/Login.vue")
    },
    {
        path: "/tz",
        component: "/login"
    }
]
const router = new VueRouter({ //第四步：创建 VueRouter 对象
    routes:routes
});
export default router; //导出此模块