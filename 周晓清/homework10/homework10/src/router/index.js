import Vue from "vue"; //导入 Vue 模块
import VueRouter from "vue-router"; // 第二步：导入 VueRouter 模块
import MyUser from "@/views/MyUser.vue";
import User from "@/views/User.vue";
import NotFound from "@/views/NotFound.vue";

//第三步：Vue.use 安装注册

Vue.use(VueRouter);
const routes = [ //定义一个路由规则数组
    {
      path:"/MyUser",
        cmponent:MyUser,
      redirect:"/MyUser"
    },
    {
        path: "/user", //访问路径
        component: User //对应的组件
    },
    {
        path: "*",
        component: NotFound
    }
]
const router = new VueRouter({
    routes: routes //在 VueRouter 实例中使用该路由规则数组
});
export default router;

