import Vue from "vue"; //导入 Vue 模块
import VueRouter from "vue-router"; // 第二步：导入 VueRouter 模块
import User from "@/views/User.vue";
import NotFound from "@/views/NotFound.vue";
import MyUser from "@/views/MyUser.vue";
import Home from "@/views/Home.vue";


Vue.use(VueRouter); //第三步：Vue.use 安装注册
const routes = [ //定义一个路由规则数组
    {
        path: "/",
        component: Home
    },
    {
        path: "/",
        redirect:"/user"
    },
    {
        path: "/myUser",
        component: MyUser
    },

    {
        path: "/user",
        component: User
    },
    {
        path: "*", //匹配上述两条规则之外的所有路径
        component: NotFound
    }
]
const router = new VueRouter({
    routes: routes //在 VueRouter 实例中使用该路由规则数组
});
export default router; //导出此模块