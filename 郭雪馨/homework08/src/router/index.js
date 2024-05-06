import Vue from "vue"; //导入 Vue 模块
import VueRouter from "vue-router";// 第二步：导入 VueRouter 模块
import User from "@/views/User.vue";
import NotFound from "@/views/NotFound.vue";

Vue.use(VueRouter);//第三步：Vue.use 安装注册
const routers=[ //定义一个路由规则数组
    {
        path: "/",
        redirect:"/user"
    },
    {
        path:"/user",//访问路径
        component: User //对应的组件
    },
    {
        path: "*", //匹配上述两条规则之外的所有路径
        component:NotFound
    }
]
const router=new VueRouter({
    routes: routers //在 VueRouter 实例中使用该路由规则数组
});//第四步：创建 VueRouter 对象

export default router;